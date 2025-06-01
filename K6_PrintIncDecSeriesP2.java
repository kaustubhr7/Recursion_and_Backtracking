// Happens in only one Fn
public class K6_PrintIncDecSeriesP2 {
    public static void main(String[] args) {
        int n = 5;
        DecInc(n);
    }

    public static void DecInc(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        DecInc(n - 1);
        System.out.println(n);
    }
}