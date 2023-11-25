import java.util.Scanner;

//Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
//na tela a sua média na disciplina.
//Ex:
//Nota 1: 4.5
//Nota 2: 8.5
//A média entre 4.5 e 8.5 é igual a 6.5
public class E05 {

    public static void main(String[] args){
        double x,y,soma;

        Scanner i = new Scanner(System.in);
        x = i.nextDouble();
        y = i.nextDouble();

        soma = (x + y) / 2;

        System.out.println("a media entre "+x+ " e "+y+" é igual a " +soma);

    }
}
