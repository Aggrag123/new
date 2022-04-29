package basicPrograms;
import java.util.*;
public class arrow {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n/2+1||j==n/2+1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            if(i<=n/2){
                for(int j=1;j<=n/2;j++){
                    if(i==j+2){
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                }
            }
            else{
                for(int j=1;j<=n/2;j++){
                    if(i==j){
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
        

    }
}
