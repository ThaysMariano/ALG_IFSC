import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //1. Soma dos Elementos: Escreva um programa para calcular a soma dos elementos de uma matriz.
        int[][] matriz1 = {
                {1, 2, 3},
                {100, 200, 100},
                {80, 90, 100},
        };

        int soma = 0;
        for( int  i= 0; i <matriz1.length; i++){
            for (int j = 0; j<matriz1.length; j++){
                soma += matriz1[i][j];
            }
        }
        System.out.println(soma);


        //2. Média dos Elementos: Escreva um programa para calcular a média dos elementos de uma matriz

        int numElementos = matriz1.length * matriz1[0].length;
        double media = (double) (soma/numElementos);
        System.out.println(media);


        //3. Maior Elemento: Escreva um programa para encontrar o maior elemento de uma matriz.

        //posicao 0 0
        int maior = matriz1[0][0];              //ja inicia com o primeiro numero  da matriz como maior para ir testando

        for(int i = 0; i <matriz1.length; i++){
            for (int j = 0; j <matriz1[i].length; j++){
                if(matriz1[i][j]> maior){
                    maior = matriz1[i][j];
                }
            }
        }
        System.out.println(maior);


        // 4. Média das Linhas/Colunas: Calcule a média de cada linha e de cada coluna de uma matriz

        for(int i = 0; i <matriz1.length; i++) {
            double mediaLinhas = 0;
            for (int j = 0; j < matriz1[i].length; j++) {           //percorre as colunas de cada linha
                mediaLinhas += matriz1[i][j];                         //somando os valores que estao nas linhas

            }
            mediaLinhas = mediaLinhas/matriz1[i].length;
            System.out.println("media linhas: " + i + ": " + mediaLinhas);
        }

        //inverteu os for
        for(int i = 0; i <matriz1.length; i++) {
            double mediaColuna = 0;
            for (int j = 0; j < matriz1[i].length; j++) {
                mediaColuna += matriz1[j][i];                     //inverteu aqui em comparacao a aterior
            }
            mediaColuna = mediaColuna/matriz1.length;
            System.out.println("media Coluna: " + i + ": " + mediaColuna);
        }

        //5. Matriz Identidade: Escreva um programa para criar uma matriz identidade de tamanho n × n.
        //i=j -->1    i!=j -->0

        int n =7;
        int[][] identidade = new int[n][n];

        for(int i = 0; i <identidade.length; i++) {
            for (int j = 0; j < identidade[i].length; j++) {
                if (i == j) {
                    identidade[i][j]=1;             //posicao i por j
                }
                else {
                    identidade[i][j]=0;
                }
                System.out.print(identidade[i][j] + " ");
            }
            System.out.println(" ");            //para quebrar a linha
        }

        //6. Produto Escalar: Implemente uma função que calcule o produto escalar de duas matrizes.

        System.out.println("Digite um numero");
        int numInteiro = leitor.nextInt();
        int[] matriz = {3, 5, 7};
        int[] resultado = new int[matriz.length];

        for(int i = 0; i<matriz.length; i++){
            resultado[i]=matriz[i]*numInteiro;
        }
        for(int i = 0; i< matriz.length; i++){
            System.out.println("exercicio 6: "+resultado[i]);
        }

        //7. 7. Transposição de Matriz: Escreva um código para transpor uma matriz dada.

        int[][] matrizNormal = {
                {1, 2, 39},
                {4, 55, 6,},
                 {77, 8, 9},
        };

        int [][] matrizTransposta = new int[matrizNormal.length][matrizNormal.length];

        for (int i =0; i<matrizNormal.length; i++){
            for( int j= 0; j<matrizNormal.length; j++){
                matrizTransposta[i][j]=matrizNormal[j][i];
                System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println(" ");
        }

        // 8. Multiplicação de Matrizes: Implemente a multiplicação de matrizes.

        int[][] matrizOne = {  //(2x2
                {3, 7},
                {8, 10},
        };
        int[][] matrizTwo = {  //2x1
                {3},
                {12},
        };
        int [][] matrizResultado = new int[matrizOne.length][matrizTwo[0].length];

        for(int i =0; i<matrizOne.length; i++){
            for (int j=0; j<matrizTwo[0].length; j++) {
                for (int k = 0; k < matrizOne[0].length; k++) {
                    matrizResultado[i][j] = matrizResultado[i][j] + matrizOne[i][k] * matrizTwo[k][j];

                }
            }
        }
        for ( int i = 0; i< matrizResultado.length; i++) {
            for (int j = 0; j < matrizResultado[i].length; j++) {
                System.out.print("exercicio 8: "+matrizResultado[i][j] + " ");
            }
            System.out.println(" ");
        }










    }

}