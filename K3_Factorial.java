public class K3_Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of 5: " + fact(5));
    }

    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        else{
            return (n*fact(n-1));
        }
    }
}
