//1.a Write a function that prints an empty line and call it from setup();
void setup() {
  emptyLine();
  test1(":)");
  nameAge("Nicolai",21);
}

void emptyLine() {
  println(" ");
}

//1.b Write a function that receives a string as a parameter and prints it. call this function from setup()
void test1(String a){
  println(a);
}


//1.c Write a function that receives a string called "name" and an integer called "age" and call it from setup with your own name and age. Have the function print the text "My name is \<name\>, I am <age> years old".
void nameAge(String name, int age) {
  println("My name is " + name + ", I am " + age + " years old");
}
