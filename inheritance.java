class Calculation{
    int z;

    public void addition(int x,int y){
        z = x+y;
        System.out.println(z);
    }
    public void subtraction(int x,int y){
        z = x-y;
        System.out.println(z);
    }
}

class MyCalculation extends Calculation{
    public void multiply(int x,int y){
        System.out.println(x* y);
    }
}
public class inheritance {
    public static void main(String[]args){
        MyCalculation c = new MyCalculation();
        c.addition(10,20);
        c.multiply(25,89);
        c.subtraction(78,56);
    }
    
}
