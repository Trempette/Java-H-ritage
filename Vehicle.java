public abstract class Vehicle {
    //attributs
    private String brand;
    private int kilometers;

    //Constructeur par défaut
    public Vehicle(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    //getter setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    //Méthode abstraite doStuff()
    public abstract String doStuff();

}