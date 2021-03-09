
public class LinearSearch {
    public int search(int arr[], int x)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
 
    // Driver code
    public static void main(String args[])
    {   
        LinearSearch obj = new LinearSearch ();
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
 
        // Function call
        int result = obj.search(arr, x);
        if (result == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index "+ result);
    }
    
}
