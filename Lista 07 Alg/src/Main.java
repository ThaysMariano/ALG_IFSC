import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1. Contar Caracteres: Escreva um programa que leia uma string fornecida pelo usuário e conte o número de
        //caracteres (incluindo espaços)


        //sout caracter.lenght() -> seria mais facil e nao precisaria do contador

        Scanner leitor = new Scanner(System.in);

        String caracter;

        System.out.println("Digite o texto para contar os caracteres");
        caracter = leitor.nextLine();
        int contador = 0;
        for (int i = 0; i < caracter.length(); i++) {
            contador++;
        }
        System.out.println(contador);


        //2. Palíndromo: Escreva um programa que verifique se uma string fornecida pelo usuário é um palíndromo
        //(lê-se da mesma forma de trás para frente).

        System.out.println("Digite o texto para verificar se é um palíndromo");

        String palavra;
        palavra = leitor.nextLine();
        palavra = palavra.replace(" ", "");        //retira espaços
        boolean palindromo = true;

        for (int i = 0; i < palavra.length() / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)) { // o -i para ir voltando
                palindromo = false;
                break;
            }
        }
        if (palindromo) {
            System.out.println("É palíndromo");
        } else {
            System.out.println("Não e palíndromo");
        }


        //3. Contar Vogais: Escreva um programa que conte o número de vogais em uma string fornecida pelo usuário.

        String vogal;
        System.out.println("Digite uma palavra para contar as vogais");
        vogal = leitor.nextLine();
        String vogalMinusculo = vogal.toLowerCase();

        char[] arrayLetras = {'a', 'e', 'i', 'o', 'u'};

        //corrigir
        int contar = 0;
        for (int i = 0; i < vogal.length(); i++) {
            char letra = vogalMinusculo.charAt(i);
            for (int j = 0; arrayLetras.length > j; j++) {
                if (letra == arrayLetras[j]) {
                    contar++;
                }
            }
        }
        System.out.println(contar + " vogais");

        // int contadoR=0;
        // for(int i = 0; i < vogal.length(); i++){
        //     char letra = vogal.charAt(i);
        //    if (letra=='a'){
        //         contadoR++;
        //     } else if (letra=='e') {
        //         contadoR++;
        //    }else if (letra =='i'){
        //         contadoR++;
        //     }else if (letra =='o'){
        //         contadoR++;
        //     }else if (letra =='u'){
        //         contadoR++;
        //     }
        // }
        // System.out.println(contadoR);


        //4. Remover Espaços: Escreva um programa que remova todos os espaços de uma string fornecida pelo
        //usuário.

        System.out.println("digite o texto para retirar os espaços");
        String Palavra;
        Palavra = leitor.nextLine();
        Palavra = Palavra.toLowerCase();
        String NovaPalavra = Palavra.replace(" ", "");        //retira espaços

        System.out.println(NovaPalavra);


        //5.5. Substituir Caracteres: Escreva um programa que substitua todos os espaços em uma string por um
        //caractere específico (por exemplo, ’-’). A string e o caractere devem ser fornecidos pelo usuário


        System.out.println("digite o texto para repor por um caracter os espaços");
        String frase;
        frase = leitor.nextLine();
        System.out.println("digite o item a ser reposto");
        char repor = leitor.next().charAt(0);
        leitor.nextLine();

        String NovaFrase = frase.replace(' ', repor);

        System.out.println(NovaFrase);

        //6.. Contar Palavras: Escreva um programa que conte o número de palavras em uma string fornecida pelo
        //usuário.

        System.out.println("digite uma frase para contar as palavras");
        String fraze = leitor.nextLine();
        int contadorPalavras = 1;

        for (int i = 0; i < fraze.length(); i++) {
            if (fraze.charAt(i) == ' ') {
                contadorPalavras++;
            }
        }
        System.out.println("exercicio 6: " + contadorPalavras + " palavras");


        //7. Encontrar a Maior Palavra: Escreva um programa que encontre a maior palavra em uma string fornecida
        //pelo usuário.

        System.out.println("digite uma frase para achar a maior palavra");
        String fraseInteira = leitor.nextLine();
        String[] pedaco = fraseInteira.split(" ");
        String maiorPalavra = pedaco[0];

        for (int i = 0; i < pedaco.length; i++) {
            if (pedaco[i].length() > maiorPalavra.length()) {
                maiorPalavra = pedaco[i];
            }
        }
            System.out.println("exercicio 7: " + maiorPalavra);


            //8. Anagrama: Escreva um programa que verifique se duas strings fornecidas pelo usuário são anagramas
            //(têm os mesmos caracteres em qualquer ordem).
        System.out.println("digite um texto para verificar se é um anagrama");
        String palavra1 = leitor.next();
        System.out.println("digite o outro texto");
        String palavra2 = leitor.next();
        if (palavra1.length() != palavra2.length()) {
            System.out.println("Não são anagramas!");
        } else {
            boolean anagrama = true;
            for (int i = 0; i < palavra1.length(); i++) {
                char letra = palavra1.charAt(i);
                int contador1 = 0;
                int contador2 = 0;
                for (int j = 0; j < palavra1.length(); j++) {
                    if (palavra1.charAt(j) == letra) {
                        contador1++;
                    }
                    if (palavra2.charAt(j) == letra) {
                        contador2++;
                    }
                }
                if (contador1 != contador2) {
                    anagrama = false;
                    System.out.println("Não são anagramas!");
                    break;
                }
            }
            if (anagrama) {
                System.out.println("São anagramas!");
            }
        }

leitor.nextLine();



            //9. . Converter para Camel Case: Escreva um programa que converta uma string fornecida pelo usuário para
            //o formato CamelCase.
        System.out.println("digite um texto para colocar em camelcase");
        palavra = leitor.nextLine();
        if (!palavra.contains(" ")) {
            System.out.println(palavra);
        } else {
            String[] palavrasCamelCase = palavra.split(" ");
            String palavraCamelCase = palavrasCamelCase[0].toLowerCase();
            for (int i = 1; i < palavrasCamelCase.length; i++) {
                palavraCamelCase = palavraCamelCase + palavrasCamelCase[i].substring(0, 1).toUpperCase() + palavrasCamelCase[i].substring(1).toLowerCase();
            }
            System.out.println(palavraCamelCase);
        }

        leitor.close();







        }
    }
