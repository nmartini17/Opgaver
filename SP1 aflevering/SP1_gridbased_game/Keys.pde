class Keys {
  
  //Egenskaber
  boolean wDown = false;
  boolean aDown = false;
  boolean sDown = false;
  boolean dDown = false;
  
  boolean upArrowDown = false;
  boolean leftArrowDown = false;
  boolean downArrowDown = false;
  boolean rightArrowDown = false;
  
  //Konstruktør
  Keys() {
  }
  
  //Metoder
  void onKeyPressed(char k) {
    //player 1 controls
    if(k=='w' || k=='W') {
      wDown = true;
    }
    if(k=='a' || k=='A') {
      aDown = true;
    }
    if(k=='s' || k=='S') {
      sDown = true;
    }
    if(k=='d' || k=='D') {
      dDown = true;
    }
    //player 2 controls
    if(key == CODED) {
      if(keyCode == UP) {
        upArrowDown = true;
      }
      if(keyCode == LEFT) {
        leftArrowDown = true;
      }
      if(keyCode == DOWN) {
        downArrowDown = true;
      }
      if(keyCode == RIGHT) {
        rightArrowDown = true;
      }
    }
  }
    
  void onKeyReleased(char k) {
    if(k=='w' || k=='W') {
      wDown = false;
    }
    if(k=='a' || k=='A') {
      aDown = false;
    }
    if(k=='s' || k=='S') {
      sDown = false;
    }
    if(k=='d' || k=='D') {
      dDown = false;
    }
    if(key == CODED) {
      if(keyCode == UP) {
        upArrowDown = false;
      }
      if(keyCode == LEFT) {
        leftArrowDown = false;
      }
      if(keyCode == DOWN) {
        downArrowDown = false;
      }
      if(keyCode == RIGHT) {
        rightArrowDown = false;
      }
    }
  }
  
}
