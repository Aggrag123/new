package basicPrograms;
import java.util.*;

public class m {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int count=0;
        
        int a[] = new int[n];
        for(int i=0;i<a.length;i++){
            if(a[i]==d){
                count++;
            }
        }
        System.out.println(count);
    }
}