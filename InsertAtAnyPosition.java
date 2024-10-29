public class InsertAtAnyPosition {
    static void insertElement(int arr[], int n, int x, int pos){
        for (int i = n-1; i >= pos ; i--)
            arr[i+1] = arr[i];
        arr[pos] = x;
    }
    public static void main(String[] args) {
        int arr[] = new int[15];
        arr[0] = 2;
        arr[1] = 6;
        arr[2] = 15;
        arr[3] = 52;
        arr[4] = 95;
        arr[5] = 11;
        int n = 5;
        int x = 10, pos = 3;

        System.out.println("Before Insertion: ");
        for (int i = 0; i <= n ; i++)
            System.out.print(arr[i] + " ");

        insertElement(arr,n,x, pos);
        n+=1;

        System.out.println("\n\nAfter Insertion: ");
        for (int i = 0; i < n ; i++)
            System.out.print(arr[i] + " ");
    }
}
