public class Tequila extends CoffeeDecorator{
    private double cost = 4.2;
    Tequila(Coffee specialCoffee){
        super(specialCoffee);
    }

    public double makeCoffee() {
        return specialCoffee.makeCoffee() + addTequila();
    }

    private double addTequila() {

        System.out.println(" + Tequila: $4.2");

        return cost;
    }
}
