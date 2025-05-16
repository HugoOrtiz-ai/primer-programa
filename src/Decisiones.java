public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "Plus";

        if (fechaDeLanzamiento >= 2022) {
            System.out.println("Películas más populares.");
        } else {
            System.out.println("Películas Retro que aún vale la pena ver.");
        }

        if (incluidoEnElPlan && tipoPlan.equals("Plus")) {
            System.out.println("Disfrute de su película.");
        }  else {
            System.out.println("Película no disponible para su plan actual");
        }
    }
}
