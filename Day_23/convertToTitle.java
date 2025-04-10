class Main {
    
    // Function to convert column number to Excel column title
    static String convertToTitle(int columnNumber) {
        String s = "";
        int rem;
        char x;
        
        // Loop until columnNumber becomes 0
        while(columnNumber > 0) {
            columnNumber--;  // Decrement to handle 0-based indexing
            rem = columnNumber % 26;  // Find remainder
            x = (char)('A' + rem);   // Convert to corresponding character
            s = x + s;  // Append character to result string
            columnNumber = columnNumber / 26;  // Divide for next iteration
        }
        
        return s;  // Return final result
    }
    
    public static void main(String[] args) {
        int columnNumber = 28;  // Example input
        System.out.println("Excel Column Title: " + convertToTitle(columnNumber));
    }
}
