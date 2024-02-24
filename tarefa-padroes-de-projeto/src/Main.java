import entities.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


            Customer cliente = new Customer("A", false);
            Factory factory = getFactory(cliente);
            Car car = factory.create(cliente.getGradeRequest());
            car.startEngine();
        }

        private static Factory getFactory(Customer cliente) {
            if (cliente.hasCompanyContract()) {
                return new ContratosFactory();
            } else {
                return new SemContratosFactory();
            }

    }

}