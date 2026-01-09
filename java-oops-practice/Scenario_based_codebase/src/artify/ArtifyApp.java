package artify;

public class ArtifyApp {
    public static void main(String[] args) {

        User buyer = new User("Astha", 5000);

        IPurchasable art1 = new DigitalArt(
                "Cyber Dreams", "Alex", 2000, true);

        IPurchasable art2 = new PrintArt(
                "Nature Bloom", "Emma", 1500);

        art1.license("Commercial");
        art1.purchase(buyer);

        art2.license("Personal");
        art2.purchase(buyer);

        System.out.println("Remaining Balance: " + buyer.getWalletBalance());
    }
}
