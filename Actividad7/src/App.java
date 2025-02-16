package Actividad7.src;

public class App {
    public static void main(String[] args) throws Exception {
        Webcam cam = new Webcam("1920x1080", 30);
        cam.encender();
        cam.tomarFoto();
        cam.apagar();
    }
}
