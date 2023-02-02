package anush.dsaDPP;

public class Stocks {
    public static void main(String[] args) {
        int[] prices={7,1,5,6,3};
        int max_price=0;
        int buy=prices[0];
        for(int i=0;i<=prices.length-1;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }
            if(prices[i]-buy>max_price){
                max_price=prices[i]-buy;
            }
        }
        System.out.println(max_price);

    }
}
