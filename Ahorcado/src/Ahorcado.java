public class Ahorcado {
    private String palabraSecreta;
    private StringBuilder palabraOculta;

    public void iniciarJuego(String palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
        this.palabraOculta = new StringBuilder();
        for (int i = 0; i < palabraSecreta.length(); i++) {
            palabraOculta.append("_");
        }
    }

    public boolean adivinarLetra(char letra) {
        boolean letraAdivinada = false;
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                palabraOculta.setCharAt(i, letra);
                letraAdivinada = true;
            }
        }
        return letraAdivinada;
    }

    public String obtenerPalabraOculta() {
        return palabraOculta.toString();
    }
}
