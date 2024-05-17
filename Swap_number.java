public class Swap_number {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swap number  " + a);
        System.out.println("Before swap number  " + b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swap number " + a);
        System.out.println("Before swap number  " + b);


    }
}
