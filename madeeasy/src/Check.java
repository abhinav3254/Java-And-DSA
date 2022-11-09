import java.text.NumberFormat;

public class Check {


        public static void main(String[] args) {
            double d = 123456789/10000;

            System.out.println(123456789/10000);

            NumberFormat nf = NumberFormat.getInstance();
            nf.setMaximumFractionDigits(0);

            System.out.println("Formatted number with commas: " + nf.format(d));
    }
}
