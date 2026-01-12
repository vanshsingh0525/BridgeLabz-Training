package challengeproblem;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CompareStringAndIO {

    public static void main(String[] args) {

        int n = 1_000_000;
        String s = "hello";

        //  StringBuffer
        StringBuffer sbuf = new StringBuffer();
        long t1 = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sbuf.append(s);
        }

        long t2 = System.nanoTime();
        System.out.println("StringBuffer time  : " + (t2 - t1) + " ns");

        // StringBuilder 
        StringBuilder sbld = new StringBuilder();
        long t3 = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sbld.append(s);
        }

        long t4 = System.nanoTime();
        System.out.println("StringBuilder time : " + (t4 - t3) + " ns");

        // File path (large text file, e.g. ~100MB)
        String fileName = "largefile.txt";

        //  FileReader 
        long t5 = System.nanoTime();
        long words1 = countWordsUsingFileReader(fileName);
        long t6 = System.nanoTime();

        System.out.println("FileReader word count      : " + words1);
        System.out.println("FileReader time            : " + (t6 - t5) + " ns");

        // InputStreamReader
        long t7 = System.nanoTime();
        long words2 = countWordsUsingInputStreamReader(fileName);
        long t8 = System.nanoTime();

        System.out.println("InputStreamReader word count: " + words2);
        System.out.println("InputStreamReader time      : " + (t8 - t7) + " ns");
    }

    // FileReader method
    public static long countWordsUsingFileReader(String fileName) {
        long count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] arr = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    count += arr.length;
                }
            }
        } catch (IOException e) {
            System.out.println("FileReader error: " + e.getMessage());
        }

        return count;
    }

    // InputStreamReader method 
    public static long countWordsUsingInputStreamReader(String fileName) {
        long count = 0;

        try (
            BufferedReader br = new BufferedReader(
                new InputStreamReader(
                    new FileInputStream(fileName),
                    StandardCharsets.UTF_8
                )
            )
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] arr = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    count += arr.length;
                }
            }
        } catch (IOException e) {
            System.out.println("InputStreamReader error: " + e.getMessage());
        }

        return count;
    }
}
