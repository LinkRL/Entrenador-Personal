import java.util.Scanner;

/**
 * Clase con métodos de utilidad para la entrada de datos por teclado y el manejo de días de la semana.
 */
public class Utilidades {
    public static String leerCadena(Scanner teclado, String s) {
        System.out.print(s);
        String linea = teclado.nextLine();
        // Muestra un mensaje y lee una cadena (línea completa) por teclado
        return linea;
    }

    public static int leerNumero(Scanner teclado, String mensaje, int minimo, int maximo) {
        int n= 0;
        boolean ok = true;
        do {
            System.out.print(mensaje);
            String linea = teclado.nextLine();
            ok = true;
            try{
            n = Integer.parseInt(linea.trim());
            }catch(NumberFormatException e){
                ok = false;
            }
        }
        while(n<minimo||maximo<n||!ok);
        // Muestra un mensaje y lee un número por teclado (si no es un número o está fuera de rango, vuelve a
        // solicitarlo)
        return n;
    }

    public static int leerDiaDeLaSemana(Scanner teclado, String mensaje) {
        // Muestra un mensaje, lee un día de la semana por teclado (L, M, X, J, V, S, D) y devuelve su posición
        // dentro de la semana (0-6). Si la entrada no es válida, vuelve a solicitarla
        return 0; // @todo MODIFICAR PARA DEVOLVER EL DÍA DE LA SEMANA LEÍDO
    }

    public static int diaSemanaAPosicion(String dia) {
        // Devuelve la posición de un día de la semana (L, M, X, J, V, S, D) dentro de la semana (0-6),
        // o -1 si no es un día válido
        return 0; // @todo MODIFICAR PARA DEVOLVER LA POSICIÓN DEL DÍA DE LA SEMANA
    }

    public static String posicionADiaSemana(int pos) {
        // Devuelve el día de la semana (Lunes, Martes, Miércoles, Jueves, Viernes, Sábado, Domingo)
        // correspondiente a una posición dentro de la semana (0-6), o "Desconocido" si no es válida
        return null; // @todo MODIFICAR PARA DEVOLVER EL DÍA DE LA SEMANA
    }
}
