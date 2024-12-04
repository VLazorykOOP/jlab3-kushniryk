class City extends Place {
    private String country;
    private String region;

    public City() {
        super();
        this.country = " ";
        this.region = " ";
    }

    public City(String name, int population, double area, String country, String region) {
        super(name, population, area);
        this.country = country;
        this.region = region;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Країна: " + country);
        System.out.println("Регіон: " + region);
    }
}

