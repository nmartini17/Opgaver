//2.a Look at the file TaskTwoA and fill out the missing line, using the happy boolean. 
boolean happy = true;

int a = 10;
int b = 5;

void setup() {
   if (iAmHappy())
   {
     println("I clap my hands");
   }
   else
   {
     println("I don't clap my hands"); 
   }
   println(regnestykke(a,b));
   println(navn("nicolai"));
   println(vd("nicolai"));
}


boolean iAmHappy()
{
  return happy;
}

//2.b Write a function that receives two integers as parameters and returns the sum of them.

int regnestykke(int a,int b) {
  int sum = a+b;
  return sum;
}

//2.c Write a function that receives a string and returns it as uppercase. (Hint: ".toUpperCase()". Further hint: https://www.w3schools.com/jsref/jsref_toUpperCase.asp )
String navn(String navn2) {
  return navn2.toUpperCase();
}
  

//2.d Write a function that receives a string and returns true if the first letter of the string is uppercase. (Hints: ".charAt(0)" and "Character.isUpperCase('a');" )
boolean vd(String td) {
  boolean upperCase = false;
  if (Character.isUpperCase(td.charAt(0))) {
    upperCase = true;
}
return upperCase;
}
