package edumentor;

public class FullTimeCourse implements ICertifiable{
	
	public double percentage;
	
	public FullTimeCourse(double percentage) {
		this.percentage = percentage;
	}
	
	@Override
	public void generateCertificate() {
		if(percentage > 75) {
			System.out.println("Full-Time Course Certificate Generated");
		}
		else {
			System.out.println("Full-Time Course Certificate Not Eligible");
		}
	}
	
}
