
class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        int count=0;
        Set<Integer> set= new HashSet<>();
        for(int i=0; i<a.length; i++){
            set.add(a[i]);
        }
        for(int i=0; i<b.length; i++){
            set.add(b[i]);
        }
        for(int e : set){
            count++;
        }
        return count;
    }
}
