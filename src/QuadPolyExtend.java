public class QuadPolyExtend  extends QuadPoly{


        double a;
        double b;
        double c;


        public QuadPolyExtend(double x, double y, double z) {
            a = x;
            b = y;
            c = z;



        }

        public boolean equal(QuadPolyExtend quadPoly) {
            if (a == quadPoly.a && b == quadPoly.b && c == quadPoly.c) {
                return true;
            }
            return false;

        }

        public boolean lessThan(QuadPolyExtend quadPoly) {
            if (a < quadPoly.a && b < quadPoly.b && c < quadPoly.c) {
                return true;
            }

            return false;
        }

    @Override
    public String toString() {
        return "QuadPolyExtend{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}




