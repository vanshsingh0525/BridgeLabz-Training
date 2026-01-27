package resumeanalyzer;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ResumeAnalyzer {

    public static final String EMAIL_REGEX = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}";
    public static final String PHONE_REGEX = "\\b[6-9][0-9]{9}\\b";
    public static final String KEYWORD_REGEX = "(?i)\\b(Java|Python|Spring)\\b";

    public static void main(String[] args) {

        File folder = new File("resumes");

        Map<String, ResumeData> resumeMap = new HashMap<String, ResumeData>();
        List<ResumeData> resumeList = new ArrayList<ResumeData>();

        try {

            File[] files = folder.listFiles();

            for (int i = 0; i < files.length; i++) {

                File file = files[i];

                // Skip non txt files
                if (!file.getName().endsWith(".txt")) {
                    throw new Exception("Invalid file: " + file.getName());
                }

                String content = readFile(file);

                String email = extract(EMAIL_REGEX, content);
                String phone = extract(PHONE_REGEX, content);
                int keywordCount = countKeywords(content);

                if (email == null) continue;

                ResumeData data = new ResumeData(file.getName(), email, phone, keywordCount);

                resumeMap.put(email, data);
                resumeList.add(data);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Sorting without lambda (Java 7)
        Collections.sort(resumeList, new Comparator<ResumeData>() {
            public int compare(ResumeData r1, ResumeData r2) {
                return r2.keywordCount - r1.keywordCount;
            }
        });

        System.out.println("\n---- Sorted Candidates ----");
        for (int i = 0; i < resumeList.size(); i++) {
            resumeList.get(i).display();
        }
    }

    // Read file using BufferedReader
    public static String readFile(File file) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            sb.append(line).append(" ");
        }

        br.close();
        return sb.toString();
    }

    // Extract email or phone
    public static String extract(String regex, String text) {

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        if (m.find()) {
            return m.group();
        }
        return null;
    }

    // Count Java, Python, Spring keywords
    public static int countKeywords(String text) {

        Pattern p = Pattern.compile(KEYWORD_REGEX);
        Matcher m = p.matcher(text);
        int count = 0;

        while (m.find()) {
            count++;
        }
        return count;
    }
}
