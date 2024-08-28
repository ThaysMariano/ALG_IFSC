//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //exerc 01 qual é maior
        int a = 23;
        int b = 8;
        if (a > b) {
            System.out.println(a + " É maior que " + b);
        } else {
            System.out.println(b + " É maior que " + a);
        }

        //exerc 02 saber s epode votar esse ano
        int ano = 2009;
        int anoAtual = 2024;
        if (anoAtual - ano >= 16) {
            System.out.println("Pode votar esse ano");
        } else {
            System.out.println("Não pode votar esse ano");
        }

        //exerc 03 impar ou par
        int imparPar = 10;
        if (imparPar % 2 == 0) {
            System.out.println(imparPar + " É par");
        } else {
            System.out.println(imparPar + " É impar");
        }

        //exerc 04
        int senha = 12324;
        if (senha == 1234) {
            System.out.println("ACESSO PERMITIDO");
        } else {
            System.out.println("ACESSO NEGADO");
        }

        //Exerc 05 macas
        double maca = 0.3;
        double macaDuzia = 0.25;
        int macaNumero = 124;
        if (macaNumero < 12) {
            System.out.println(macaNumero * maca + " Reias por " + macaNumero + " macas");
        } else {
            System.out.println((macaNumero * macaDuzia) + " Reais por " + macaNumero + " macas");
        }

        //exerc6 notas de aluno          -else if p ser um ou outro e n repetir a resposta
        double nota1 = 1;
        double nota2 = 10;
        double media = (nota1 + nota2) / 2;
        if (media == 10){
            System.out.println("Aprovado com Distinçao");
        }
        else if (media >= 7) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
        //exerc 07 calcular o peso ideal

        double altura = 1.71;
        int sexo = 1;
        if (sexo == 1){
                System.out.println((62.1 * altura) - 44.7 + "Kg É seu peso ideal");
        }
        else {
            System.out.println((72.7 * altura) - 58 + "Kg É seu peso ideal");
        }

        //exerc 08 classificar o nadador
        int anoNasc = 2019;
        int anooAtual = 2024;
        if (anooAtual - anoNasc >= 18){
            System.out.println("Você está classificado como Adulto");
        }
        else if (anooAtual - anoNasc >= 14){
            System.out.println("Você está classificado como Juvenil");
        }
        else if (anooAtual - anoNasc >= 9){
            System.out.println("Você está classificado como Infantil");
        }
        else {
            System.out.println("Você está classificado como Mirim");
        }

        //exerc 09 imprimir tres variaives em ordem crescente
        int d = 14;
        int e = 12;
        int f = 121;

        if (d > e){
            int temp = d;
            d = e;
            e = temp;
        }
        if (e > f){
            int temp = e;
            e = f;
            f = temp;
        }
        if (d > e){
            int temp = d;
            d = e;
            e = temp;
        }
        System.out.println(d +"," + e +"," + f);

        //exerc10 calcular uma conta
        double valor1 = 4.5;
        double valor2 = 4.5;
        char operador = '/';
        if (operador == '+'){
            System.out.println(valor1 + valor2);
        }
        else if (operador == '-'){
            System.out.println(valor1 - valor2);
        }
        else if (operador == '/'){
            if (valor2 == 0){
                System.out.println("divisao por zero");
            }
           else { System.out.println(valor1 / valor2);}
        }
        else {
            System.out.println(valor1 * valor2);
        }

        //exerc 11 calcular salario
        double salario = 500;
        double novosalario= 0;
        double percentual = 0;

        if (salario <= 280){
            percentual = 1.2;
            novosalario = salario * percentual;
        }
        else if (salario <= 700){
            percentual = 1.15;
            novosalario = salario * percentual;
        }
        else if (salario <= 1500){
            percentual = 1.1;
            novosalario = salario * percentual;
        }
        else{
            percentual = 1.05;
            novosalario = salario * percentual;
        }
        System.out.println("Salário antigo: R$ "+ salario);
        System.out.println("Percentual aumentado: "+ percentual);
        System.out.println("Valor do aumento: R$ "+ (novosalario - salario) );
        System.out.println("Novo salario: R$ "+ novosalario);

        //no exemplo do professor ele deixa o percentual sem o 1 na frente, multiplica e depois soma ao salario



    }
}

