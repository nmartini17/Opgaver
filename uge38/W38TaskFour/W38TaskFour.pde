//For all exercises in Task 4, you are allowed to complete them with arrays of a fixed size. But do consider how the functions you write in 4.b, 4.c, 4.d, 4.e would work, if the array received as a parameter would not have a fixed length. 
//4.a create arrays of the following type and assign it at least 3 different values: 
//    - Integer array
//    - String array
//    - boolean array
//4.b Write a function that takes in an array of strings as parameter and prints each string.
//4.c Write a function that receives an integer array as a parameter and returns the sum of all elements in the array.
//4.d Write a function that receives an integer array as a parameter and returns the average value.  
//4.e Consider how you could write a function that takes in an integer array as a parameter and returns the array sorted from lowest to highest value.
int[] numbers = new int[10];
String[] text = new String[7];
boolean[] maybe = new boolean[5];

void setup() {
  //text[0] = "Diller";
  numbers[0] = 12;
  numbers[1] = 9;
  numbers[2] = 5;
  numbers[5] = 28;
  visTekst(text);
  println(visNumber(numbers));
  println(averageNumber(numbers));
}

void visTekst(String[] tekst) {
  for (int i = 0; i < tekst.length; i++) {
    println(tekst[i]);
  }
  
}

int visNumber(int[] nummer) {
  int sum = 0;
  for (int i = 0; i < nummer.length; i++) {
    sum = sum + nummer[i];
  }
  return sum;
}

int averageNumber(int[] nummer) {
  int sum = visNumber(nummer);
  int averageNum = sum/nummer.length;
  return averageNum;
}
