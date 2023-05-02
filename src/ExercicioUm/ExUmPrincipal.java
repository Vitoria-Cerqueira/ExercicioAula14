//        Faça um algoritmo que contenha um método que receba um número do
//        usuário e realize a somatório de todos os números no intervalo de 1 até o
//        número digitado pelo usuário. Exiba o resultado final da somatória.


package ExercicioUm;

import java.util.Scanner;

public class ExUmPrincipal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Soma conta = new Soma(); // instanciei a classe soma - chamamos a classe(soma) que criamos e estamos atribuindo para um objeto

        System.out.println("Digite um numero: ");
        int numeroRecebido = teclado.nextInt(); // aqui eu vou receber o valor de um usuario

        conta.somaDeNumeros(numeroRecebido); // atribui o valor para o parametro do metodo somarNumero
        System.out.println(conta.resultado);
    }

}
