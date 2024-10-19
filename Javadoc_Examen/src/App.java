public class App {


    public static void main(String[] args) throws Exception {

        Figura figura = new Figura("Triángulo");

        System.out.println(figura.describir());

        double area = figura.calcularArea(5, 10);
        System.out.println("Área del triángulo: " + area);

        String nuevoNombre = figura.cambiarNombre("Cuadrado");
        System.out.println("Nuevo nombre de la figura: " + nuevoNombre);

        String resultadoCuadrado = figura.esCuadrado(5, 5);
        System.out.println(resultadoCuadrado);

    }

}
