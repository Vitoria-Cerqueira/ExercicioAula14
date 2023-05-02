package ExercicioCinco;

import java.util.Scanner;

public class Vendas {
    Scanner teclado = new Scanner(System.in);
    public static String nomeVendedor;
    public static double salarioFixo;
    public static double vendasFeitas;

    public double informarUsuario(){
        System.out.println("Digite seu nome: ");
        nomeVendedor = teclado.next();

        System.out.println("Informe seu salario: ");
        salarioFixo = teclado.nextDouble();

        System.out.println("Informe o numero de vendas desse mes: ");
        vendasFeitas = teclado.nextDouble();
        return 0;
    }

    public double acrescimo(){
        double salarioAtual;
        double comissao = vendasFeitas*((double) 15 /100);

        salarioAtual = comissao + salarioFixo;
        System.out.println(nomeVendedor + "/n" + vendasFeitas +"/n" + salarioFixo + "n/" + salarioAtual);
        return 0;
    }


}
