import static org.junit.Assert.*;
import org.junit.Test;

public class AhorcadoTest {
    
    @Test
    public void pruebaAdivinarLetra() {
        Ahorcado juego = new Ahorcado();
        juego.iniciarJuego("hola");
        
        assertTrue(juego.adivinarLetra('h'));
        assertFalse(juego.adivinarLetra('e'));
    }
    
    @Test
    public void pruebaObtenerPalabraOculta() {
        Ahorcado juego = new Ahorcado();
        juego.iniciarJuego("mundo");
        
        assertEquals("_____", juego.obtenerPalabraOculta());
        
        juego.adivinarLetra('m');
        assertEquals("m____", juego.obtenerPalabraOculta());
    }
    
    // Agrega más pruebas aquí.
}
