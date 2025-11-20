package textwise;

public class StringReverser {

    // Public method
    public static String reverseString(String ogString) {
        // Start recursion at last index, accumulator = ""
        return reverseStringHelper(ogString.length() - 1, "", ogString);
    }

    // Helper method that matches your diagram
    private static String reverseStringHelper(int index, String reversedString, String ogString) {

        // Base case: once index goes below 0, we are done
        if (index < 0) {
            return reversedString;
        }

        // Grab character at current index and append to accumulator
        reversedString += ogString.charAt(index);

        // Recursive call: move index left by 1
        return reverseStringHelper(index - 1, reversedString, ogString);
    }
}
