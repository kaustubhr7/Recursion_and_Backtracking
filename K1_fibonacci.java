public class K1_fibonacci{
    public static void main(String[] args) {
       int n=6;
       int ans=getFib(n);
       System.out.println("Answer:"+ans);
    }
    public static int getFib(int n){
        //base case
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        else{
            int ans=getFib(n-1)+getFib(n-2);
            return ans;
        }
    }
}