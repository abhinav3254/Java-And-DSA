package Java;

public class GenricsOne <T> {
    T i;
    T j;

    public T chk() {
        return i;
    }
}

class One {
    public static void main(String[] args) {
        GenricsOne genricsOne = new GenricsOne();
        System.out.println(genricsOne.chk());
    }
}
