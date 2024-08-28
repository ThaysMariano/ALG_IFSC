import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //01 numero de 1 a 5 por extenso
        int numero;
        System.out.println("Digite um numero de 1 a 5");
        numero = scanner.nextInt();
        switch (numero) {
            case 1:
                System.out.println("um");
                break;
            case 2:
                System.out.println("dois");
                break;
            case 3:
                System.out.println("tres");
                break;
            case 4:
                System.out.println("quatro");
                break;
            case 5:
                System.out.println("cinco");
                break;
            default:
                System.out.println("numero invalido");
        }

        //02 dia da semana por numeros
        int dia;
        System.out.println("Digite um numero de 1 a 7");
        dia = scanner.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            default:
                System.out.println("Sabado");
        }

        //03 calculadora basica
        int a, b;
        char operacao;

        System.out.println("Digite um numero");
        a = scanner.nextInt();
        System.out.println("Digite a operacao");
        operacao = scanner.next().charAt(0);
        System.out.println("Digite outro numero");
        b = scanner.nextInt();

        switch (operacao) {
            case '+':
                System.out.println("resultado= " + (a + b));
                break;
            case '-':
                System.out.println("resultado= " + (a - b));
                break;
            case '*':
                System.out.println("resultado= " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("nao e possivel");
                } else {
                    System.out.println("resultado= " + (a / b));
                }
                break;
            default:
                System.out.println("operacao invalida");
        }

        //04 recomendacao de filme por genero
        String filme;
        System.out.println("Digite uma categoria de filme");
        filme = scanner.next();
        switch (filme) {
            case "terror":
                System.out.println("Recomendacao: Hereditario");
                break;
            case "comedia":
                System.out.println("Recomendacao: Superbad");
                break;
            case "animacao":
                System.out.println("Recomendacao: Megamente");
                break;
            case "infantil":
                System.out.println("Recomendacao: Patrulha Canina");
                break;
            default:
                System.out.println("Categoria nao reconhecida");
        }


        //05 classificacao por idade
        int idade;
        System.out.println("Digite a idade");
        idade = scanner.nextInt();
        switch (idade){
            case 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17:
                System.out.println("Categoria: Menor de idade");
                break;
            case  18,19,20,21,22,23,24,25:
                System.out.println("Categoria: Jovem");
                break;
            case 26,27,28,2930,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59:
                System.out.println("Categoria: Adulto");
                break;
            default:
                System.out.println("Categoria: Idoso");
                break;
        }
        //06 sugestao atividade por dia da semana
        String diaSemana;
        System.out.println("Digite um dia da semana para ver uma atividade");
        diaSemana = scanner.next();

        switch (diaSemana){
            case "domingo":
                System.out.println("Sugestao de atividade: X");
                break;
            case "segunda":
                System.out.println("Sugestao de atividade: Y");
                break;
            case "terca":
                System.out.println("Sugestao de atividade: Z");
                break;
            case "quarta":
                System.out.println("Sugestao de atividade: W");
                break;
            case "quinta":
                System.out.println("Sugestao de atividade: R");
                break;
            case "sexta":
                System.out.println("Sugestao de atividade: E");
                break;
            default:
                System.out.println("Sugestao de atividade: Q");
        }

        //07 notas e media
        double nota1, nota2, media;
        System.out.println("Digite duas notas");
        nota1= scanner.nextDouble();
        nota2= scanner.nextDouble();
        media = (nota1+nota2)/2;
        System.out.println("Sua média é " +media);
        switch ((int) media){   //pq int?
            case 7, 8 , 9:
                System.out.println("Aprovado");
                break;
            case 10:
                System.out.println("Aprovado com distincao");
                break;
            default:
                System.out.println("reprovado");
                break;
        }

        //08 vogal ou consoante
        String letra;
        System.out.println("Digite uma letra");
        letra = scanner.next();
        switch (letra){
            case "a","e","i","o","u":
                System.out.println("A letra" + letra + "é uma vogal");
                break;
            default:
                System.out.println("A letra" + letra + "é uma consoante");
                break;
        }

        //09 numero de dias de um mes
        int numeroMes;
        System.out.println("Digite um numero");
        numeroMes = scanner.nextInt();
        switch (numeroMes){
            case 1:
                System.out.println("janeiro tem 31 dias");
                break;
            case 2:
                System.out.println("fevereiro tem 28 dias");
                break;
            case 3:
                System.out.println("Março tem 31 dias");
                break;
            case 4:
                System.out.println("Abril tem 30 dias");
                break;
            case 5:
                System.out.println("Maio tem 31 dias");
                break;
            case 6:
                System.out.println("junho tem 30 dias");
                break;
            case 7:
                System.out.println("Julho tem 31 dias");
                break;
            case 8:
                System.out.println("Agosto tem 31 dias");
                break;
            case 9:
                System.out.println("Setembro tem 30 dias");
                break;
            case 10:
                System.out.println("Outubro tem 31 dias");
                break;
            case 11:
                System.out.println("NOvembro tem 30 dias");
                break;
            case 12:
                System.out.println("Dezembro tem 31 dias");
                break;
            default:
                System.out.println("Sem informacao");
                break;

        }

    }
}