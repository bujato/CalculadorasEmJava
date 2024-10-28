import java.util.Locale;
import java.util.Scanner;

public class imcCalc {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
				
        double peso, altura;

		System.out.println("===================");
        System.out.println("Qual o seu peso? ");
        peso = sc.nextDouble();
	    System.out.println("===================");

        System.out.println("Qual é a sua altura?");
        altura = sc.nextDouble();

      	double imc = peso / Math.pow(altura, 2);

   		System.out.println("===================");
      	System.out.printf("Seu IMC é: ");
        System.out.printf("Seu peso sendo: %.2f, e sua altura sendo: %.2f. Seu IMC é: %.2f%n", peso, altura, imc);
 	    System.out.println("===================");

      	if(imc < 17){
      		System.out.println("Você está muito abaixo do peso");
      	} 
      	else if(imc >= 17 && imc <= 18.49) {
      		System.out.println("Você está abaixo do peso");
      	}
      	else if(imc >= 18.50 && imc <= 24.99) {
      		System.out.println("Você está com o peso normal");
      	}
      	else if(imc >= 25 && imc <= 29.99) {
      		System.out.println("Você está acima do peso");
      	}
      	else if(imc >= 30 && imc <= 34.99) {
      		System.out.println("Você está com obesidade I");
      	}
      	else if(imc >= 35 && imc <= 39.99) {
      		System.out.println("Você está com obesidade II (severa)");
      	}
      	else if(imc > 40) {
      		System.out.println("Você está com obesidade III (mórbida)");
      	}
	    System.out.println("===================");
      
      	sc.close();
	}
}
