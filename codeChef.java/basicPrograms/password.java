package basicPrograms;
import java.util.*;
public class password {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            String s = sc.next();
            int n=s.length();
             if(n>=10){
                 int lc=0,uc=0,num=0,sp=0;
                    if((s.charAt(0)>='a'&&s.charAt(0)<='z')||(s.charAt(n-1)>='a'&&s.charAt(n-1)<='z')){
                        lc++;
                    }
                
                for(int i=1;i<n-1;i++){
                    if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                        lc++;
                    }
                  else  if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                        uc++;
                        
                    }
                  else  if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                        num++;
                        
                    }
                  else if(s.charAt(i)=='@'||s.charAt(i)=='#'||s.charAt(i)=='%'||s.charAt(i)=='$'||s.charAt(i)=='?'){
                        sp++;
                        
                    }
                }
            
            if(sp>0 && lc>0 && uc>0 && num>0 ){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }else{
            System.out.println("NO");
        }
        }
    
    } 
    
}
