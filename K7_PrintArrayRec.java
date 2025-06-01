public class K7_PrintArrayRec {
    public static void main(String[] args) {
        int a[] = { 7, 8, 9, 1, 83, 4 };
        rec(a,a.length,0);
    }
    public static void rec(int a[],int size,int index) {
        if(index==size){
            return;
        }
        System.out.println(a[index]);
        rec(a, size, index+1);
    }
}
