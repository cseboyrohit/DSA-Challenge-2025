class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        swap(s,0,n-1);
        return;
    }
    public void swap(char[] ch, int i, int j){
        if(i>=j)return ;
        char temp= ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        swap(ch,i+1,j-1);
    }
}
