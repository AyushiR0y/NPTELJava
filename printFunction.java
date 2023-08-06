// This is the class named School
class School { 
    // This is a method in class School
    public void print() { 
		System.out.println("Hi! I class SCHOOL."); 
    } 
} 
// This is the class named Student
class Student { 
	// This is a method in class Student
    public void print() { 
		System.out.println("Hi! I am class STUDENT"); 
    } 
}

public class Question21{ 
    public static void main(String args[]){
               // Create an object of the Student class
        Student student = new Student();
        
        // Call the print() method of the Student class
        student.print();
        
        // Create an object of the School class
        School school = new School();
        
        // Call the print() method of the School class
        school.print();
    }
}


