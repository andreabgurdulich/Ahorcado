package minimal;

import java.util.Scanner;

public class JuegoAhorcado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ahorcado juego = new Ahorcado(); //Iniciamos el ahorcado con valores predeterminados
        
        System.out.println("¡Comencemos!");
        
        //Solicitamos palabra a adivinar
        System.out.print("Ingresa la palabra a adivinar: ");
        String palabraAAdivinar = scanner.nextLine();
        juego.iniciarJuego(palabraAAdivinar);
        
        // Empieza iteración juego
        while (!juego.juegoTerminado()) {
            System.out.println("Palabra actual: " + juego.obtenerPalabraOculta());
            System.out.print("Elige una letra: ");
            char letra = scanner.nextLine().charAt(0);
            
            if (juego.adivinarLetra(letra)) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Letra incorrecta.");
            }
        }
        
        // Mostrar resultado del juego
        if (juego.juegoTerminadoPorMaximosIntentos()) {
            System.out.println("Perdiste. La palabra a adivinar era: " + juego.obtenerPalabraAAdivinar());
        } else {
            System.out.println("¡Felicidades! Has adivinado la palabra: " + juego.obtenerPalabraAAdivinar());
        }
        
        scanner.close();
    }
}
