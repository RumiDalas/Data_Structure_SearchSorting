
package data_sorting;


public class Bubble_Sort {
    public static void main(String[] args) {
        
        int arr[]={8,6,3,9,4};
        int temp ;
        for(int i=0; i<arr.length;i++){
            int flag=0;
        for(int j=0; j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                flag=1;
            }
        
        }
        if(flag==0){
            break;
        
        }
        
        }
        
        for(int i=0;i<arr.length;i++){
        
            System.out.print(arr[i]+" ");
        
        }
        
        
        
        
        
        
    }
            
    
}
