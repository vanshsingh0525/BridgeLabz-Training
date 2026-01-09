package artify;

public class PrintArt extends Artwork {

    public PrintArt(String title, String artist, double price) {
        super(title, artist, price);
    }

    @Override
    public void license(String licenseType) {
        this.licenseType = licenseType;
        System.out.println("Print Art licensed for limited physical copies");
    }
}


