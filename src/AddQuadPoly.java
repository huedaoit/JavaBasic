public class AddQuadPoly {

    public static void main(String[] args) {

        int a1 = Integer.parseInt(args[0]);
        int b1 = Integer.parseInt(args[1]);
        int c1 = Integer.parseInt(args[2]);
        int a2 = Integer.parseInt(args[3]);
        int b2 = Integer.parseInt(args[4]);
        int c2 = Integer.parseInt(args[5]);

        QuadPoly q1 = new QuadPoly();
        QuadPoly q2 = new QuadPoly();
        QuadPoly q3 = q1.add(q2);

    }

}
