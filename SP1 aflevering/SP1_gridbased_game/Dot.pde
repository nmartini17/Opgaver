class Dot {
  
  //Egenskaber
  int xPos;
  int yPos;
  int xMax;
  int yMax;
  
  //Konstruktører
  Dot(int x, int y, int xM, int yM) {
    xPos=x;
    yPos=y;
    xMax=xM;
    yMax=yM;
  }
  
  //Metoder
  
  void moveUp() {
    yPos--;
    if(yPos < 0) {
      yPos = 0;
    }
  }
  
  void moveDown() {
    yPos++;
    if(yPos > yMax) {
      yPos = yMax;
    }
  }
  
  void moveRight() {
    xPos++;
    if(xPos > xMax) {
      xPos = xMax;
    }
  }
  
  void moveLeft() {
    xPos--;
    if(xPos < 0) {
      xPos = 0;
    }
  }
  
  int getX() {
    return xPos;
  }
  
  int getY() {
    return yPos;
  }
}
