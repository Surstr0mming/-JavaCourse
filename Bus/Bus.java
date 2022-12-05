package Bus;

public class Bus {
    private String surname;
    private String name;
    private String middlename;
    private int id_bus;
    private int id_route;
    private String bus_brand;
    private int year_of_build;
    private int mileage;

    @Override
    public String toString() {
        return "BUS{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middlename='" + middlename + '\'' +
                ", id_bus='" + id_bus + '\'' +
                ", id_route='" + id_route + '\'' +
                ", bus_brand='" + bus_brand + '\'' +
                ", year_of_build='" + year_of_build + '\'' +
                ", mileage='" + mileage +
                '}';
    }

    public Bus(String surname, String name, String middlename, int id_bus, int id_route, String bus_brand,
               int year_of_build, int mileage) {
        this.surname = surname;
        this.name = name;
        this.middlename = middlename;
        this.id_bus = id_bus;
        this.id_route = id_route;
        this.bus_brand = bus_brand;
        this.year_of_build = year_of_build;
        this.mileage = mileage;
    }

    public String get_Surname() {
        return surname;
    }

    public void set_Surname(String surname) {
        this.surname = surname;
    }

    public String get_Name() {
        return name;
    }

    public void set_Name(String name) {
        this.name = name;
    }

    public String get_Middlename() {
        return middlename;
    }

    public void set_Middlename(String middlename) {
        this.middlename = middlename;
    }

    public int get_id_bus() {
        return id_bus;
    }

    public void set_id_bus(int id_bus) {
        this.id_bus = id_bus;
    }

    public int get_id_route() {
        return id_route;
    }

    public void set_id_route(int id_route) {
        this.id_route = id_route;
    }

    public String get_bus_brand() {
        return bus_brand;
    }

    public void set_bus_brand(String bus_brand) {
        this.bus_brand = bus_brand;
    }

    public int get_year_of_build() {
        return year_of_build;
    }

    public void set_year_of_build(int year_of_build) {
        this.year_of_build = year_of_build;
    }

    public int get_mileage() {
        return mileage;
    }

    public void set_mileage(int mileage) {
        this.mileage = mileage;
    }

}