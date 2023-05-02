package ExercicioOito;

import java.util.Scanner;

public class Custo {
    Scanner teclado = new Scanner(System.in);
    public double porcentagem;

    public double precoCusto;

    public double produto(){


        System.out.println("Digite o preço de custo: ");
        precoCusto = teclado.nextDouble();

        System.out.println("Digite o percentual de acrescimo: ");
        porcentagem = teclado.nextDouble();

        porcentagem = (porcentagem/100)*precoCusto;
        double valorDaVenda = porcentagem + precoCusto;

        System.out.println("Valor de venda do produto é " + valorDaVenda);
        return 0;


    }
}
