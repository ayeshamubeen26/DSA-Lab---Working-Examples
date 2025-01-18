public class BubbleSort {
    static void BubbleSort(int [] a){
        int n = a.length;

        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {10,6,2,9,1,3};
        BubbleSort(a);

        for (int i=0; i <a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
