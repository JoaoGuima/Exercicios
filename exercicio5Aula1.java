import java.util.Scanner;

public class exercicio5Aula1 {
    public static void main(String[] args) {

        int dia;
        int mes;
        int ano;
        Scanner leitordeVariaveis = new Scanner(System.in);

        System.out.println("Informe o dia de seu aniversário:");
        dia = leitordeVariaveis.nextInt();

        System.out.println("Informe o mês de seu aniversário:");
        mes = leitordeVariaveis.nextInt();

        System.out.println("Informe seu ano de nascimento:");
        ano = leitordeVariaveis.nextInt();

        if (dia>31){
            System.out.println("O dia colocado é inválido, pois não existe um mes com mais de 31 dias");
        } else {
            System.out.println("Dados válidos");
        }

        if (mes>12) {
            System.out.println("O mes colocado é inválido, pois não exitem mais de 12 meses");
        } else {
            System.out.println("Dados válidos");
        }

        if (ano>2020) {
            System.out.println("O ano colocado é inválido, pois não passamos de 2020");
        } else {
            System.out.println("Dados válidos");
        }



    }
}
