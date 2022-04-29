package basicPrograms;
import java.util.*;
public class snakeProcession {
    public static void main(String[]args){
        try{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            

            String sr = s.replace(".", "");
            int count2=0,count3=0;
            for(int i=0;i<sr.length();i++){
                if(sr.charAt(i)=='H'){
                    count2++;
                }else{
                    count3++;
                }
            }
            
            if(sr.length()==0){
                System.out.println("Valid");
                
              }
        else{
            if(sr.length()%2==0){
                int count=0,count1=0,m=0;
            for(int i=0;i<sr.length();i++){
                 m=i%2;
                if(m==0&&sr.charAt(i)=='H'){
                count++; 
                   
                } if(m!=0&&sr.charAt(i)=='T'){
                    count1++;
                    
                }
            }
                if(count==count1&&count2==count3&&(count+count1)==sr.length()){
                    System.out.println("Valid");
                }else{
                    System.out.println("Invalid");
                }
            }
            else{
                System.out.println("Invalid");
            }
    }
}     
    }
    
    catch(Exception e){
        return;
    }

        }
    }

