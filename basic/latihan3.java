//menampilkan desimal java

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class latihan3 {

    public static void main(String[] args) {
        double num = 1.34567;
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println(df.format(num));
    }
}