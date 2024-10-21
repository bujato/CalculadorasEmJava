import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Qual operação o senhor deseja realizar? (soma / divisao / subtracao / multiplicacao)");

        String operacao;
        double num1, num2;

        operacao = sc.next();
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        if (operacao.equals("soma")) {
            double soma = num1 + num2;
            System.out.printf("A soma entre os números %.2f e %.2f deu um total de: %.2f", num1, num2, soma);
        } 
        else if (operacao.equalsIgnoreCase("divisao")) {
            double divisao = num1 / num2;
            System.out.printf("A divisão entre os números %.2f e %.2f deu um total de: %.2f ", num1, num2, divisao);
        } 
        else if (operacao.equalsIgnoreCase("subtracao")) {
            double subtracao = num1 - num2;
            System.out.printf("A subtração entre os números %.2f e %.2f deu um total de: %.2f", num1, num2, subtracao);
        } 
        else if (operacao.equalsIgnoreCase("multiplicacao")) {
            double multiplicacao = num1 * num2;
            System.out.printf("A multiplicação entre os números %.2f e %.2f deu um total de: %.2f", num1, num2, multiplicacao);
        }

        sc.close();
    }
}

