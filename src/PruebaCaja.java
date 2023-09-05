public class PruebaCaja {
    public static void main(String[] args) {
        Caja cajaVolumen = new Caja();
        cajaVolumen.ancho = 3;
        cajaVolumen.alto = 2;
        cajaVolumen.profundo = 6;
        cajaVolumen.calcularVolumen();
        
        var resultado = cajaVolumen.calcularVolumen(3, 2, 6);
        System.out.println("Valor Volumen: " + resultado);

        resultado = cajaVolumen.calcularVolumen(3, 2, 6);
        System.out.println("Valor Volumen: " + resultado);
    }

}