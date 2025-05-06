// JavaScript program to search an element in row-wise
// and column-wise sorted matrix 

function matSearch(mat, x) {
    let n = mat.length, m = mat[0].length;
    let i = 0, j = m - 1;

    while (i < n && j >= 0) {

        // If x > mat[i][j], then x will be greater
        // than all elements to the left of 
        // mat[i][j] in row i, so increment i
        if (x > mat[i][j]) {
            i++;
        }

        // If x < mat[i][j], then x will be smaller
        // than all elements to the bottom of
        // mat[i][j] in column j, so decrement j
        else if (x < mat[i][j]) {
            j--;
        }

        // If x = mat[i][j], return true
        else {
            return true;
        }
    }

    // If x was not found, return false
    return false;
}

// Driver Code
let mat = [
	[3, 30, 38],
    [20, 52, 54],
	[35, 60, 69]
];
let x = 35;

if (matSearch(mat, x))
	console.log("true");
else
	console.log("false");
