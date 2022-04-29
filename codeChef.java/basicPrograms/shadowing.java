package basicPrograms;

public class shadowing {
  static  int x = 90;     //this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);   //90
        int x =40;              // scope will be begin when value is initialised.
        System.out.println(x);   //40
        shad();
    }

    static void shad(){
        System.out.println(x);   //90
    }
    
}
