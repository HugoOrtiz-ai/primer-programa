public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!\nBienvenid@ a Screenmatch!!!");
        System.out.println("Película: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        String sinopsis = """
                Matrix es una paradoja.
                La mejor Película del fin del milenio.
                Fue lanzada en : 
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);
    }
}