public class DivideCake3 {

    public static void main(String[] args){

        int girl1 = Integer.parseInt(args[0]);
        int girl2 = Integer.parseInt(args[1]);
        int girl3 = Integer.parseInt(args[2]);
        int common1;
        int common2;

        common1 = (girl1 + girl2)/2;
        common2 = ( common1 +girl3)/2;

        System.out.println(common1+',' +common2);



    }
}
