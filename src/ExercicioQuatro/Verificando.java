package ExercicioQuatro;


import java.util.Scanner;

public class Verificando {

    Scanner teclado = new Scanner(System.in);
    int numeroQta[] = new int[5];

    public int digitarNumero(){
        for (int i = 0; i < numeroQta.length; i++) {
            System.out.println("Digite um numero: ");
            numeroQta[i] = teclado.nextInt();
        }
        return 0;
    }

    public int coferirNumero(){

        int menorValor = Integer.MAX_VALUE;

        for (int i = 0; i < numeroQta.length; i++) {

            if (numeroQta[i] < menorValor){
                menorValor = numeroQta[i];
            }
        }
        System.out.println(menorValor);
        return 0;
    }
}
