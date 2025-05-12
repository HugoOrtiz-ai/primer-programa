public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!\nBienvenid@ a Screenmatch!!!");
        System.out.println("\nPelícula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println("Media: " + media);

        String sinopsis = """
                Sinópsis:
                Matrix es una paradoja.
                La mejor Película del fin del milenio.
                Fue lanzada en : 
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);
        System.out.println(sinopsis);

        int clasificacion = (int) (media / 2);
        System.out.println(String.format("Clasificación: %d estrellas." , clasificacion));
    }
}