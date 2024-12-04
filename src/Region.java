class Region extends Place {
    private String adminCenter;

    public Region() {
        super();
        this.adminCenter = " ";
    }

    public Region(String name, int population, double area, String adminCenter) {
        super(name, population, area);
        this.adminCenter = adminCenter;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Адміністративний центр: " + adminCenter);
    }
}
