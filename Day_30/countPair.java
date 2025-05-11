class Solution {

    int countPairs(int arr[], int target) {
        // Your code here
        int n = arr.length;
        int count =0;
        for(int i=0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]+arr[j] == target){
                    count++;
                }
            }
        }
        return count;
    }
}
