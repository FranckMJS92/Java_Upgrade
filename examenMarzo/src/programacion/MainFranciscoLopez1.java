package programacion;

//Interface con metodo obtenerReceta()
interface RecetaMazapan {

    String obtenerReceta();

}

// Clase MazapanClasico
// Implementa el metodo obtenerReceta() de la interface RecetaMazapan
// No conozco la receta =(
class MazapanClasico implements RecetaMazapan {

    @Override
    public String obtenerReceta() {

        return "Receta tradicional con almendras, azucar (mucha azucar para mi gusto) y clara de huevo. "
                + "No estoy muy seguro de como se hace pero debo decir que se come muy bien con un cafe sin azucar =)";
    }
}

// Clase MazapanChocolate
// Implementa el metodo obtenerReceta() de la interface RecetaMazapan
// No conozco la receta =( pero esta si la investigare n_n
class MazapanChocolate implements RecetaMazapan {

    @Override
    public String obtenerReceta() {

        return "Receta con cacao añadido para una versión chocolatada. "
                + "Definitivamente debo probar esta version porque me gusta el chocolate =D";

    }
}

// Clase RecetarioMazapan
class RecetarioMazapan {

    private RecetaMazapan receta;

    // Constructor
    public RecetarioMazapan(RecetaMazapan receta) {
        this.receta = receta;
    }

    // Metodo get -> getReceta()
    public RecetaMazapan getReceta() {
        return receta;
    }

    // Metodo set -> setReceta()
    public void setReceta(RecetaMazapan receta) {
        this.receta = receta;
    }

    // Metodo mostrarReceta()
    public void mostrarReceta() {
        System.out.println(receta.obtenerReceta());
    }

}

// Clase principal
public class MainFranciscoLopez {
    // Metodo Main()
    public static void main(String[] args) {

        RecetarioMazapan receta1 = new RecetarioMazapan(new MazapanClasico());

        // Mostrando la receta actual
        System.out.println("Mostrando receta con el objeto actual -> Mazapan Clasico");
        receta1.mostrarReceta();

        // Modificando la receta
        receta1.setReceta(new MazapanChocolate());

        // Mostrando la nueva receta
        System.out.println("\nMostrando receta luego del set -> Mazapan con Chocolate");
        receta1.mostrarReceta();

    }

}
