import java.util.Scanner;

public class JuegoAhorcado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ahorcado juego = new Ahorcado(); // Crea un juego de ahorcado con valores predeterminados
        
        System.out.println("Bienvenido al juego del ahorcado!");
        
        // Inicia un nuevo juego con una palabra secreta
        System.out.print("Ingresa la palabra secreta: ");
        String palabraSecreta = scanner.nextLine();
        juego.iniciarJuego(palabraSecreta);
        
        // Bucle principal del juego
        while (!juego.juegoTerminado()) {
            System.out.println("Palabra actual: " + juego.obtenerPalabraOculta());
            System.out.print("Adivina una letra: ");
            char letra = scanner.nextLine().charAt(0);
            
            if (juego.adivinarLetra(letra)) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Letra incorrecta.");
            }
        }
        
        // Mostrar resultado del juego
        if (juego.juegoTerminadoPorMaximosIntentos()) {
            System.out.println("Perdiste. La palabra secreta era: " + juego.obtenerPalabraSecreta());
        } else {
            System.out.println("¡Felicidades! Has adivinado la palabra secreta: " + juego.obtenerPalabraSecreta());
        }
        
        scanner.close();
    }
}
