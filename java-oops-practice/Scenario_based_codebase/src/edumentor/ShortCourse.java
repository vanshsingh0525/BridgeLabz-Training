package edumentor;

public class ShortCourse implements ICertifiable{
	
	public double percentage;
	
	public ShortCourse(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public void generateCertificate() {
		if(percentage >= 60) {
			System.out.println("Short Course Certificate Generated");
		}
		else {
			System.out.println("Short Course Certificate Not Eligible");
		}
	}
	
	
}
