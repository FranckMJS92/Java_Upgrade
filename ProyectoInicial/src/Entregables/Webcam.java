package ProyectoInicial.src.Entregables;

/*
* Clase Webcam que simula el funcionamiento de una cámara web
 * Date: 2025-02-16
 * @autor Francisco López
 * @version 1.0
 */

 /*
  * Clase Webcam posee entre sus atributos:
    * resolucion: String -> Indicada en el momento de la creacion del objeto
    * fps: int -> Indicada en el momento de la creacion del objeto
    * on_off: boolean -> Creada por defecto
    * tamanoImagen: double -> Calculada dentro del metodo tomarFoto
  *
  */
public class Webcam {
    private String resolucion;
    private int fps;
    private boolean on_off;
    private double tamanoImagen;

 /*
    * Constructor vacio de la clase Webcam que inicializa los atributos de la clase con valores por defecto
  */   
    public Webcam() {
    }
/*
 * Constructor de la clase Webcam que inicializa los atributos de la clase con valores indicados por el usuario
 */
    public Webcam(String resolucion, int fps) {
        this.resolucion = resolucion;
        this.fps = fps;

    }

    /*
     * Metodos get y set para cada atributo de la clase Webcam
     * Lineas 43 a 73
     * 
     */
    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public int getFps() {
        return fps;
    }

    public void setFps(int fps) {
        this.fps = fps;
    }

    public boolean getOn_off() {
        return on_off;
    }

    public void setOn_off(boolean on_off) {
        this.on_off = on_off;
    }

    public double getTamanoImagen() {
        return tamanoImagen;
    }

    public void setTamanoImagen(double tamanoImagen) {
        this.tamanoImagen = tamanoImagen;
    }

    public void encender() {
        on_off = true;
    }

    public void apagar() {
        on_off = false;
    }

    /*
     * Metodo tomarFoto que simula la toma de una foto con la cámara web
     * Se crean variables de instancia ancho y alto para el tratamiento y 
     * facilitar la posterior manipulacion/actualizacion de la resolucion
     * 
     * Se valida si la cámara está encendida para poder tomar la foto
     * de ser asi, se imprime un mensaje indicando que la foto fue tomada y mostrando el tamaño de la imagen
     * 
     * De lo contrario, se imprime un mensaje indicando que la cámara está apagada
     */
    public void tomarFoto() {
        int ancho = Integer.valueOf(resolucion.substring(0, 4));
        int alto = Integer.valueOf(resolucion.substring(resolucion.length() - 4, resolucion.length()));
        if (on_off == true) {
            System.out.println("Foto tomada");
            tamanoImagen = (ancho * alto * fps) / 1000000;
            System.out.println("Tamaño de la imagen: " + tamanoImagen);
        } else {
            System.out.println("La cámara está apagada");
        }
    }

    /*
     * Metodo main que simula el uso de la clase Webcam
     */
    public void main(String[] args) {
        Webcam cam = new Webcam("1920x1080", 30);
        cam.encender();
        cam.tomarFoto();
        cam.apagar();

    }

}
