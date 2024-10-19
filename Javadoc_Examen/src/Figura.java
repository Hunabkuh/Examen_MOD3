public class Figura {
    private String nombre;

    /**
     * Bienvenido al código del profe comentado por Ferdi.
     *
     * @author Autor del código: Albert Vandellos.
     * @since 2024
     * @version 1.0
     */

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Este método calcula el área de un triángulo.
     *
     * @param base Es la base del triángulo.
     * @param altura Es la altura del triángulo.
     * @return El área del triángulo.
     */

    public double calcularArea(double base, double altura) {
        return (base * altura) / 2;
    }

    /**
     * Este método describe la figura según los datos ingresados.
     *
     * @return Es el nombre de la figura detectada.
     */

    public String describir() {
        return "Esta es una figura llamada: " + nombre;
    }

    /**
     * Este método cambia el nombre de la figura.
     *
     * @param nuevoNombre Es el nuevo nombre a elegir.
     * @return Es el nuevo nombre elegido.
     */

    public String cambiarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
        return this.nombre;
    }

    /**
     * Este método cambia el nombre de la figura.
     *
     * @param lado1 El ancho del cuadrado.
     * @param lado2 La altura del cuadrado.
     * @return El nuevo nombre de la figura.
     */

    public String esCuadrado(double lado1, double lado2) {
        if (lado1 == lado2) {
            return "Es un cuadrado.";
        } else {
            return "No es un cuadrado.";
        }
    }
}

