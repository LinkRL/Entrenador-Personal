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
        int n = 0;
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
      String dia;
      int n_dia;
       do {
           System.out.print(mensaje);
           dia = teclado.nextLine();
           n_dia=diaSemanaAPosicion(dia);
       }while(n_dia==-1);
        // Muestra un mensaje, lee un día de la semana por teclado (L, M, X, J, V, S, D) y devuelve su posición
        // dentro de la semana (0-6). Si la entrada no es válida, vuelve a solicitarla
        return n_dia;
    }

    public static int diaSemanaAPosicion(String dia) {
        int n_dia;
        switch (dia) {
            case "L","l":
                n_dia=0;
                break;
            case "M","m":
                n_dia=1;
                break;
            case "X","x":
                n_dia=2;
                break;
            case "J","j":
                n_dia=3;
                break;
            case "V","v":
                n_dia=4;
                break;
            case "S","s":
                n_dia=5;
                break;
            case "D","d":
                n_dia=6;
                break;
            case null, default:
                n_dia=-1;
                break;
        }
        // Devuelve la posición de un día de la semana (L, M, X, J, V, S, D) dentro de la semana (0-6),
        // o -1 si no es un día válido
        return n_dia;
    }

    public static String posicionADiaSemana(int pos) {
        // Devuelve el día de la semana (Lunes, Martes, Miércoles, Jueves, Viernes, Sábado, Domingo)
        // correspondiente a una posición dentro de la semana (0-6), o "Desconocido" si no es válida
        return null; // @todo MODIFICAR PARA DEVOLVER EL DÍA DE LA SEMANA
    }
}
