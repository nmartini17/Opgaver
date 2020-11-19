int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };

void setup() {
 taskFour(10); 
 taskFourBC(arr);
}

void taskFour(int nummer) {
  for(int i=1; i<=100; i++) {
    if(nummer % i == 0){
      print(i + " ");
  }
 }
}

int taskFourBC(int[] arr) {
  int randomE = (int)random(arr.length);
  
  return arr[randomE];
}
