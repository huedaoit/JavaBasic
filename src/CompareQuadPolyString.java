public class CompareQuadPolyString {
    public static void main(String[] args) {

        int a1 = Integer.parseInt(args[0]);
        int b1 = Integer.parseInt(args[1]);
        int c1 = Integer.parseInt(args[2]);
        int a2 = Integer.parseInt(args[3]);
        int b2 = Integer.parseInt(args[4]);
        int c2 = Integer.parseInt(args[5]);


        QuadPolyExtend e1 = new QuadPolyExtend(a1, b1, c1);
        QuadPolyExtend e2 = new QuadPolyExtend(a2, b2, c2);


        if (e1.lessThan(e2)){
            System.out.println(e1+"smaller than" +e2);
        }
        if  (e1.equal(e2)){
            System.out.println(e1+"same with "+e2);
        }else {
            System.out.println(e2+"greater than"+e1 );
        }
    }

}
