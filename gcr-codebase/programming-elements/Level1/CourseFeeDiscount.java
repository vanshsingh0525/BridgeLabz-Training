public class CourseFeeDiscount {
    public static void main(String[] args) {

        double fee = 125000;
        double discountPercent = 10;
	//Calculating discount
        double discount = (fee * discountPercent) / 100;
	//Calculating final fee
        double finalFee = fee - discount;

	//Printing discount and final fee
        System.out.println(
                "The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee
        );
    }
}