public class K5_PrintIncDecSeries {
    public static void main(String[] args) {
        int n=5;
        Dec(n);
        Inc(n);
    }
    public static void Dec(int n) {
        if (n == 0) {
            return;
        }
        else{
            System.out.println(n);
            Dec(n-1);
        }
    }
    public static void Inc(int n) {
        if (n == 0) {
            return;
        }
        else{
            Inc(n-1);
            System.out.println(n);
        }
    }
}
