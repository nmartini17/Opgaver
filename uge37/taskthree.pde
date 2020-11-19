//3.a Draw a traffic light using colors stored in variables - one for each of the 4 colors (background is the 4th).
//3.b add a gray color for the turned off effect
//3.c have the light turn on/off (green or red) by pressing keys on the keyboard

void setup () {
  size(300,600);
  background(0);
  fill(0);
  rect(10,10,100,350);
  
  fill(150);
  ellipse(150,100,150,150);
  ellipse(150,275,150,150);
  ellipse(150,450,150,150);
}
  

void draw () {
}
  
void keyPressed() {
  
  
  if (key == '1') {
    setup();
    fill(255,0,0);
    ellipse(150,100,150,150);
  }
  if (key == '2') {
    setup();
      fill(250,255,13);
      ellipse(150,275,150,150);
    }
  if (key == '3') {
    setup();
        fill(0,255,0);
        ellipse(150,450,150,150);
      }
    if (key == '4') {
        fill(255,255,0);
        ellipse(150,275,150,150);
      }
      
}
