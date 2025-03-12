package programacion;

interface RecetaGalleta {

    abstract String obtenerReceta();

}

class GalletasChispas implements RecetaGalleta {

    @Override
    public String obtenerReceta() {
        return "Receta galleta con chispas chocllate hechas por la abuelita :D";
    }

}

class GalletaAvena implements RecetaGalleta {

    @Override
    public String obtenerReceta() {
        return "Receta galleta de Avena muy ricas hechas por mua";
    }
}

class RecetarioGalletas {
    private RecetaGalleta receta;

    public RecetarioGalletas(RecetaGalleta receta) {
        this.receta = receta;
    }

    public RecetaGalleta getReceta() {
        return receta;
    }

    public void setReceta(RecetaGalleta receta) {
        this.receta = receta;
    }

    public void mostrarReceta(){
        System.out.println(receta.obtenerReceta());
    }
}

public class MainFranciscoLopez {
    public static void main(String[] args) {

        RecetarioGalletas receta1 = new RecetarioGalletas(new GalletasChispas());

        System.out.println("Receta Galleta de chocolate");
        receta1.mostrarReceta();

        receta1.setReceta(new GalletaAvena());

        System.out.println("Receta Galleta de avena luego de cambiar");
        receta1.mostrarReceta();

    }
}
