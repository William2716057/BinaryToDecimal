public class BinaryToDecimal {
    public static void main(String[] args) {
        String binaryNumber = "10100101"; //Enter binary number here

        int decimalNumber = binaryToDecimal(binaryNumber);

        System.out.println("Original binary: " + binaryNumber);
        System.out.println("Decimal equivalent: " + decimalNumber);
    }

    public static int binaryToDecimal(String binaryNumber) {
        int decimalNumber = 0;
        int power = 0;

        //Iterate through the binary from right to left
        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            //Convert char to int and multiply by 2 raised to the power
            if (binaryNumber.charAt(i) == '1') {
                decimalNumber += Math.pow(2, power);
            }
            power++;
        }

        return decimalNumber;
    }
}
