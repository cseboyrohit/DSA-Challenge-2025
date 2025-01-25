public class ReverseString_344 {
  public static void reverseString(char[] s) {
      int start=0;
      int end= s.length -1;
      char temp;
      while(start < end){
          temp=s[start];
          s[start]=s[end];
          s[end]=temp;
          start++;
          end--;
      }
  }
    public static void main(String[] args) {
       // Test cases
       char[] s1 = {'h', 'e', 'l', 'l', 'o'};
       reverseString(s1);
       System.out.println(s1); // Output: [o, l, l, e, h]

       char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
       reverseString(s2);
       System.out.println(s2); // Output: [h, a, n, n, a, H]
  }
  }