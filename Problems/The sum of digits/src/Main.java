import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        int a = number % 10;
        int b = number / 10 % 10;
        int c = number / 100;

        int result = a + b + c;

        System.out.println(result);
    }
}
