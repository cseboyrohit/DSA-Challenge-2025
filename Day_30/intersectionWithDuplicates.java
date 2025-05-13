class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        Set<Integer> sa = new HashSet<>();
        for(int num : a){
            sa.add(num);
        }
      ArrayList<Integer> result= new ArrayList<>();
      for(int num : b){
          if(sa.contains(num)){
              result.add(num);
              sa.remove(num);
          }
      }
      return result;
    }
}
