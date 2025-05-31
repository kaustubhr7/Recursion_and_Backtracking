public class K1_fibonacci{
    public static void main(String[] args) {
       int n=6;
       int ans=gerFib(n);
       System.out.println("Answer:"+ans);
    }
    public static int gerFib(int n){
        //base case
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        else{
            int ans=gerFib(n-1)+gerFib(n-2);
            return ans;
        }
    }
}