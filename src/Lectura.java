import  java.util.Locale;
import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        System.out.println("Escribe el nombre de tu película favorita:");
        String pelicula = teclado.nextLine();
        System.out.println("Ahora escribe la fecha de lanzamiento:");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("¿Que nota le das a esa película?");
        double nota = teclado.nextDouble();

        System.out.println("Película: " + pelicula);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Nota: " + nota);
    }
}
