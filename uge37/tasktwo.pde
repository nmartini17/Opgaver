// 2a
String navn = "Nicolai";
println(navn);

// 2b
int age=21;
println(age);

// 2cstore whether or not you are happy right now, as a boolean (true for happy, false for sad).
boolean happy = true;

// 2.d using the above variables print the following message: "Hi, my name is " 
// "I am years old" 
// "I clap my hands"

println("Hi, my name is " + navn);
println("I am " + age + " years old");

if (happy) {
  println("I clap my hands ");
}  else if(!happy) {
    println("I am sad");
}
