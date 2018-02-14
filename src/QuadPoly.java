public class QuadPoly {

    double a;
    double b;
    double c;


    public QuadPoly(double x, double y, double z) {
        a = x;
        b = y;
        c = z;
        System.out.printf(+a + "x^2" + "+" + b + "x" + "+" + c);


    }

    public boolean equal(QuadPoly quadPoly) {
        if (a == quadPoly.a && b == quadPoly.b && c == quadPoly.c) {
            return true;
        }
        return false;

    }

    public boolean lessThan(QuadPoly quadPoly) {
        if (a < quadPoly.a && b < quadPoly.b && c < quadPoly.c) {
            return true;
        }

        return false;
    }


}


