

public class DegreeCategory {
    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);

        if (x >= 70) {
            System.out.println("The first class");
        } else if (60 <= x & x < 70) {
            System.out.println("Honours, second class, division one");
        } else if (50 <= x & x < 60) {
            System.out.println("Honours, second class, division two");
        } else if (40 <= x & x < 50) {
            System.out.println("Honours, third class");
        } else if (32 <= x & x < 40) {
            System.out.println("Pass / ordinary degree");
        } else if (x < 32) {
            System.out.println("Fail");
        }

    }
}
