package entities;

import entities.Car;

public abstract class Factory {

    public Car create(String carroCriado){
        Car carro = retrieveCar(carroCriado);
        carro = prepareCar(carro);
        return carro;
    }

    abstract Car retrieveCar(String carroCriado);

    private Car prepareCar(Car carro){
        carro.clean();
        carro.mechanicCheck();
        carro.fuelCar();

        return carro;
    }
}
