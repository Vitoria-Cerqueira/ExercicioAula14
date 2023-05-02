package ExercicioTres;

public class IMC {
    public static double  altura; // são variaveis publicas
    public static double  peso;

    public double calcularImc(){
        double imc = peso / (altura * altura);

        if(imc<18.5){
            System.out.print("Magreza");

        }else if (imc >= 18.5 && imc <= 24.9){
            System.out.print("Normal");

        }else if (imc >= 25.0 && imc <= 29.9){
            System.out.print("Sobrepeso I");

        }else if (imc >= 30.0 && imc<= 39.9) {
            System.out.print("Obesidade II");

        } else if (imc > 40.0) {
            System.out.print("Obesidade Grave III");

        }

        return imc;
    }
}
