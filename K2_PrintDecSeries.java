public class K2_PrintDecSeries {
    public static void main(String[] args) {
        rec(8);
    }
    public static void rec(int n){
        if(n==0){
            System.out.println("0");
        }
        else{
            System.out.println(n+" ");
            rec(n-1);
        }
    }
}
