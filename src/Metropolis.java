class Metropolis extends City {
    private int idk;

    public Metropolis() {
        super();
        this.idk = 0;
    }

    public Metropolis(String name, int population, double area, String country, String region, int idk) {
        super(name, population, area, country, region);
        this.idk = idk;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Не знаю, яка різниця між містом та мегаполісом, яку я б міг реалізувати: " + idk);
    }
}
