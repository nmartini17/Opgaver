//For this task you should reuse the Student class from Task 3. 
//    Methods of reusing the class could be: 
//    - copy the Students.pde file and open it in this sketch
//    - copy the content of the students tab from Task 3 and create it once more in this sketch
//    - Open the task 3 and continue working in this.
//    Either method is fine - it is up to you.    
//5.a Create an array of Students (the class created in Task 3) with 10 elements in it. Each student must have a unique name.

//5.b Create a function that takes in the array from 5.a as a parameter as well as an integer. 
//The function should return the field "name" (the name of the student) and print it. 
//Call this method with different parameters (only the integer - not the array) from the setup() of Datamatik.

//5.c Create a similar function to that of 5.b, but instead of receiving the array and an integer, it receives the array and a string. 
//Loop through all elements in the array until you find the element with the name received as a parameter. Then return the index of that student. 
//Call this method with different names from the setup() of Datamatik

Student[] Students= new Student[10];

// String[] Studenter = new String[10];

void setup() {
  Students[0] = new Student ("Nicolai", 21, false, "a");
  Students[1] = new Student ("Daniel", 21, false, "a");
  Students[2] = new Student ("Hans", 21, false, "a");
  Students[3] = new Student ("Jens", 21, false, "a");
  Students[4] = new Student ("Isabella", 21, true, "a");
  Students[5] = new Student ("Dennis", 21, false, "a");
  Students[6] = new Student ("Julie", 21, true, "a");
  Students[7] = new Student ("Claus", 21, false, "a");
  Students[8] = new Student ("Jacob", 21, false, "a");
  Students[9] = new Student ("Oliver", 21, false, "a");
  println(studentNames(Students, 5 ));
  println(allNames(Students, "Nicolai"));
}

//5.b

String studentNames(Student[] students, int a) {
  return students[a].name;
  }
  
//5.c
int allNames(Student[] students, String a) {
  for (int i = 0; i < students.length; i++) {
    if (Students[i].name == a) {
      return i;
    }
    
  }
return -1;
}
