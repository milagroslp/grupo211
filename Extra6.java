
import java.util.Scanner;

/*6-Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
a medida que el usuario las va ingresando, construya una “sopa de letras para 
niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden 
horizontal en una fila que será seleccionada de manera aleatoria. Una vez 
concluida la ubicación de las palabras, rellene los espacios no utilizados con 
un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de 
letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java substring(), Length() y Math.random().*/
/**
 *
 * @author Papa y Ciro
 */
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char sopa[][] = new char[20][20];
        int lon = 0;
        char caracter;
        String frase = "hola";
        int fila;
        int columna;
       //no escribo nada, solo intento ver si hubo un cambio- Mili"
        for (int i = 0; i < 5; i++) {

            do {
                System.out.println("Ingrese una frase de tres a cinco caracteres");

                frase = leer.next();

                lon = (int) frase.length();

            } while (lon < 3 || lon > 5);
            fila = aleatorio() + i;

            columna = aleatorio();

            for (int j = 0; j < (lon); j++) {

                caracter = (frase.substring(j, j + 1)).charAt(0);

                sopa[fila][columna + j] = caracter;

            }

        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j] == '\u0000') {

                    sopa[i][j] = Character.forDigit((int) (Math.random() * 10), 10);

                }
            }

        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {

                System.out.print("[" + sopa[i][j] + "]");

            }
            System.out.println("");
        }

    }

    public static int aleatorio() {

        int aleator = (int) (Math.random() * 15 + 1);

        return aleator;

    }

}
