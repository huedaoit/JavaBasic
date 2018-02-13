public class WorkFuture2 {

    public static void main(String[] args) {

        int presentYear = Integer.parseInt(args[0]);
        int yearOfBirth_1 = Integer.parseInt(args[1]);
        int yearOfBirth_2 = Integer.parseInt(args[2]);

        int year = 0;
        int sum_1;
        int sum_2;

        sum_1 = 68 - (presentYear - yearOfBirth_1);
        sum_2 = 68 - (presentYear - yearOfBirth_2);
        for (int i = presentYear; i <= presentYear + sum_1 + sum_2; i++) {
            year = i + 1;
            System.out.println("In " + year + " ps1 will has " + sum_1-- + " year and " + "ps2 will has " + sum_2-- + " year left work");

        }


    }
}

