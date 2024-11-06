public class SwabExample{
    int a;
    int b;

    //Constructor
    public SwabExample(int a, int b) {
        this.a = a;
        this.b = b;
    }
//Method

    public void swap() {
        a = a + b;
        b = a - b;
        a = a - b;
    }

    public static void main(String[] args) {
        SwabExample obj = new SwabExample(6, 5);
        System.out.println("Before swap: a = " + obj.a + ", b = " + obj.b);
        obj.swap();
        System.out.println("After swap: a = " + obj.a + ", b = " + obj.b);
    }
}
