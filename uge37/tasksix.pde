//6.a make 2 integer variables named a and b. Print "Success!" if either of them is equal to 10 or if the sum is. If not, print "Failure!".

int a = 10;
int b = 0;

if (a == b || a == 10 || b == 10 ) {
  println("Success!");
} else if (a != b) {
  println("Failure!");
}

//6.b make 3 integer variables named x, y and z. Print "Success!" if their sum is 30, but none of them may have the value of 10, 20 or 30. Otherwise print "Failure!".

int x = 12;
int y = 12;
int z = 6;

if (x != 10 && x != 20 && x != 30 &&
    y != 10 && y != 20 && y != 30 &&
    z != 10 && z != 20 && z != 30 &&
    x + y + z == 30) {
    println("Success!");
    } else {
      println("Failure!");
    }
    
   
