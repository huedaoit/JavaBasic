
public class RoundPennies {
    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        int z = 0;

        if (x < 50) {
            z = x / 100;
        } else if (x > 50 & x <= 149) {
            z = x / 100;
        } else if (x == 749) {
            z = x / 100;
        } else if (750 < x & x <= 751) {
            z = x / 100;
        } else if (750 < x & x <= 751) {
            z = x / 100;
        } else if (850 < x & x <= 851) {
            z = x / 100;
        } else if (x == 1000) {
            z = x / 100;
        }

        System.out.print(z);


    }

}
