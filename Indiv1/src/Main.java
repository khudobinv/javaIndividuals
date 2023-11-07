public class Main {
    public static void main(String[] args) {
        Camera camera = new Camera(1920, 2660, 300, 10, 20, 30);
        MirrorCamera mirrorCamera = new MirrorCamera(1080, 2660, 350, 10, 20, 40, "T2");
        camera.print();
        mirrorCamera.print();
    }
}