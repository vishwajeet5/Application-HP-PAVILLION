public class staticKeyword {
    @SuppressWarnings("static-access")
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolName = "ABIS";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
        System.out.println(s2.returnPercentage(60, 70 , 90));

        
    }
}

class Student{
    String name;
    int rollNo;
    static int returnPercentage(int math, int physics, int chem){
        return ((math + physics + chem)/3);
    }

    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
