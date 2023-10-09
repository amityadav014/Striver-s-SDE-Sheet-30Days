//problem link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/


class Solution {
    public int maxProfit(int[] arr) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            //  System.out.println(" jnhbjb" +minPrice);
            minPrice = Math.min(minPrice, arr[i]);
            maxPro = Math.max(maxPro, arr[i] - minPrice);
            ///   System.out.println(" hhh " +maxPro);
        }
        return maxPro;
    }

}