import java.util.Arrays;

public class validAnagram_242 {
  public static boolean ValidAnagram(String s, String t) {
    if (s.length() != t.length())
      return false;

    // Covert the string in array form using inbuild methode toCharArray()
    char[] sArray = s.toCharArray();
    char[] tArray = t.toCharArray();

    // Sorting the charter
    Arrays.sort(sArray);
    Arrays.sort(tArray);

    return Arrays.equals(sArray, tArray);

  }

  public static void main(String[] args) {
    String st = "hello";
    String st2 = "elloh";
    System.out.println(ValidAnagram(st, st2));
  }

}
