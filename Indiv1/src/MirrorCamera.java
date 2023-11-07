public class MirrorCamera extends Camera {
    String typeThread;

    public MirrorCamera(int screenResolution, int matrixResolution, double weight, int x, int y, int z, String typeThread) {
        super(screenResolution, matrixResolution, weight, x, y, z);
        this.typeThread = typeThread;
    }

    public void setTypeThread(String typeThread) {
        this.typeThread = typeThread;
    }

    public void print() {
        String info = "[!] Информация о фотоаппарате: " +
                "\nРазрешение экрана: " + screenResolution +
                "\nРазрешение матрицы: " + matrixResolution +
                "\nВес: " + weight +
                "\nРазмеры: " + x + ", " + y + ", " + z +
                "\nТип резьбы: " + typeThread;
        System.out.println(info);
    }
}
