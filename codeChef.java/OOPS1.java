package basicPrograms;
public class OOPS1 {
    public static void main(String[] args) {
        Student rahul = new Student(13,"r",23.6f);
        System.out.println(rahul.rno);
    }
}
class Student(){
    int rno;
    String name; 
    float marks;
    
    Student(int rno, String name,float marks){
        this.rno = rno;
    }
    
}