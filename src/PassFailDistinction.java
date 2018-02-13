public class PassFailDistinction {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        if (x >= 50) {
            System.out.println("Pass");

        } else {
            System.out.println("Fail");
        }
        if (x >= 70) {
            System.out.println("Distinction");
           } else {
                System.out.println("(no second line)");
            }

        }

}
