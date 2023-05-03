package ExercicioUm;

public class Soma {

    int resultado;
    public void somaDeNumeros(int numero){ // metodo somar com parametro int numero

        for (int i = 1; i <= numero; i++) { // laço de repetição que repete de com o numero que o usuario colocar
            resultado += i; // mnesma coisa que resultado = resultado + i (contador)
        }
    }
}
