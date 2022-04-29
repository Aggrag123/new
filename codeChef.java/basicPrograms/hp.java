package basicPrograms;

import java.util.Scanner;

public class hp {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces  =2*n-3;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+"\t");
        }
        for(int j=1;j<=spaces;j++){
            System.out.print("\t");
            
        }
        for(int j=i;j>=1;j--){
            System.out.print(j+"\t");
        }
        System.out.println();
        spaces-=2;
    }

    
    }
}
