package resumeanalyzer;

public class ResumeData {

    public String name;
    public String email;
    public String phone;
    public int keywordCount;

    // Constructor
    public ResumeData(String name, String email, String phone, int keywordCount) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.keywordCount = keywordCount;
    }

    // Display resume details
    public void display() {
        System.out.println(name + " | " + email + " | " + phone + " | Keywords: " + keywordCount);
    }
}
