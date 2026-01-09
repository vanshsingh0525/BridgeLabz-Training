package artify;

public class DigitalArt extends Artwork {

    public DigitalArt(String title, String artist, double price, boolean previewAvailable) {
        super(title, artist, price, previewAvailable);
    }

    @Override
    public void license(String licenseType) {
        this.licenseType = licenseType;
        System.out.println("Digital Art licensed for " + licenseType + " digital usage");
    }
}

