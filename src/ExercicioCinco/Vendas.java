package ExercicioCinco;

import java.util.Scanner;

public class Vendas {
    Scanner teclado = new Scanner(System.in);
    public static String nomeVendedor;
    public static double salarioFixo;
    public static double vendasFeitas;

    public void informarUsuario(){
        System.out.println("Digite seu nome: ");
        nomeVendedor = teclado.next();

        System.out.println("Informe seu salario: ");
        salarioFixo = teclado.nextDouble();

        System.out.println("Informe o numero de vendas desse mes: ");
        vendasFeitas = teclado.nextDouble();

    }

    public void acrescimo(){
        double salarioAtual;
        double comissao = vendasFeitas*((double) 15 /100);

        salarioAtual = comissao + salarioFixo;
        System.out.println("O nome do vendedor é: " + nomeVendedor);
        System.out.println("O numero de vendas foram " + vendasFeitas);
        System.out.println("O salario fixo " + salarioFixo);
        System.out.println("O salario atual é " + salarioAtual);
    }


}
