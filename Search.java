//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Search {
    static int findElement(int arr[], int n, int key) {
        for (int i = 0; i < n; i++)
            if (arr[i] == key)
                return i;
        // if key not found
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {12,34,10,6,40};
        int n = arr.length;

        int key= 6;
        int postion = findElement(arr,n,key);
        if (postion == -1){
            System.out.printf("Element not found");
        }
        else
            System.out.printf("Element found at Position: " +(postion+1));
    }
}