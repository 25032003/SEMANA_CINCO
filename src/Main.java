import Padre.Empleado;
import Hijo.ScrumMastrer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void imprime(Empleado emple) {
        System.out.println("Objeto.obtenerDetalles()" + emple.obtenerDetalles());
    }

    public static void determinarTipo(Empleado emple) {
        if (emple instanceof ScrumMastrer) {
            System.out.println("Esto viene de ScrumMaster");
        } else if (emple instanceof Empleado) {
            System.out.println("Esto viene de Empleado");
        } else if (emple instanceof Object) {
            System.out.println("Es cualquier cosa");
        }
    }

    public static void main(String[] args) {
        Empleado em = new Empleado("juan", 3500);
//        imprime(em);
        ScrumMastrer sm = new ScrumMastrer("juan", 3500, "desarrollo");
//        imprime(sm);
        System.out.println(em.toString());




    }
}
