public class AlphabetDigitsPatterns {

    public static void main(String[] args) {
        // --- LETTERS B TO Z ---
        printLetterB();
        printLetterC();
        printLetterD();
        printLetterE();
        printLetterF();
        printLetterG();
        printLetterH();
        printLetterI();
        printLetterJ();
        printLetterK();
        printLetterL();
        printLetterM();
        printLetterN();
        printLetterO();
        printLetterP();
        printLetterQ();
        printLetterR();
        printLetterS();
        printLetterT();
        printLetterU();
        printLetterV();
        printLetterW();
        printLetterX();
        printLetterY();
        printLetterZ();

        // --- DIGITS 0 TO 9 ---
        printDigit0();
        printDigit1();
        printDigit2();
        printDigit3();
        printDigit4();
        printDigit5();
        printDigit6();
        printDigit7();
        printDigit8();
        printDigit9();
    }

    // High-utility helper to generate standard 5x5 grids based on row/col formulas
    private static void printPattern(String label, PatternCondition condition) {
        System.out.println("--- " + label + " ---");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (condition.matches(i, j)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Functional interface to pass structural conditions
    interface PatternCondition {
        boolean matches(int i, int j);
    }

    // --- ALPHABET PATTERN DEFINITIONS ---

    static void printLetterB() {
        printPattern("B", (i, j) -> j == 1 || (i == 1 && j < 5) || (i == 3 && j < 5) || (i == 5 && j < 5) || (j == 5 && i != 1 && i != 3 && i != 5));
    }

    static void printLetterC() {
        printPattern("C", (i, j) -> (j == 1 && i != 1 && i != 5) || (i == 1 && j > 1) || (i == 5 && j > 1));
    }

    static void printLetterD() {
        printPattern("D", (i, j) -> j == 1 || (i == 1 && j < 5) || (i == 5 && j < 5) || (j == 5 && i != 1 && i != 5));
    }

    static void printLetterE() {
        printPattern("E", (i, j) -> j == 1 || i == 1 || i == 3 || i == 5);
    }

    static void printLetterF() {
        printPattern("F", (i, j) -> j == 1 || i == 1 || i == 3);
    }

    static void printLetterG() {
        printPattern("G", (i, j) -> (j == 1 && i != 1 && i != 5) || (i == 1 && j > 1) || (i == 5 && j > 1 && j < 5) || (j == 5 && i >= 3) || (i == 3 && j >= 3));
    }

    static void printLetterH() {
        printPattern("H", (i, j) -> j == 1 || j == 5 || i == 3);
    }

    static void printLetterI() {
        printPattern("I", (i, j) -> i == 1 || i == 5 || j == 3);
    }

    static void printLetterJ() {
        printPattern("J", (i, j) -> i == 1 || j == 3 || (i == 5 && j <= 3) || (j == 1 && i >= 4));
    }

    static void printLetterK() {
        printPattern("K", (i, j) -> j == 1 || j + i == 5 || i - j == 1);
    }

    static void printLetterL() {
        printPattern("L", (i, j) -> j == 1 || i == 5);
    }

    static void printLetterM() {
        printPattern("M", (i, j) -> j == 1 || j == 5 || (i == 2 && (j == 2 || j == 4)) || (i == 3 && j == 3));
    }

    static void printLetterN() {
        printPattern("N", (i, j) -> j == 1 || j == 5 || i == j);
    }

    static void printLetterO() {
        printPattern("O", (i, j) -> (j == 1 && i != 1 && i != 5) || (j == 5 && i != 1 && i != 5) || (i == 1 && j != 1 && j != 5) || (i == 5 && j != 1 && j != 5));
    }

    static void printLetterP() {
        printPattern("P", (i, j) -> j == 1 || i == 1 || i == 3 || (j == 5 && i <= 3));
    }

    static void printLetterQ() {
        printPattern("Q", (i, j) -> (j == 1 && i > 1 && i < 4) || (j == 4 && i > 1 && i < 4) || (i == 1 && j > 1 && j < 4) || (i == 4 && j > 1 && j < 4) || (i == j && i >= 3));
    }

    static void printLetterR() {
        printPattern("R", (i, j) -> j == 1 || i == 1 || i == 3 || (j == 5 && i <= 3) || (i - j == 0 && i >= 3));
    }

    static void printLetterS() {
        printPattern("S", (i, j) -> i == 1 || i == 3 || i == 5 || (j == 1 && i <= 3) || (j == 5 && i >= 3));
    }

    static void printLetterT() {
        printPattern("T", (i, j) -> i == 1 || j == 3);
    }

    static void printLetterU() {
        printPattern("U", (i, j) -> (j == 1 && i < 5) || (j == 5 && i < 5) || (i == 5 && j > 1 && j < 5));
    }

    static void printLetterV() {
        printPattern("V", (i, j) -> (i <= 3 && (j == 1 || j == 5)) || (i == 4 && (j == 2 || j == 4)) || (i == 5 && j == 3));
    }

    static void printLetterW() {
        printPattern("W", (i, j) -> j == 1 || j == 5 || (i == 4 && (j == 2 || j == 4)) || (i == 3 && j == 3));
    }

    static void printLetterX() {
        printPattern("X", (i, j) -> i == j || i + j == 6);
    }

    static void printLetterY() {
        printPattern("Y", (i, j) -> (i <= 3 && (i == j || i + j == 6)) || (i > 3 && j == 3));
    }

    static void printLetterZ() {
        printPattern("Z", (i, j) -> i == 1 || i == 5 || i + j == 6);
    }


    // --- DIGIT PATTERN DEFINITIONS ---

    static void printDigit0() {
        printPattern("0", (i, j) -> j == 1 || j == 5 || i == 1 || i == 5);
    }

    static void printDigit1() {
        printPattern("1", (i, j) -> j == 3 || (i == 2 && j == 2) || i == 5);
    }

    static void printDigit2() {
        printPattern("2", (i, j) -> i == 1 || i == 3 || i == 5 || (j == 5 && i <= 3) || (j == 1 && i >= 3));
    }

    static void printDigit3() {
        printPattern("3", (i, j) -> i == 1 || i == 3 || i == 5 || j == 5);
    }

    static void printDigit4() {
        printPattern("4", (i, j) -> j == 5 || i == 3 || (j == 1 && i <= 3));
    }

    static void printDigit5() {
        printPattern("5", (i, j) -> i == 1 || i == 3 || i == 5 || (j == 1 && i <= 3) || (j == 5 && i >= 3));
    }

    static void printDigit6() {
        printPattern("6", (i, j) -> j == 1 || i == 1 || i == 3 || i == 5 || (j == 5 && i >= 3));
    }

    static void printDigit7() {
        printPattern("7", (i, j) -> i == 1 || j == 5);
    }

    static void printDigit8() {
        printPattern("8", (i, j) -> j == 1 || j == 5 || i == 1 || i == 3 || i == 5);
    }

    static void printDigit9() {
        printPattern("9", (i, j) -> i == 1 || i == 3 || j == 5 || (j == 1 && i <= 3));
    }
}
