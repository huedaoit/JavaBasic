public class WorkFuture4 {

    public static void main(String[] args) {

        int presentOfYear = Integer.parseInt(args[0]);
        int p1 = Integer.parseInt(args[1]);
        int p2 = Integer.parseInt(args[2]);
        int p3 = Integer.parseInt(args[3]);
        int p4 = Integer.parseInt(args[4]);

        getPerson1(presentOfYear, p1);
        getPerson2(presentOfYear, p2);
        getPerson3(presentOfYear, p3);
        getPerson4(presentOfYear, p4);

    }

    private static void getPerson4(int presentOfYear, int p4) {
        int sum4;
        sum4 = 68 - (presentOfYear - p4);
        System.out.println(" so nawm nghi huu la: " + sum4);
    }

    private static void getPerson3(int presentOfYear, int p3) {
        int sum3;
        sum3 = 68 - (presentOfYear - p3);
        System.out.println(" so nawm nghi huu la: " + sum3);
    }

    private static void getPerson2(int presentOfYear, int p2) {
        int sum2;
        sum2 = 68 - (presentOfYear - p2);
        System.out.println(" so nawm nghi huu la: " + sum2);
    }

    public static void getPerson1(int presentOfYear, int p1) {

        int sum1;
        sum1 = 68 - (presentOfYear - p1);
        System.out.println(" so nawm nghi huu la: " + sum1);

    }

}
