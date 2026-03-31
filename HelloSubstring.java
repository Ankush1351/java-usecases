public class HelloSubstring {
    public static void main(String[] args) {

        // If no arguments → default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            String result = "";

            // Enhanced for loop to add names
            for (String name : args) {
                result = result + name + ", ";
            }

            // Remove last comma and space using substring
            result = result.substring(0, result.length() - 2);

            // Final output
            System.out.println("Hello, " + result + "!");
        }
    }
}