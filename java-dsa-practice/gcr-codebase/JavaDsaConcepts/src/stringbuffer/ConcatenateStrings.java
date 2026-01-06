package stringbuffer;

public class ConcatenateStrings {

    public static void main(String[] args) {

        String[] words = {"Java", " ", "is", " ", "powerful"};

        // Step 1: Create StringBuffer
        StringBuffer sb = new StringBuffer();

        // Step 2: Append each string
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
        }

        // Step 3: Convert to String
        String result = sb.toString();

        // Output
        System.out.println("Concatenated String: " + result);
    }
}

