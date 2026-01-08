package inputstreamreader;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class ConsoleToFile {

    public static void main(String[] args) {

        BufferedReader reader = null;
        FileWriter writer = null;

        try {
            // Step 1: Read from console
            InputStreamReader isr = new InputStreamReader(System.in);
            reader = new BufferedReader(isr);

            // Step 2: Write to file
            writer = new FileWriter("output.txt", true); // append mode

            System.out.println("Enter text (type 'exit' to stop):");

            String line;

            // Step 3: Read input and write to file
            while (true) {
                line = reader.readLine();

                if (line.equalsIgnoreCase("exit")) {
                    break;
                }

                writer.write(line);
                writer.write(System.lineSeparator());
            }

            System.out.println("Input successfully written to file.");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Step 4: Close resources
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

