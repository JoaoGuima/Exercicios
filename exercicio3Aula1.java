import java.util.Scanner;

public class exercicio3Aula1 {

    public static void main(String[] args) {

        int num1;
        int num2;
        int num3;
        Scanner leitordeVariaveis = new Scanner(System.in);

        System.out.println("Informe o primeiro numero:");
        num1 = leitordeVariaveis.nextInt();

        System.out.println("Informe o segundo numero:");
        num2 = leitordeVariaveis.nextInt();

        System.out.println("Informe o terceiro numero:");
        num3 = leitordeVariaveis.nextInt();

        if (num1>=num2 && num1>=num3 && num2<=num3 ) {
            System.out.println("O numero " + num1 + " é o maior");
            System.out.println("O numero " + num2 + " é o menor");
        } else if(num1>=num2 && num1>=num3 && num3<=num2  ) {
            System.out.println("O numero " + num1 + " é maior");
            System.out.println("O numero " + num3 + " é menor");
        }
        else if (num2>=num1 && num2>=num3 && num1<=num3) {
            System.out.println("O numero " + num2 + " é maior");
            System.out.println("O numero " + num1 + " é menor");
        }
        else if (num2>=num1 && num2>=num3 && num3<=num1) {
            System.out.println("O numero " + num2 + " é maior");
            System.out.println("O numero " + num3 + " é menor");
        }
        else if (num3>=num1 && num3>=num2 && num1<=num2){
            System.out.println("O numero " + num3 + " é maior");
            System.out.println("O numero " + num1 + " é menor");
        }
        else if (num3>=num1 && num3>=num2 && num2<=num1) {
            System.out.println("O numero " + num3 + " é maior");
            System.out.println("O numero " + num2 + " é menor");
        }

        // Sim, eu muito provalvemento poderia ter encurtado e não fazer cada possibilidade, uma a uma,
        // mas não quis arriscar.

    }

}
