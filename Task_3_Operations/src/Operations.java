public class Operations {
    public static void main(String[] args) {

        // logic operations &&, ||, !
        LogicOperations();

        // ternary operator
        TernaryOperator();

        // bitwise operations &, |, ^, ~
        BitwiseOperations();

        // shift operations >>, <<, >>>
        ShiftOperations();
    }

    public static void LogicOperations() {
        boolean A = true;
        boolean B = false;
        boolean C = false;


        boolean AandB = A && B;
        boolean BorC = B || C;
        boolean notA = !A;

        System.out.println("A AND B: " + AandB);
        System.out.println("B OR C: " + BorC);
        System.out.println("NOT A: " + notA);
        System.out.println();
    }

    public static void TernaryOperator() {
        int x = 2;
        int y = 4;
        int min = x < y ? x : y;
        System.out.println("MIN(x, y): " + min);
        System.out.println();
    }

    public static void BitwiseOperations() {
        int x = 0b101101;  // 45 in decimal
        int y = 0b011011;  // 27 in decimal

        int bitwiseAND = x & y;  // 001001 = 1001 = 9 in decimal
        System.out.println("Bitwise x AND y: " + bitwiseAND);

        int bitwiseOR = x | y;  // 111111 = 63 in decimal
        System.out.println("Bitwise x OR y: " + bitwiseOR);

        int bitwiseXOR = x ^ y;  // 110110 = 54 in decimal
        System.out.println("Bitwise x XOR y: " + bitwiseXOR);

        int bitwiseNOT = ~x;  // 11111111111111111111111111010010 = -46 in decimal
        System.out.println("Bitwise NOT x: " + bitwiseNOT);

        System.out.println();
    }

    public static void ShiftOperations() {
        int number1 = 0b0001000;  // 8 in decimal

        int shift = 2;
        int rightShift = number1 >> shift;  // 0000010 = 10 = 2 in decimal
        System.out.println("Right shift on " + shift + " for " + number1 + ": " + rightShift);

        int leftShift = number1 << shift; // 0100000 = 100000 = 32 in decimal
        System.out.println("Left shift on " + shift + " for " + number1 + ": " + leftShift);

        // for demonstration difference between >> and >>>
        System.out.println("\nDifference between >> and >>> for number = -2: ");
        int number2 = -2;

        int shift2 = 1;
        int rightShift2 = number2 >> shift2;
        System.out.println("Right shift on " + shift2 + " for " + number2 + ": " + rightShift2);

        int unsignedRightShift2 = number2 >>> shift2;
        System.out.println("Unsigned right shift on " + shift2 + " for " + number2 + ": " + unsignedRightShift2);

    }
}