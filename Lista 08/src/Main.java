public class Main {
    public static void main(String[] args) {

        //1. Escreva um metodo chamado soma que retorne a soma de três números inteiros.
        //int resultado = soma(1, 8, 1);
        System.out.println("exercicio 1: "+soma(1,8,1));


        //2. Altere o metodo soma para que ele receba como parâmetro um array de inteiros e retorne a soma dos
        //valores no array.

        int[] numeros = { 1, 9, 3, 54, 23, 78};
        int resultadoArray = soma(numeros);
        System.out.println("exercicio 2: "+resultadoArray);


        //3. Escreva um metodo chamado calculaMedia que retorne a média dos valores em um array de inteiros.
        //ja tem o metodo de soma

        System.out.println("exercicio 3: "+ calculaMedia(numeros));



        //4. Escreva um metodo chamado localizaMaior que receba um array de inteiros e retorne o maior valor do
        //array
        //us ao metodo localizaMaior no array numeros
        System.out.println("exercicio 4: "+localizaMaior(numeros));



        //5. Escreva um metodo chamado contaVogais que receba uma string como parâmetro e retorne a quantidade
        //de vogais na string.

        String palavra =  "arara";
        int numeroDeVogais = contaVogais(palavra);
        System.out.println("exercicio 5: modo1 "+numeroDeVogais);
        System.out.println("exercicio 5: modo2 "+contaVogais(palavra));



        // 6. Escreva um metodo chamado contaCaracteres que receba uma string e um caractere como parâmetro e
        //retorne a quantidade de vezes que o caractere aparece na string.

        int numerodeCaracteres = contaCaracteres(palavra, 'n');
        System.out.println("exercicio 6: "+numerodeCaracteres);



        //7. Escreva um metodo chamado inverteString que receba uma string como parâmetro e retorne a string
        //invertida.
        String palavraInvertida = inverteString(palavra);
        System.out.println("exercicio 7: "+palavraInvertida);



        //8 Escreva um metodo chamado ehPalindromo que receba uma string como parâmetro e verifique se a string
        //é um palíndromo. Utilize o metodo inverteString para auxilizar na verificação.

        System.out.println("exercicio 8: "+ ehPalindromo(palavra));



        //9. Escreva um metodo chamado fill que receba um array de inteiros e preencha o array com o valor
        //informado pelo usuário.


        //10 Escreva um método chamado zeraArray que receba um array de inteiros e zere todos os valores do array.



        //11. Escreva um método chamado localizaMeio para exibir o caractere do meio de uma string. Se o comprimento da string for ímpar, haverá dois caracteres do meio. Se o comprimento da string for par, haverá um
        //caractere do meio.


        System.out.println(somaa(5,8));


    }

    //01
    //metodo- () indica os parametros, o que entra no metodo
    // dentro das chaves é que acontecerá com os itens
    // static pois nao utiliza orientação a objetos
    static int soma(int a,int b,int c){
        return a + b + c;
    }


    //02
    static int soma (int[] inteiros){
        int resultado=0;
        for (int i = 0; i< inteiros.length; i++){
            resultado = resultado + inteiros[i];
        }
        return resultado;
    }

    //03

    static double calculaMedia(int[] inteiros){
        return (double) soma(inteiros)/ inteiros.length;
    }


    //04

    static int localizaMaior (int[] inteiros){
        int maior=inteiros[0];
        for (int i = 0; i< inteiros.length; i++){
            if(inteiros[i]> maior){
                maior = inteiros[i];
            }
        }
        return maior;
    }

    //05
    //int pois é o que retorna, String pq é o que recebe
    static int contaVogais (String texto){
        int numerosVogais =0;
        for( int i = 0; i< texto.length();i++){
            switch (texto.toLowerCase().charAt(i)){
                case 'a', 'e', 'i', 'o', 'u':
                    numerosVogais++;
            }
        }

        return numerosVogais;
    }

    //06                       |isso é o que fica no parenteses para ser analisado |
    static int contaCaracteres (String texto, char caractere) {
        int numeroDeCaracteres = 0;
        for (int i =0; i<texto.length(); i++){
            if(texto.charAt(i)== caractere){
                numeroDeCaracteres++;
            }
        }
        return numeroDeCaracteres;
    }

    //07
    static String inverteString(String str){
        String strInvertida = "";               //inicia vazia
        for (int i = str.length()-1; i>=0; i--){
            strInvertida = strInvertida + str.charAt(i);
        }

        return strInvertida;
    }

    //08

    static boolean ehPalindromo (String palavra){
        boolean palindromo = false;
        String palavraInvertida = inverteString(palavra);   //usa o metodo anterior
        if (palavraInvertida.equalsIgnoreCase(palavra)){
            palindromo = true;
        }
        return palindromo;
    }


    //09 --------------REVER
    static int[] fill (int[] array, int valor){

        int[] novoArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            novoArray[i] = valor;
        }
        return novoArray;
    }

    //10
    static int[] zeraArray (int[] array){                   //assinatura do metodo
        for (int i =0; i< array.length; i++){
            array[i] = 0;
        }
        return array;
    }


    //11
    static void localizaMeio(String str){
        int meio = str.length()/2;
        if (str.length()%2 != 0){
            System.out.println(str.charAt(meio));
        }else {
            System.out.println(str.charAt(meio-1)+" "+str.charAt(meio));
        }
    }


    static int somaa (int a, int b){
        int s = a+b;
        return s;
    }






}