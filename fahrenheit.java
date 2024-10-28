import java.util.Scanner;

public class fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Temperatura em Celsius");
        int celsius;
        celsius = sc.nextInt();

        int fahrenheits = ((9 * celsius)/5) + 32;

        System.out.printf("Temperatura em Fahrenheits é: %d", fahrenheits);
        sc.close();
    }
}
