public class Camera {
    int screenResolution;
    int matrixResolution;
    double weight;
    int x;
    int y;
    int z;

    public Camera(int screenResolution, int matrixResolution, double weight, int x, int y, int z) {
        this.screenResolution = screenResolution;
        this.matrixResolution = matrixResolution;
        this.weight = weight;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(int screenResolution) {
        this.screenResolution = screenResolution;
    }

    public int getMatrixResolution() {
        return matrixResolution;
    }

    public void setMatrixResolution(int matrixResolution) {
        this.matrixResolution = matrixResolution;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void print() {
        String info = "[!] Информация о фотоаппарате: " +
                "\nРазрешение экрана: " + screenResolution +
                "\nРазрешение матрицы: " + matrixResolution +
                "\nВес: " + weight +
                "\nРазмеры: " + x + ", " + y + ", " + z;
        System.out.println(info);
    }
}
