
import clases.AdivinaNumero;
import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        // Generar el numero aleatorio
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        // Lista para guardar los intentos
        ArrayList<Integer> intentos = new ArrayList<>();
        String mensaje;
        int numeroUsuario;

        System.out.println("══════════════════════════════════════════════");
        System.out.println("   🎯 Bienvenido al Juego Adivina el Número 🎯");
        System.out.println("══════════════════════════════════════════════");
        System.out.println("💡 Piensa en un número entre 1 y 100 e intenta adivinarlo.\n");
        System.out.println();

        do {

            do {
                System.out.print("➡ Ingresa tu número (1-100): ");
                numeroUsuario = scanner.nextInt();
                    if (numeroUsuario < 1 || numeroUsuario > 100) {
                        System.out.println("⚠️ El número debe estar entre 1 y 100. Intenta de nuevo.");
                        numeroUsuario = -1; // Valor inválido para repetir
                    }
            
            } while (numeroUsuario < 1 || numeroUsuario > 100);


            mensaje = AdivinaNumero.compararNumeros(numeroUsuario, numeroSecreto);

            if (!mensaje.equals("Has conseguido adivinar el número")) {
                System.out.println("📢 " + mensaje);
                intentos.add(numeroUsuario);
            } else {
                System.out.println("\n🎉 " + mensaje + ": \"" + numeroUsuario + "\" 🎉");

            }

        } while (!mensaje.equals("Has conseguido adivinar el número"));
        
        scanner.close();
        
        System.out.println("\n══════════════════════════════════════════════");
        System.out.println("📊 Resumen de la partida:");
        System.out.println("\t🔹 Intentos realizados: " + intentos.size());
        System.out.print("\t🔹 Números fallidos: ");
        for (int intento : intentos) {
            System.out.print(intento + " ");
        }
        System.out.println("\n══════════════════════════════════════════════");
        System.out.println("🏆 ¡Gracias por jugar! 🏆");
    }
}
