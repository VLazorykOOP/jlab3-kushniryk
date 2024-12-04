public class Parallelepiped extends Body {
    private double length;
    private double width;
    private double height;

    public Parallelepiped() {
        this.height = 0;
        this.length = 0;
        this.width = 0;
    }

    public Parallelepiped(double length, double width, double height) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateSurfaceArea() {//площа поверхні
        return 2 * (length * width + width * height + height * length);//Sп = 2(ab + bc + ac).
    }

    @Override
    public double calculateVolume() {
        return height * width * length;//Об'єм прямокутного паралелепіпеда дорівнює добутку його довжини, ширини і висоти.
    }

    @Override
    public String toString() {
        return "\n length : " + length + "\n width : " + width + "\n height : " + height + "\n Площа поверхні : " + calculateSurfaceArea() + "\n Об'єм : " + calculateVolume();
    }
}