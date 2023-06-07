package out.production.Train.rough;

public class Three {
    public static void main(String[] args) {
        questionOne(10, 10);
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

}
