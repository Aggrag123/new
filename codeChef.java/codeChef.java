import java.util.*;




class codeChef{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
           int n = sc.nextInt();
           int a[] = new int[n];
           int b[] = new int[n];
           int max=0;
           for(int i=0;i<n;i++){
               a[i] = sc.nextInt();
               b[i] = sc.nextInt();
           }
           for(int i=0;i<n;i++){

           
               int e = Math.max(max,a[i]);
               max=e;
               max=0;
           } 
           System.out.println(max);

        }  sc.close();
            
        
    }
}
