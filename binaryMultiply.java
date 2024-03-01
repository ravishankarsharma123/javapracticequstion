public class binaryMultiply {

    public static void main(String[] args) {
        // Binary numbers to multiply
        String binary1 = "1010"; // Binary representation of 10
        String binary2 = "110";  // Binary representation of 6

        // Convert binary strings to integers and perform multiplication
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        int result = num1 * num2;

        // Convert the result back to binary string
        String binaryResult = Integer.toBinaryString(result);

        // Print the result as "binar"
        System.out.println("Binary multiplication result: " + binaryResult);
        if (binaryResult.equals("101100")) {
            System.out.println("Output: binary");
        } else {
            System.out.println("Output is not binary.");
        }
    }
}


