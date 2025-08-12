package clases;

public class AdivinaNumero {

    public static String compararNumeros(int numeroUsuario, int numeroSecreto) {
        if (numeroUsuario == numeroSecreto) {
            return "Has conseguido adivinar el número";
        } else if (numeroUsuario < numeroSecreto) {
            return "Intenta con un número más grande.";
        } else {
            return "Intenta con un número más pequeño.";
        }
    }
}
