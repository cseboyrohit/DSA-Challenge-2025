using System;

class Solution
{
    public int MaximumProfit(int[] prices)
    {
        int minPrice = int.MaxValue;
        int maxProfit = 0;

        for (int i = 0; i < prices.Length; i++)
        {
            if (prices[i] < minPrice)
            {
                minPrice = prices[i];  // Update minimum price
            }
            else if (prices[i] - minPrice > maxProfit)
            {
                maxProfit = prices[i] - minPrice;  // Update max profit
            }
        }
        return maxProfit;
    }
}

class GFG
{
    public static void Main()
    {
        int t = int.Parse(Console.ReadLine());

        while (t-- > 0)
        {
            string[] arr = Console.ReadLine().Split(' ');
            int[] prices = new int[arr.Length];

            for (int i = 0; i < arr.Length; i++)
            {
                prices[i] = int.Parse(arr[i]);
            }

            Solution obj = new Solution();
            int res = obj.MaximumProfit(prices);
            Console.WriteLine(res);
        }
    }
}
