import java.util.Scanner;

//Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
//entre eles.
//Ex:
//Digite um valor: 8
//Digite outro valor: 5
//A soma entre 8 e 5 é igual a 13.
public class E04 {

    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        int x, y, soma;

        x = i.nextInt();
        y = i.nextInt();

        soma = x + y;

        System.out.println("a soma entre "+x+" e "+y+ " é igual a "+soma);


    }
}
