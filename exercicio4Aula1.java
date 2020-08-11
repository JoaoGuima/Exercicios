import java.util.Scanner;

public class exercicio4Aula1 {
    public static void main(String[] args) {


        int idade;
        Scanner leitorDaIdade = new Scanner(System.in);

        System.out.println("Informe sua idade:");
        idade = leitorDaIdade.nextInt();

        if (idade>=18 && idade<=67){
            System.out.println("Você pode doar sangue");
        } else {
            System.out.println("Você não pode doar sangue");
        }

    }
}
