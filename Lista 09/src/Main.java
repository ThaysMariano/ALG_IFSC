import java.util.Arrays;

import java.util.Scanner;

public class Main {

    static final double PI = 3.14;


    public static void main(String[] args) {
        //LISTA 09

        Scanner scanner = new Scanner(System.in);

        //01. Implemente um metodo para calcular a área de um retângulo a partir da base e da altura.
        double areaRetangulo = calcularAreaRetangulo(7, 3);
        System.out.println("area Retangulo: " + areaRetangulo);


        //02. implemente um metodo para calcular a área de um quadrado a partir do seu lado
        System.out.println("digite o lado do quadrado");
        double areaQuadrado = calcularAreaQuadrado(scanner.nextDouble()); //scanner mas tem que seguir o parametro
        System.out.println("area quadrado: " + areaQuadrado);


        //03. implemente um metodo para calcular o perímetro de um círculo a partir do seu raio.
        double perimetroCiruclo = calcularPerimetroCirculo(3);
        System.out.println("comprimento circulo: " + perimetroCiruclo);


        //04.Implemente um metodo para calcular a área de um círculo a partir do seu perímetro.
        double areaCirculo = calcularAreaCirculo(18.84);
        System.out.println("area circulo: " + areaCirculo);


        //05. implente um metodo para somar os dígitos de um número.
        double somaDigitos = calcularSomaDigitos(48375);
        System.out.println("soma dos digitos: " + somaDigitos);


        //06. implemente um metodo para calcular o MDC (máximo divisor comum) de dois números inteiros
        double MDC = calcularMDC(12, 15);
        System.out.println("Mdc: " + MDC);

        double mdcfacil = calcularMDCFacil(84, 27);
        System.out.println("MDC fácil: " + mdcfacil);


        //7. Altere o metodo do exercício anterior para calcular o MDC dos números em um array de inteiros.
        int[] numeros = {18, 48, 36};
        System.out.println("mdc array: " + calcularMDCArray(numeros));

        //8. Implemente um metodo para converter a temperatura de Celsius para Fahrenheit.
        System.out.println("Digite a temperatura em celcius");
        double fahrenheit = converterCelciusParaFahrenheit(scanner.nextDouble());
        System.out.println("Fahrenheit: " + fahrenheit);


        //9. Implemente um metodo para ordenar de forma crescente um array de inteiros.
//        int[] inteiros = {1, 5, 3, 7,2};
//        System.out.println("array crescente: "+ arrayFormaCrescente(inteiros));
        int[] vetor = {68, 84, 11, 15, 92, 2, 47, 53, 35};
        arrayFormaCrescenteModoBolha(vetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println(" ");


        //10. Implemente um metodo para ordenar de forma crescente um array de caracteres.
        char[] letras = {'a', 'd', 't', 'b', 'c'};
        charFormaCrescenteModoBolha(letras);
    }
        //METODOS

        //01
        static double calcularAreaRetangulo ( double base, double altura){        //ideal colocar verbo no nome
            return base * altura;
            //area = base*altura;
            //return area;
        }

        //02
        static double calcularAreaQuadrado ( double lado){
            //return lado*lado;
            return calcularAreaRetangulo(lado, lado);       //usou um metodo para resolver outro
        }


        //03
        static double calcularPerimetroCirculo ( double raio){
            double comprimento = 2 * PI * raio;
            return comprimento;
        }


        //04
        static double calcularAreaCirculo ( double perimetro){
            double raio = perimetro / (2 * PI);
            double area = PI * (raio * raio);
            return area;
        }

        //05
        static int calcularSomaDigitos ( int numero){
            int soma = 0;
            while (numero > 0) {
                int digito = numero % 10;
                numero = numero / 10;
                soma += digito;
            }
            return soma;
        }


        //06
        static int calcularMDC ( int a, int b){
            int mdc = 0;
            if (a < b) {
                mdc = a;
            } else {
                mdc = b;
            }

            do {
                int restoA = a % mdc;
                int restoB = b % mdc;

                if (restoA == 0 && restoB == 0) {
                    return mdc;
                }
                mdc--;

            } while (mdc > 0);
            return mdc;
        }

        //06.2
        static int calcularMDCFacil ( int a, int b){
            while (b != 0) {
                int r = a % b;
                a = b;
                b = r;
            }
            return a;
        }


        //07
        static int calcularMDCArray ( int[] numeros){
            int mdc = numeros[0];
            for (int i = 1; i < numeros.length; i++) {
                mdc = calcularMDCFacil(mdc, numeros[i]);            //mdc entre o mdc que ja tem e o numero na posicao i
            }
            return mdc;
        }


        //08
        static double converterCelciusParaFahrenheit ( double celcius){
            double fahrenheit = (1.8 * celcius) + 32;
            return fahrenheit;
        }

        //09 CORRIGIR
        static int[] arrayFormaCrescente ( int[] numeros){
            int[] novoarray = new int[numeros.length];
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    novoarray[i] = numeros[i + 1];//repete o 3
                } else {
                    novoarray[i] = numeros[i + 1];
                }
            }
            return numeros;
        }

        //09.2
        static int[] arrayFormaCrescenteModoBolha ( int[] vetor){
            for (int j = 0; j < vetor.length; j++) {
                for (int i = 0; i < vetor.length - 1 - j; i++) {
                    if (vetor[i] > vetor[i + 1]) {
                        int aux = vetor[i];
                        vetor[i] = vetor[i + 1];
                        vetor[i + 1] = aux;
                    }
                }
            }
            return vetor;
        }

        static char[] charFormaCrescenteModoBolha ( char[] vetor){
            for (int j = 0; j < vetor.length; j++) {
                for (int i = 0; i < vetor.length - 1 - j; i++) {
                    if (vetor[i] > vetor[i + 1]) {
                        char aux = vetor[i];
                        vetor[i] = vetor[i + 1];
                        vetor[i + 1] = aux;
                    }
                }
            }
            return vetor;
        }


    }
