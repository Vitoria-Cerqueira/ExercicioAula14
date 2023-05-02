package ExercicioSete;

import java.util.Scanner;

public class Dolares {
    Scanner teclado = new Scanner(System.in);
    public double real;
    public double dolar;
    public double cotacao;

    public double qtaCotacao(){
        System.out.println("Qual a cotação do dolar hoje?");
        cotacao = teclado.nextDouble();
        return 0;
    }

    public double converter(){
        System.out.println("Digite quantos dolares voce tem: ");
        dolar = teclado.nextDouble();
         real = dolar*cotacao;
        System.out.println("Voce tem R$ " + real + "em real");
        return 0;
    }
}
