public class ProfitCalculation {
    public static void main(String[] args) {
	
        double costPrice = 129;
        double sellingPrice = 191;
	//Calculating Profit
        double profit = sellingPrice - costPrice;
	//Calculating Profit Percentage
        double profitPercentage = (profit / costPrice) * 100;
	
	//Printing Cost Price,Selling price, Profit and Profit Percentage
        System.out.println(
                "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
                "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage
        );
    }
}
