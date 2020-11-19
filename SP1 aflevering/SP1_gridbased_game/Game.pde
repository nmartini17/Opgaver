class Game {

  //Egenskaber
  int w;
  int h;
  int numberOfEnemies;
  int numberOfFoods;
  int playerLife;
  int playerLife2;
  int playerLifeMax=100;
  int[][]board;
  Keys keys;
  Dot player;
  Dot player2;
  Dot[] enemies;
  Dot[] food;

  //Konstruktør
  Game(int gW, int gH, int nE, int nF) {
    w = gW;
    h = gH;
    numberOfEnemies = nE;
    numberOfFoods = nF;
    enemies = new Dot[nE];
    keys = new Keys();
    playerLife=100;
    playerLife2=100;
    board = new int[gW][gH];
    player = new Dot(0, 1, w-1, h-1);
    player2 = new Dot(0, 1, w-1, h-1);
    food = new Dot[nF];
    
    //Initialiserer Enemies
    for (int i=0; i<nE; i++) {
      enemies[i] = new Dot(w-1, h-1, w-1, h-1);
    }
    
    //Initialiserer Food
    for (int i=0; i<nF; i++) {
      food[i] = new Dot((int) random(w-1), (int) random(h-1), w-1, h-1);
    }
  }

  //Metoder

  int[][] getBoard() {
    return board;
  }

  int getWidth() {
    return h;
  }

  int getHeight() {
    return w;
  }

  int getPlayerLife() {
    return playerLife;
  }
  
  int getPlayerLife2() {
    return playerLife2;
  }
  
    void onKeyPressed(char k) {
    keys.onKeyPressed(k);
  }
  
  void onKeyReleased(char k) {
    keys.onKeyReleased(k);
  }

  void update() {
    updatePlayers();
    greenFood();
    updateEnemies();
    checkForCollisions();
    clearBoard();
    populateBoard();
  }
  
  void updatePlayers() {
    //Update player 1
    if (keys.wDown) {
      player.moveUp();
    }
    if (keys.aDown) {
      player.moveLeft();
    }
    if (keys.sDown) {
      player.moveDown();
    }
    if (keys.dDown) {
      player.moveRight();
    }
    
    //Update player 2
    if (keys.upArrowDown) {
      player2.moveUp();
    }
    if (keys.leftArrowDown) {
      player2.moveLeft();
    }
    if (keys.downArrowDown) {
      player2.moveDown();
    }
    if (keys.rightArrowDown) {
      player2.moveRight();
    }
  }
  

  void greenFood() {
    for (int i=0; i<food.length; i++) {
      if (i>=0) {
        //Regner vi positionen ud for player ift. food
        int dX = player.getX() - food[i].getX();
        int dY = player.getY() - food[i].getY();
        if (dX>0) {
          //Få food til at bevæge sig mod højre
          food[i].moveLeft();
          //Få food til at bevæge sig mod venstre
        } else if (dX<0) {
          food[i].moveRight();
          //Få food til at bevæge sig ned
        } else if (dY>0) {
          food[i].moveUp();
          //Få food til at bevæge sig op
        } else if (dY<0) {
          food[i].moveDown();
        }
        int dX2 = player2.getX() - food[i].getX();
        int dY2 = player2.getY() - food[i].getY();
        if (dX2>0) {
          //Få food til at bevæge sig mod højre
          food[i].moveLeft();
          //Få food til at bevæge sig mod venstre
        } else if (dX2<0) {
          food[i].moveRight();
          //Få food til at bevæge sig ned
        } else if (dY2>0) {
          food[i].moveUp();
          //Få food til at bevæge sig op
        } else if (dY2<0) {
          food[i].moveDown();
        }
      }
    }
  }
  
  void updateEnemies() {
    for (int i=0; i<enemies.length; i++) {

      if (i>=0) {
        //Regner positionen ud for player
        int dX = player.getX() - enemies[i].getX();
        int dY = player.getY() - enemies[i].getY();
        if (dX>0) {
          //Få enemies til at bevæge sig mod højre
          enemies[i].moveRight();
          //Få enemies til at bevæge sig mod venstre
        } else if (dX<0) {
          enemies[i].moveLeft();
          //Få enemies til at bevæge sig ned
        } else if (dY>0) {
          enemies[i].moveDown();
          //Få enemies til at bevæge sig op
        } else if (dY<0) {
          enemies[i].moveUp();
        }
        //Regner positionen ud for player2
        int dX2 = player2.getX() - enemies[i].getX();
        int dY2 = player2.getY() - enemies[i].getY();
                if (dX2>0) {
          //Få enemies til at bevæge sig mod højre
          enemies[i].moveRight();
          //Få enemies til at bevæge sig mod venstre
        } else if (dX2<0) {
          enemies[i].moveLeft();
          //Få enemies til at bevæge sig ned
        } else if (dY2>0) {
          enemies[i].moveDown();
          //Få enemies til at bevæge sig op
        } else if (dY2<0) {
          enemies[i].moveUp();
        }
      }
      //Randomizer enemies movement
      int rand = (int) random(4);
      if (rand == 0) {
        enemies[i].moveUp();
      }
      if (rand == 1) {
        enemies[i].moveDown();
      }
      if (rand == 2) {
        enemies[i].moveRight();
      }
      if (rand == 3) {
        enemies[i].moveLeft();
      }
    }
  }

  void checkForCollisions() {
    //Hvis player er sammen sted som enemy, er der kollision.
    //Vi skal spørge om fjenden er det samme sted som player
    for (int i=0; i<enemies.length; i++) {
      if (enemies[i].getX() == player.getX() && enemies[i].getY() == player.getY()) {
        //fjern et liv fra playerLife, hvis x og y koordinaterne for player og enemies er det samme
        playerLife--;
        if(playerLife<=0) {
          playerLife=0;
        }
      } 
      //Player 2
      if (enemies[i].getX() == player2.getX() && enemies[i].getY() == player2.getY()) {
        playerLife2--;
        if(playerLife<=0) {
          playerLife=0;
        }
      }
    }
      //Tjekker om food-objektet er det samme sted som player
    for (int i=0; i<food.length; i++) {
        //Hvis de er det, så er der kollision
        if (food[i].getX() == player.getX() && food[i].getY() == player.getY()) {
          //Giv player 1 liv mere
          playerLife++;
          //Når der er kollision, så erstatter det gamle dot-objekt, fordi vi har sat x,y til random
          food[i]= new Dot((int) random(w-1), (int) random(h-1), w-1, h-1);
          //Hvis spiller har 100 liv, så sæt playerLifeMax til playerLife
          if (playerLife>=playerLifeMax) {
            playerLife=playerLifeMax;
          }
        }
        //Player 2
        if (food[i].getX() == player2.getX() && food[i].getY() == player2.getY()) {
          playerLife2++;
          food[i]= new Dot((int) random(w-1), (int) random(h-1), w-1, h-1);
          if (playerLife2>=playerLifeMax) {
            playerLife2=playerLifeMax;
          }
        }
      }
    }


  void clearBoard() {
    for (int y=0; y<h; y++) {
      for (int x=0; x<w; x++) {
        board[x][y]=0;
      }
    }
  }

  void populateBoard() {
    //indsæt player
    board[player.getX()][player.getY()] = 1;
    board[player2.getX()][player2.getY()] = 5;
    for (int i=0; i<enemies.length; i++) {
      board[enemies[i].getX()][enemies[i].getY()] = 2;
    }
    for (int i=0; i<food.length; i++) {
      board[food[i].getX()][food[i].getY()] = 4;
    }
  }
}
