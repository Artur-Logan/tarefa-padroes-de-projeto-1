package entities;

public class SemContratosFactory extends Factory{
    @Override
    Car retrieveCar(String carroCriado) {
        if ("A".equals(carroCriado)) {
            return new Brasilia(100, "cheio", "azul");
        } else {
            return null;
        }
    }
}
