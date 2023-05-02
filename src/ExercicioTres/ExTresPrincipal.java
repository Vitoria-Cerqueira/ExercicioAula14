package ExercicioTres;


import java.util.Scanner;

//        Faça um algoritmo que contenha uma função que calcule o IMC de um
//        usuário a partir da inserção do seu peso e de sua altura. Exiba a
//        classificação do usuário após a verificação do seu IMC.
public class ExTresPrincipal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        IMC calculoImc = new IMC();

        System.out.println("Digite sua altura: ");
        IMC.altura = (teclado.nextDouble());

        System.out.println("Digite seu peso: ");
        IMC.peso = (teclado.nextDouble());

        calculoImc.calcularImc();

    }
}
