import java.util.Scanner;

public class SwapNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero (a): ");
        int a = scanner.nextInt();

        System.out.print("Digite o numero (b): ");
        int b = scanner.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Troca realizada: a = " + a + ", b = " + b);
    }
}