public class DivideCake4 {

    public static void main(String[] args) {
        int girl1 = Integer.parseInt(args[0]);
        int girl2 = Integer.parseInt(args[1]);
        int girl3 = Integer.parseInt(args[2]);
        int girl4 = Integer.parseInt(args[3]);

        getGirl12(girl1, girl2);
        getGirl34(girl3, girl4);
    }

    public static void getGirl34(int girl3, int girl4) {
        int common_greatest;
        common_greatest = (girl3 + girl4) / 2;

        System.out.println("the greatest common of girl 3 and 4 is :" + common_greatest);
    }

    public static void getGirl12(int girl1, int girl2) {
        int common_greatest1 = (girl1 + girl2) / 2;
        System.out.println("the greatest common of girl 1 and 3 is :" + common_greatest1);

    }

}
