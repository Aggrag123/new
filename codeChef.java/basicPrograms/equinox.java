package basicPrograms;
import java.util.*;
public class equinox {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while(t-->0){
                int n = sc.nextInt();
                int a = sc.nextInt();
                int b = sc.nextInt();
                int sum=0,num=0;
                for(int i=0;i<n;i++){
                    String s = sc.next();
                    if(s.charAt(0)=='E'||s.charAt(0)=='Q'||s.charAt(0)=='U'||s.charAt(0)=='I'||s.charAt(0)=='N'||s.charAt(0)=='O'||s.charAt(0)=='X'){
                            sum +=a;
                    }
                    else{
                        num+=b;
                    }
                }
                if(sum>num){
                    System.out.println("SARTHAK");
                }else if(sum<num){
                    System.out.println("ANURADHA");
                }else{
                    System.out.println("DRAW");
                }
            }
    }
}
