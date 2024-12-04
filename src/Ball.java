public class Ball extends Body {
    private double radius;

    public Ball() {
        this.radius = 0.0;
    }

    public Ball(double radius) {
        this.radius = radius;
    }


    @Override
    public double calculateVolume() {//Об'єм = (4/3) * π * радіус^3
        return ((double) 4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }//Площа поверхні = 4 * π * радіус^2

    @Override
    public String toString() {
        return "Radius : "+radius+"\n Площа поверхні : "+calculateSurfaceArea()+"\n Об'єм : "+calculateVolume();
    }
}
