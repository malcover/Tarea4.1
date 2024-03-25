public interface Loteria {
    double TIPO = 0.20;  // Tasa de tributo para premios que superan el límite
    double LIMITE = 40000;  // Límite de cantidad exenta de tributo

    double getLimite();  // Método para obtener el límite de cantidad exenta
    double getTipo();  // Método para obtener la tasa de tributo
    String toString();  // Método para representación en cadena de la información del sorteo
}

// Clase abstracta Sorteo
public abstract class Sorteo implements Loteria {
    protected String fecha;
    protected String lugar;
    protected int primerPremio;
    protected double cantidadPrimerPremio;

    // Constructor por defecto
    public Sorteo() {
        // Inicialización por defecto
    }

    // Constructor sobrecargado
    public Sorteo(String fecha, String lugar, int primerPremio, double cantidadPrimerPremio) {
        this.fecha = fecha;
        this.lugar = lugar;
        this.primerPremio = primerPremio;
        this.cantidadPrimerPremio = cantidadPrimerPremio;
    }

    // Método abstracto para obtener el primer número del reintegro
    public abstract int getPrimerReintegro();

    @Override
    public String toString() {
        return "Fecha: " + fecha + "\nLugar: " + lugar + "\nPrimer Premio: " + primerPremio +
               "\nCantidad Primer Premio: " + cantidadPrimerPremio;
    }
}

// Clase SorteoOrdinario que extiende Sorteo
public class SorteoOrdinario extends Sorteo {
    protected int segundoReintegro;
    protected int tercerReintegro;

    // Constructor por defecto
    public SorteoOrdinario() {
        // Inicialización por defecto
    }

    // Constructor sobrecargado
    public SorteoOrdinario(String fecha, String lugar, int primerPremio, double cantidadPrimerPremio,
                            int segundoReintegro, int tercerReintegro) {
        super(fecha, lugar, primerPremio, cantidadPrimerPremio);
        this.segundoReintegro = segundoReintegro;
        this.tercerReintegro = tercerReintegro;
    }

    // Implementación del método abstracto para obtener el primer número del reintegro
    @Override
    public int getPrimerReintegro() {
        return primerPremio % 10;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSegundo Reintegro: " + segundoReintegro +
               "\nTercer Reintegro: " + tercerReintegro;
    }
}

// Clase SorteoNino que extiende SorteoOrdinario
public class SorteoNino extends SorteoOrdinario {
    protected int tercerPremio;
    protected double cantidadTercerPremio;

    // Constructor por defecto
    public SorteoNino() {
        // Inicialización por defecto
    }

    // Constructor sobrecargado
    public SorteoNino(String fecha, String lugar, int primerPremio, double cantidadPrimerPremio,
                      int segundoReintegro, int tercerReintegro, int tercerPremio, double cantidadTercerPremio) {
        super(fecha, lugar, primerPremio, cantidadPrimerPremio, segundoReintegro, tercerReintegro);
        this.tercerPremio = tercerPremio;
        this.cantidadTercerPremio = cantidadTercerPremio;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTercer Premio: " + tercerPremio +
               "\nCantidad Tercer Premio: " + cantidadTercerPremio;
    }
}

// Clase SorteoNavidad que extiende SorteoNino
public class SorteoNavidad extends SorteoNino {
    protected int cuartoNumero1;
    protected int cuartoNumero2;
    protected double cantidadCuartoPremio;

    // Constructor por defecto
    public SorteoNavidad() {
        // Inicialización por defecto
    }

    // Constructor sobrecargado
    public SorteoNavidad(String fecha, String lugar, int primerPremio, double cantidadPrimerPremio,
                         int segundoReintegro, int tercerReintegro, int tercerPremio, double cantidadTercerPremio,
                         int cuartoNumero1, int cuartoNumero2, double cantidadCuartoPremio) {
        super(fecha, lugar, primerPremio, cantidadPrimerPremio, segundoReintegro, tercerReintegro,
              tercerPremio, cantidadTercerPremio);
        this.cuartoNumero1 = cuartoNumero1;
        this.cuartoNumero2 = cuartoNumero2;
        this.cantidadCuartoPremio = cantidadCuartoPremio;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCuarto Premio (Número 1): " + cuartoNumero1 +
               "\nCuarto Premio (Número 2): " + cuartoNumero2 +
               "\nCantidad Cuarto Premio: " + cantidadCuartoPremio;
    }
}

// Clase principal para el programa con menú
public class MainPrograma {
    public static void main(String[] args) {
        // Implementa el menú y la lógica del programa aquí
    }
}