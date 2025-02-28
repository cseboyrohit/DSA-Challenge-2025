class Solution {
    public static boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        while(n%2==0){
            n=n/2;
        }
        return n==1;
    }
public static void mai(String[]args){
System.out.println(isPowerOfTwo(16));
}
