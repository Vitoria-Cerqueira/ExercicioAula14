package ExercicioDois;
//        Faça um algoritmo que contenha uma função que receba o nome de um
//        usuário e retorne a mensagem Meu nome é <NomeDigitado>.


import java.util.Scanner;

public class ExDoisPrincipal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); // criei um scanner
        // aqui estou atribuindo para classe um ojeto

        System.out.println("Qual seu nome? "); // aqui estou pedindo o nome pro usuario
        Nome.coletarNome(teclado.next()); // atribuindo valor para o parametro coletarNome

    }
}
