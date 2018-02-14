public class CompareQuadPoly {


    public static void main(String[] args) {

        int a1 = Integer.parseInt(args[0]);
        int b1 = Integer.parseInt(args[1]);
        int c1 = Integer.parseInt(args[2]);
        int a2 = Integer.parseInt(args[3]);
        int b2 = Integer.parseInt(args[4]);
        int c2 = Integer.parseInt(args[5]);


        QuadPoly e1 = new QuadPoly(a1, b1, c1);
        QuadPoly e2 = new QuadPoly(a2, b2, c2);

        if (e1.equal(e2)) {
            System.out.printf("The polynomial:" + e1.a + "x^2" + "+" + e1.b + "x" + "+" + e1.c + "\n");
            System.out.printf(" same as      :" + e2.a + "x^2" + "+" + e2.b + "x" + "+" + e2.c);
        } else if (e2.lessThan(e1)) {
            System.out.printf("The polynomial:" + e2.a + "x^2" + "+" + e2.b + "x" + "+" + e2.c + "\n");

            System.out.printf("smaller than  : " + e1.a + "x^2" + "+" + e1.b + "x" + "+" + e1.c);

        } else {
            System.out.printf("The polynomial:" + e2.a + "x^2" + "+" + e2.b + "x" + "+" + e2.c + "\n");

            System.out.printf("greater than  :" + e1.a + "x^2" + "+" + e1.b + "x" + "+" + e1.c);


        }


    }
}
