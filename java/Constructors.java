public class Constructors {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.Name = "Vishwajeet";
        s1.RollNo = 49;
        s1.Password = "1234";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        // Student s2 = new Student("Vishwajeet");
        // Student s3 = new Student(49);
        // System.out.println(s1);
        // System.out.println(s2.Name);
        // System.out.println(s3.RollNo);
        
        Student s = new Student(s1);
        s.Password = "abcd";
        s1.marks[2] = 100;
        for(int i = 0; i < 3; i++){
            System.out.println(s.marks[i]);
        }
    }
}

class Student{
    String Name;
    int RollNo;
    String Password;
    int marks[];

    // Student(Student s1){ // copy constructor(swallow copy constructor)
            // marks = new int[3];
    //     this.Name = s1.Name;
    //     this.RollNo = s1.RollNo;
    //     this.marks = s1.marks;
    // }

    Student(Student s1){  //copy constructor(deep copy constructor)
        marks = new int [3];
        this.Name = s1.Name;
        this.RollNo = s1.RollNo;
        for(int i = 0; i < marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }

    // Student(String name){ // Parimeterised 
    //     this.Name = name;
    // }

    Student(){ //Non Parimeterised
        marks = new int [3];
        System.out.println("Constructor is called ......");
    }

    // Student(int roll){
    //     this.RollNo = roll;
    // }
}
