// Debugging 1
/*void setup() 
 {
 MyClass myclass = new MyClass();    
 }
 */
//Debugging 2
/*void setup() {
 println("Jobs done!");
 }
 */
//Debugging 3
/*
boolean jobsDone = true;
 
 void setup() {
 if (isJobDone()) {
 println("Job's done!");   
 }
 }
 
 boolean isJobDone()
 {
 return jobsDone;    
 }
 */
//Debugging 4
/*
boolean jobsDone = true;
 
 void setup()
 {
 if (isJobDone())
 {
 println("Job's done!");   
 }
 }
 
 boolean isJobDone()
 {
 return jobsDone;    
 }
 */
//Debugging 5
/*boolean jobsDone = true;
 
 void setup()
 {
 if (isJobDone())
 {
 println("Job's done!");
 }
 }
 
 boolean isJobDone()
 {
 return jobsDone;    
 }
 */
//Debugging 6
/*
boolean jobsDone = true;
 
 void setup()
 {
 
 println(getRandomNumber(0, 10));
 if (isJobDone())
 {
 println("Job's done!");   
 }
 }
 
 boolean isJobDone()
 {
 return jobsDone;    
 }
 
 int getRandomNumber(int min, int max) 
 {
 return (int)random(min, max);
 }
 */
//Debugging 7
/*
boolean jobsDone = true;
 
 void setup()
 {
 int myArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
 println(getSumOfElementsInArray(myArray));
 
 if (isJobDone())
 {
 println("Job's done!"); 
 }
 }
 
 int getSumOfElementsInArray(int[] arr) {
 int sum = 0;
 for (int i = 0; i < arr.length; i++) {
 sum =+ arr[i];
 }
 return sum;
 }
 
 boolean isJobDone()
 {
 return jobsDone;    
 }
 */
//Debugging 8
/*
boolean jobsDone = true;
 
 void setup()
 {
 println(isValueGreaterThanThreshold(10, 5));
 println(isValueGreaterThanThreshold(4, 8));
 
 if (isJobDone())
 {
 println("Job's done!"); 
 }
 }
 
 boolean isValueGreaterThanThreshold(int value, int threshold) 
 {
 if (value > threshold) 
 {
 return true;                
 }
 return false;
 }
 
 boolean isJobDone()
 {
 return jobsDone;    
 }
 */
//Debugging 9
/*
boolean jobsDone = true;
 
 void setup()
 {
 int myArray[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1};
 print(getSumOfAllElementsInArray(myArray));
 
 if (isJobDone())
 {
 println("Job's done!"); 
 }
 }
 
 boolean isJobDone()
 {
 return jobsDone;    
 }
 
 int getSumOfAllElementsInArray(int[] arr) 
 {
 int sum = 0; 
 for (int i = 0; i < arr.length; i++)
 {
 sum += arr[i];
 }
 return sum;
 }
 */
//Debugging 10
boolean jobsDone = true;

void setup()
{
  size(1000, 1000);
  drawGrid(15, 15, 40);

  if (isJobDone())
  {
    println("Job's done!");
  }
}

void draw() {
}
boolean isJobDone()
{
  return jobsDone;
}

void drawGrid(int numberOfHorizontalCells, int numberOfVerticalCells, int cellSideLength) {
  for (int x = 0; x < numberOfHorizontalCells; x++) {
    for (int y = 0; y < numberOfVerticalCells; y++) {
      if (x == 5 && y == 8) {
        fill(255, 0, 0);
      } else {
        fill(255);
}
    rect(x * cellSideLength, y * cellSideLength, cellSideLength, cellSideLength);
}
}
}
