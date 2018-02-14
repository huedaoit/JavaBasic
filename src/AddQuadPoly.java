public class AddQuadPoly {

    public static void main(String[] args) {

        int a1 = Integer.parseInt(args[0]);
        int b1 = Integer.parseInt(args[1]);
        int c1 = Integer.parseInt(args[2]);
        int a2 = Integer.parseInt(args[3]);
        int b2 = Integer.parseInt(args[4]);
        int c2 = Integer.parseInt(args[5]);


        QuadPoly q1 = new QuadPoly(a1, b1, c1);
        System.out.printf("\n");
        QuadPoly q2 = new QuadPoly(a2, b2, c2);
        System.out.printf("\n");
        QuadPoly q3 = add(q1, q2);

    }

    private static QuadPoly add(QuadPoly q1, QuadPoly q2) {
        return new QuadPoly(q1.a + q2.a, q1.b + q2.b, q1.c + q2.c);
    }


}
