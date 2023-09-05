public class Caja {
    //Atributos de la clase
    int ancho;
    int alto;
    int profundo;

    //Constructor vacio
    public Caja() {
        System.out.println("Volumen de la Caja - Vacio");
    }

    //Constructor con argumentos
    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        System.out.println("Volumen de la Caja - Argumentos");
    }

    //Metodos de la clase
    public void calcularVolumen() {
        int resultado = ancho*alto*profundo;
        System.out.println("Volumen de la Caja: " + resultado);
    }

    public int calcularVolumen(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        return ancho*alto*profundo;
    }

}