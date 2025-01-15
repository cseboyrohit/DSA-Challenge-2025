
public class removeDuplicateEle_26 {
  public static int removeDuplicate(int[] arr) {
    int j = 1;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] != arr[i - 1]) {
        arr[j] = arr[i];
        j++;
      }
    }
    return j;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 1, 2 };
    int newLength = removeDuplicate(arr);

    // Print the length of the array without duplicates
    System.out.println(newLength);

    // Print the updated array with unique elements
    for (int i = 0; i < newLength; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
