
public class Caja {
    private double capital;

    public Caja(double capitalInicial) {
        this.capital = capitalInicial;
    }

    // Metodo para realizar ingresos
    public void ingresar(double cantidad) {
        capital = capital + cantidad;
        System.out.printf("Ingreso: %.2f. Capital actual: %.2f%n", cantidad, capital);
    }

    // Metodo para realizar extracciones
    public void extraer(double cantidad) {
        if (capital >= cantidad) {
            capital = capital - cantidad;
            System.out.printf("Extracción: %.2f. Capital actual: %.2f%n", cantidad, capital);
        } else {
            System.out.println("No hay suficiente capital para la extracción: " + cantidad);
        }
    }
}