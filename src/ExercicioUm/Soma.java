package ExercicioUm;

public class Soma {

    int resultado;
    public int somaDeNumeros(int numero){ // metodo somar com parametro int numero

        for (int i = 1; i <= numero; i++) { // laço de repetição que repete de com o numero que o usuario colocar
            resultado += i; // mnesma coisa que resultado = resultado + i (contador)
        }
        return resultado; //vai retornar o resultado da soma
    }
}
