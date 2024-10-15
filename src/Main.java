//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Caja caja = new Caja(500); // Capital inicial de 500
        HiloIngreso hiloIngreso = new HiloIngreso(caja);
        HiloExtraccion hiloExtraccion = new HiloExtraccion(caja);

        hiloIngreso.start();
        hiloExtraccion.start();


    }
}