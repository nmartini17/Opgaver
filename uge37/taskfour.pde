//4.a print out numbers from 0 to 20 using a for loop.
//4.b alter the for loop from 4.a to only print even numbers (hint: google 'java modulus even number')
//4.c print out the same result as in task 4.b using a while loop instead of a for loop.

for (int i = 0; i < 21; i = i+1) {
  println(i);
}

for (int a = 0; a < 21; a = a+1) {
  if(a%2 == 0) {
  println(a);
  }
}

int e = 0;
while (e < 21) {
  if(e%2 == 0) {
    println(e);
  }
  e++;
}
