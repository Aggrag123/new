package basicPrograms;

public class frequencyArray {
    public static void main(String[]args){
        int arr[] = new int[]{2,4,2,6,6,3,7};

        int [] visitedArr = new int[arr.length];
        int visited = -1;

        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                        
                        visitedArr[j]=visited;
                    }
            }
            if(visitedArr[i]!=0){
                visitedArr[i]=count;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(visitedArr[i]!=0){
                System.out.println(arr[i]+"       "+visitedArr[i]);
            }
        }
    }
}
