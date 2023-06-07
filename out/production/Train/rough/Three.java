package out.production.Train.rough;

public class Three {
    public static void main(String[] args) {
        // questionOne(10, 10);
        questionTwo(5);
    }

    // question-1

    public static void questionOne(int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("- ");
            }
            System.out.println();
        }
    }

    // question - 2

    public static void questionTwo(int r) {
        for (int i = 1; i < r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println("* ");
        }
    }

}
