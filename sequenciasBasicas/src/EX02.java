//Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas vindas para ela:

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {

        String nome;

        Scanner i = new Scanner(System.in);
        nome = i.next();

        System.out.println("Olá "+nome+", é um prazer te conhecer!");

    }
}
