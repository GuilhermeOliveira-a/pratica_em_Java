import java.util.Scanner;

//Crie um programa que leia o nome e o salário de um funcionário, mostrando no
//final uma mensagem.
//Ex:
//Nome do Funcionário: Maria do Carmo
//Salário: 1850,45
//O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.
public class E03 {
    public static void main(String[] args){

        String nome;
        int salario;

        Scanner i = new Scanner(System.in);

        System.out.println("digite seu nome: ");
        nome = i.next();
        System.out.println("digite seu salario: ");
        salario = i.nextInt();

        System.out.println("O funcionário "+nome+" tem um salário de R$"+salario+" em junho.");


    }
}
