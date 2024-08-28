public class Main {
    public static void main(String[] args) {
        // exercicio 01 1 a 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //exercicio 02 10 a 1
        for (int d = 10; d >= 1; d--) {
            System.out.println(d);
        }

        //exercicio 03 soma dos numeros de 1 a 100
        int numero = 1;
        int soma = 0;
        while (numero <= 100) {
            soma = numero + soma;
            numero++;
        }
        System.out.println(soma);

        //numeros pares de 1 a 50
        for (int p = 2; p < 51; p += 2) {
            System.out.println(p);
        }

        //exerc 04 soma numeros pares de 1 a 50
        int inicio = 2;
        int somaPar = 0;
        while (inicio < 51) {
            somaPar = inicio + somaPar;
            inicio += 2;
        }
        System.out.println(somaPar);

        //exerc 05 imprima os numeros pares de 0 a 20
        for (int b = 0; b < 21; b += 2) {
            System.out.println(b);
        }

        //exerc 06 de 1 ate numero x (x=135)
        for (int n = 1; n <= 135; n++) {
            System.out.println(n);
        }

        //exerc 07 tabuada mult de 1 a 10 com um fixo
        int num1 = 3;
        int num2 = 6;
        while (num1 <= 10) {
            System.out.println(num1 * num2);
            num1++;
        }

        //exerc 08 fatorial de um numero qualquer
        int fatorial = 5;
        int resultado = 1;
        while (fatorial >= 1) {
            resultado = resultado * fatorial;
            fatorial--;
        }
        System.out.println(resultado);

        //exerc 09 contar de 1 a 20 pulando os multiplos de 3 (REVER -no era exatamente isso)

        for (int k = 1; k <= 20; k++) {
            if (k % 3 == 0) {
                System.out.println(" ");
            } else {
                System.out.println(k);
            }
        }

        //exerc 10 Numero par maior que 200 e listar de 100 ate ele apenas os numeros pares
        int numeroMaior = 214;

        for (int l = 100; l <= numeroMaior; l += 2) {
            System.out.println(l);
        }

        //exerc 11 os 10 primeiros numeros de fibonacci

        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);

        for (int i = 0; i < 8; i++) {
            int n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }

        // exerc 12 imprimir divisores de um numero maior que 50
        int numeAl = 30;
        int divisor = 1;

        while (divisor <= numeAl) {
            if (numeAl % divisor == 0) {
                System.out.println(divisor);
            }
            divisor++;
        }

        //exerc 12 do professor:
        int numAleatorio = 30;

        for (int i = 1; i <= numAleatorio; i++) {
            if (numAleatorio % i == 0) {
                System.out.println(i);
            }
        }

        //exerc 13 verificar se um nmr qualquer é primo (maiores que 100)

        //do profesor
        int numeroPrimo = 101;
        boolean ehPrimo = true;

        for (int i = 2; i <= (numeroPrimo / 2); i++) {
            if (numeroPrimo % i == 0) {
                ehPrimo = false;
                break;
            }
        }
        if (ehPrimo) {
            System.out.println(numeroPrimo + " é primo");
        } else {
            System.out.println(numeroPrimo + " não é primo");
        }


        //meu -- pra nao ficar repetindo usa o boolean, quando ver que ja é falso 1 vez ja passa pro resultado

        int numQualquer = 13;
        int c;
        boolean Primo = true;

        for (c = 2; c < numQualquer; c++) {
            if (numQualquer % c == 0) {
                Primo = false;
                break;
            }
        }

        if (Primo) {
            System.out.println(numQualquer + " É primo");
        } else {
            System.out.println(numQualquer + " Não é primo");
        }


        //exerc 14 imprima os primeiros 10 numeros primos       NAO ENTENDI
        int contadorq = 0;
        int numeroPrimo2 = 2;

        while (contadorq < 10) {   //como se fossem apenas as 10 vezes verdadeiras
            boolean ehPrimo2 = true;

            for (int i = 2; i <= (numeroPrimo2 / 2); i++) {
                if (numeroPrimo2 % i == 0) {
                    ehPrimo2 = false;   //se for igual a 0 nao é primo
                    break;
                }
            }
            if (ehPrimo2) {
                System.out.println(numeroPrimo2);
                contadorq++;
            }
            numeroPrimo2++;
        }

        // lista 03 encontrar mmc de dois numeros
        int n4 = 51;
        int n5 = 5;
        int mmc = n4;
        while (mmc % n5 !=0){
            mmc =n4 + mmc;
        }
        System.out.println(mmc);


        //lista 3 de celcius para Fahrenheit
        int C = 30;
        double F = (1.8*C+32);
        System.out.println(F);


        //lista 3 quantos digitos tem um numero
        int contador = 1;
        int numer = 1234;
        while (numer > 1){
            numer=numer/10;
            contador++;
        }
        System.out.println(contador);

//
        //lista 3 somar os digitos de um numero
        int nuemroD = 1234;
        int digito = 0;
        int somaR = 0;
        while (nuemroD>0) {
            digito= nuemroD % 10;                    //pega o ultimo digito -> 1234/10 da 123 e sobra 4
            somaR = digito + somaR;
            nuemroD = nuemroD /10;
        }
        System.out.println(somaR);

    }
}
