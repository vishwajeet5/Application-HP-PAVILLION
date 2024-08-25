public class buyAndSellStocks {
    public static int bestTimeCalculator(int stockPrices[]){
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for(int i = 0; i < stockPrices.length; i++){
            if(buyPrice < stockPrices[i]){
                int Profit = stockPrices[i] - buyPrice;
                maxProfit = Math.max(Profit, maxProfit);
            }else{
                buyPrice = stockPrices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int stockPrices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(bestTimeCalculator(stockPrices));
    }
}
