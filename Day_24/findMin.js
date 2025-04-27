class Solution {
    // Function to find the minimum element in a sorted and rotated array.
    findMin(arr) {
        let low = 0;
        let high = arr.length - 1;
        
        while (low < high) {
            if (arr[low] < arr[high])
                return arr[low];
            
            const mid = Math.floor((low + high) / 2);
            
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        
        return arr[low];
    }
}

// Main method
function main() {
    const solution = new Solution();
    
    const arr1 = [5, 6, 1, 2, 3, 4];
    const arr2 = [3, 1, 2];
    const arr3 = [4, 2, 3];
    
    console.log("Minimum element is " + solution.findMin(arr1)); // Output: 1
    console.log("Minimum element is " + solution.findMin(arr2)); // Output: 1
    console.log("Minimum element is " + solution.findMin(arr3)); // Output: 2
}

main();
