import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1. Soma dos elementos: Crie um algoritmo que recebe um array de números inteiros e imprime a soma de
        // todos os elementos.

        Scanner leitor = new Scanner(System.in);


        int[] inteiros = {6, 4, 63, 82, 10, 12, 45, 19, 25, 6, 6, 6};
        int soma = 0;
        for (int i = 0; i < inteiros.length; i++) {
            soma = soma + inteiros[i];
        }
        System.out.println("exercicio 1: " + soma);


        // 2. Média dos elementos: Crie um algoritmo que calcula a média dos elementos em um array de números
        //inteiros.


        double media = (double) soma / inteiros.length;
        System.out.println("exercicio 2: " + media);


        //. 3 Menor elemento: Desenvolva um algoritmo que encontre e exiba o menor elemento em um array de
        //números inteiros.

        int menorElemento = inteiros[0];
        for (int i = 0; i < inteiros.length; i++) {
            if (inteiros[i] < menorElemento) {
                menorElemento = inteiros[i];
            }
        }
        System.out.println("exercicio 3: " + menorElemento);



        //4. Segundo maior elemento: Escreva um algoritmo para encontrar o segundo maior número em um array
        //de inteiros.

//        int[] maiores= new int[2];
//        int maiorElemento = inteiros[0];
//        int segundoMaior=0;
//        int indice = 0;
//        for (int i = 0; i < inteiros.length; i++) {
//            if (inteiros[i] > maiorElemento) {
//                maiorElemento = inteiros[i];
//                indice = i;
//            }
//        }
//            System.out.println("DIFexercicio 4 : maior elemento: " + maiorElemento + " indice:  "+indice);

        //gabarito professor
        int[] numeros = {5, 3, 2, 4, 1};  //se o primeiro for o maior da erro
        int maior = numeros[0];
        int segundoMaior = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
               segundoMaior = maior;
                maior = numeros[i];
            } else if (numeros[i] > segundoMaior) {
                segundoMaior = numeros[i];
            }
        }

        System.out.println("exercicio 4: " + segundoMaior);


        //5. Contagem de elementos ímpares: Implemente um algoritmo que conte e exiba a quantidade de números
        //ímpares em um array de inteiros.

        int impar = 0;
        for (int i = 0; i < inteiros.length; i++) {
            if (inteiros[i] % 2 != 0) {
                impar++;
            }
        }
        System.out.println("exercicio 5: " + impar + "numeros impares");

        // 6. Frequência de um número: Crie um algoritmo que conte e exiba a frequência de um número específico
        //em um array de inteiros.

        int contador6 = 0;

        for (int i = 0; i < inteiros.length; i++) {
            if (inteiros[i] == 6) {
                contador6++;
            }
        }

        System.out.println("exercicio 6: 6 aparece " + contador6 + " vezes");

        // 7.Inversão do array: Escreva um algoritmo que inverta a ordem dos elementos em um array e exiba o array
        //resultante

        int[] novoInteiros = new int[inteiros.length];

        for (int i = inteiros.length - 1; i >= 0; i--) {
            novoInteiros[(inteiros.length - 1 - i)] = inteiros[i];

        }
        for (int i = 0; i < inteiros.length; i++) {
            System.out.println("exercicio 7: " + novoInteiros[i]);
        }

        //8. verificar se um número está presente: Crie um algoritmo que verifica se um determinado número está
        //presente em um array de inteiros e exibe "Sim"ou "Não".

        int numeroPresente = 2655;
        boolean presente = false;
        for (int i = 0; i < inteiros.length; i++) {
            if (inteiros[i] == numeroPresente) {
                presente = true;
                break;
            }
        }

        if (presente) {
            System.out.println("exercicio 8: O numero " + numeroPresente + " está presente");
        } else {
            System.out.println("exercicio 8: O numero " + numeroPresente + " não está presente");
        }


        //9. Verificar se um aluno está presente: Crie um array de strings contendo nomes de alunos. Em seguida,
        //solicite ao usuário que insira um nome e verifique se ele está presente no array.

        String[] alunos = {"Ana", "Bruno", "Vitoria", "Henrique", "Carla"};
        boolean esta = false;
        System.out.println("digite um nome");
        String nomeSelecionado = leitor.next();
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].equals(nomeSelecionado)) {
                esta = true;
                break;
            }
        }
        if (esta) {
            System.out.println("exercicio 9: " + nomeSelecionado + "presente");
        } else {
            System.out.println("exercicio 9: " + nomeSelecionado + " nâo está presente");
        }

        //10. Encontrar o índice: Escreva um algoritmo para encontrar o índice de um elemento específico em um
        //array de inteiros.

        int numeroEspecifico = 82;
        boolean achou = false;
        int indicee = 0;
        for (int i = 0; i < inteiros.length; i++) {
            if (inteiros[i] == numeroEspecifico) {
                achou = true;
                indicee = i;
                break;
            }
        }
        if (achou) {
            System.out.println("exercicio 10: achou o numero na posição " + indicee);
        } else {
            System.out.println("exercicio 10: nao achou o numero");
        }

        //11.. Comparar arrays: Crie dois arrays de inteiros e verifique se eles são iguais (ou seja, se contêm os mesmos
        //elementos na mesma ordem).

        boolean iguais = true;
        int[] inteiros20 = {6, 4, 63, 82, 10, 12, 45, 19, 25, 6, 6, 6};

        // if(inteiros.length!=inteiros20.length){
        //    System.out.println("exercicio 11: São diferentes");
        //    iguais = false;
        // }else{
        for (int i = 0; i < inteiros.length; i++) {
            if (inteiros[i] != inteiros20[i]) {
                iguais = false;
                break;
            }

            // }


        }
        if (iguais) {
            System.out.println("exercicio 11: sao iguais");
        } else {
            System.out.println("exercicio 11:nao sao iguais");
        }

        //12.  Remover elemento: Desenvolva um algoritmo que remova um elemento específico de um array de inteiros
        //e exiba o array resultante.
        System.out.println("digite um numero para remover");
        int numeroo = leitor.nextInt();
        int[] numeross = {12, 14, 153, 65, 213, 23};
        int tamanho = numeross.length;

        for (int i = 0; i < tamanho; i++) {
            if (numeroo == numeross[i]) {
                for (int j = i; j < tamanho - 1; j++) {
                    numeross[j] = numeross[j + 1];
                }
                tamanho--;
                break;
            }
        }
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Exercicic 12: " + numeross[i]);
        }


        //13.União de arrays: Escreva um algoritmo que una dois arrays de inteiros em um único array e exiba o array
        //resultante.

        int[] uniao = new int[inteiros.length + inteiros20.length];

        for (int i = 0; i < inteiros.length; i++) {
            uniao[i] = inteiros[i];
        }
        int add = 0;
        for (int i = inteiros.length; i < (inteiros.length + inteiros20.length); i++) {
            uniao[i] = inteiros20[add];
            add++;
        }
        System.out.print("exercicio 13: ");
        for (int i = 0; i < uniao.length; i++) {

            System.out.print(+uniao[i]);
            System.out.print(" ");
        }
        System.out.println(" ");


        //ARRUMAR
        //14. Interseção de arrays: Crie um algoritmo que encontre e exiba os elementos comuns em dois arrays de
        //inteiros.
        int num = 0;
        boolean numeroIgual = false;

        int[]num1= {1, 4, 7, 9,10, 14};
        int[]num2={2, 4, 7,23,65,8};
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                if (num2[j] == num1[i]) {
                    System.out.println(".."+num1[j]);
//                    numeroIgual = true;
//                    inteiros20[j] = num;
//                    break;
                }
            }
        }
//        if (numeroIgual) {
//            System.out.println("exercicio 14: numero " + num + " esta nos dois arrays");
//        } else {
//            System.out.println("exercicio 14: nao se repetem");
//        }




        //15. Verificar se um array é palíndromo: Implemente um algoritmo que verifica se um array de caracteres
        //forma um palíndromo.

        int[] palindormo1 = {1, 2, 6, 5, 5, 3, 2, 1};
        int[] newpalindromo = new int[palindormo1.length];

        boolean palindromo = true;
        for (int i = palindormo1.length - 1; i >= 0; i--) {
            newpalindromo[(palindormo1.length - 1 - i)] = palindormo1[i];
        }
        for (int i = 0; i < palindormo1.length; i++) {
            if (palindormo1[i] != newpalindromo[i]) {
                palindromo = false;
                break;
            }
        }
        if (palindromo) {
            System.out.println("exercicio 15: é palindromo");
        } else {
            System.out.println("exercicio 15: não é palindromo");
        }








    }
    }


