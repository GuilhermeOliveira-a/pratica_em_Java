import java.util.Scanner;

public class E06 {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);

        int x, y ;

        int num = i.nextInt();
        x = num -1;
        y = num +1;

        System.out.println("O antecessor de: "+num+" é "+x);
        System.out.println("O Sucessor de: "+num+" é "+y);
    }
}
