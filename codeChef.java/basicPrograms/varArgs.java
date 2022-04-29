package basicPrograms;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(1,3,2,4,3);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    
}
