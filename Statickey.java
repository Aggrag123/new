class Student{
    String name;
    static String school; 

    public static void changeSchool(){
        school = "new school";
    }
}


public class Statickey {
    public static void main(String[] args){
        Student.school = "abc";
        Student s1 = new Student();
        s1.name = "rahul";
        System.out.println(s1.school);
    }

    
}
