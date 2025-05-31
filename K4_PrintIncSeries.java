public class K4_PrintIncSeries{
    public static void main(String[] args) {
        rec(8);
    }
    public static void rec(int n){
        if(n==0){
            System.out.println("0");
        }
        else{
            rec(n-1);
            System.out.println(n+" ");//we moved this line down, THATS IT
        }
    }
}
