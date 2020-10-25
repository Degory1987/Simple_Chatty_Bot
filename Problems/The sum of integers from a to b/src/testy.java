import java.util.Scanner;

class Sum {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sumDvi6 = 0;

        for (int i = 0; n % 6 == 0; i++) {

            sumDvi6 += n;
        }

        System.out.println(sumDvi6);
    }
}