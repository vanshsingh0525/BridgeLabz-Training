package artify;

public class Artwork implements IPurchasable {

    protected String title;
    protected String artist;
    protected double price;

    // Encapsulation: protected licensing terms
    protected String licenseType;

    protected boolean previewAvailable;

    // Constructor without preview
    public Artwork(String title, String artist, double price) {
        this(title, artist, price, false);
    }

    // Constructor with preview
    public Artwork(String title, String artist, double price, boolean previewAvailable) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.previewAvailable = previewAvailable;
    }

    @Override
    public void purchase(User user) {
        if (user.getWalletBalance() >= price) {
            // Operator usage
            user.setWalletBalance(user.getWalletBalance() - price);
            System.out.println(user.getName() + " purchased artwork: " + title);
        } else {
            System.out.println("Insufficient wallet balance");
        }
    }

    @Override
    public void license(String licenseType) {
        this.licenseType = licenseType;
        System.out.println("Artwork licensed under: " + licenseType);
    }
}
