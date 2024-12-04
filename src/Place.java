public class Place {
    protected String name;
    protected int population;
    protected double area;

    public Place() {
        this.name = " ";
        this.population = 0;
        this.area = 0.0;
    }

    public Place(String name, int population, double area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public void show() {
        System.out.println("Назва: " + name);
        System.out.println("Населення: " + population);
        System.out.println("Площа: " + area);
    }
}