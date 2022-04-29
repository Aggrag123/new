package basicPrograms;
import java.util.*;
public class rotateNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
            int n = sc.nextInt();
            int k = sc.nextInt();
            int count=0;
            for(int i=n;i>0;i/=10){
                count++;
            }
            k=k%count;
            if(k<0){
                k=k+count;
            }

        
                int r = (int)Math.pow(10,k);
                int a = n%r;
                
                int b = n/r;
                int z = (int)Math.pow(10, count-k);
                int c = a*z+b;
                System.out.println(c);
            
        
    }
    
}
