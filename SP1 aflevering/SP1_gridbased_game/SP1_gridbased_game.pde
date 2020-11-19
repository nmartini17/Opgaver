Game game;

void setup() {
  size(1001, 1001);
  frameRate(10);
  game = new Game(25, 25, 5, 5);
}


void draw() {
  game.update();
  background(0);
  int[][] board = game.getBoard();
  for (int y=0;y<game.getHeight();y++) {
    for (int x=0;x<game.getWidth();x++) {
      if (board[x][y]==1) {
        println("player found " + x + " " + y);
        fill(0,0,255);
      } if (board[x][y]==5) {
        println("player 2 found " + x + " " + y);
        fill(69,42,120);
      } else if (board[x][y]==2) {
        fill(255,0,0);
      } else if (board[x][y]==4) {
        fill(0,255,0);
      } else if (board[x][y]==3) {
        fill(0,255,0);
      } else if (board[x][y]==0) {
        fill(0,0,0);
      } 
      
      if(game.getPlayerLife()==0) {
        board[game.player.getX()][game.player.getY()]=0;
      }
      
      if(game.getPlayerLife2()==0) {
        board[game.player2.getX()][game.player2.getY()]=0;
      }
      stroke(100,100,100);
      rect(x*40,y*40,40,40);
    }
  }
    fill(255);
    text("Player 1 Life: "+game.playerLife,25,25);
    text("Player 2 Life: "+game.playerLife2,850,25);
}

void keyPressed() {
  game.onKeyPressed(key);
}

void keyReleased() {
  game.onKeyReleased(key);
}
