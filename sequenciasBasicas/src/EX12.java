import java.util.Scanner;

public class EX12 {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);

        double produto,desconto,novopreco;

        System.out.println("Digite o valor do produto");
        produto = i.nextDouble();
        desconto = produto*5/100;
        novopreco = produto-desconto;
        System.out.println("o valor com desconto de 5% fica em "+novopreco);
        i.close();

    }
}
