public class MaxList {

    public static void main(String[] args) {

        double x = args.length;
        double maxsofar = 0;

        for (int i = 0; i < x; i++) {

            if (maxsofar < x) {
                maxsofar = x;
                System.out.println(" the maximum of number in the list of  numbers:"+maxsofar);
            }


        }

    }
}
