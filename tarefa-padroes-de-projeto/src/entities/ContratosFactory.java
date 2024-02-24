package entities;

public class ContratosFactory extends Factory{
    @Override
    Car retrieveCar(String carroCriado) {
            if ("A".equals(carroCriado)) {
                return new CorolaCar(100, "cheio", "azul");
            } else {
                return null;
            }
        }
    }
