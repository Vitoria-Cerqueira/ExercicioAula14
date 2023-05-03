package ExercicioSeis;

import java.util.Scanner;

public class Temperatura {
    Scanner teclado = new Scanner(System.in);
    public double celcius;
    public double fahrenheit;

    public void transformar(){
        System.out.println("Digite a temperatura em Celcius: ");
        celcius = teclado.nextDouble();

        fahrenheit = ((9*celcius) + 160) / 5;
        System.out.println(fahrenheit);
    }






}
