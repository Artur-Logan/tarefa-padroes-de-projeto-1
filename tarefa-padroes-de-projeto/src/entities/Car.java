package entities;

public class Car {

    private int cavalos;
    private String combustivel;
    private String cor;

    public Car(int cavalos, String combustivel, String cor) {
        this.cavalos = cavalos;
        this.combustivel = combustivel;
        this.cor = cor;
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName());
        System.out.println("The " + combustivel + " engine has been started, and is ready to utilize " + cavalos + " horsepowers" );
    }
    public void clean(){
        System.out.println("Car has been cleaned, and the " + cor.toLowerCase() + " color shines");
    }
    public void mechanicCheck(){
        System.out.println("Car has been checked by the mechanic. Everything looks good!");
    }
    public void fuelCar(){
        System.out.println("Car is being filled with " + combustivel.toLowerCase());
    }
}
