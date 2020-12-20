public class Whey extends CoffeeDecorator{
    private double cost = 6.9;
    Whey(Coffee specialCoffee){
        super(specialCoffee);
    }

    public double makeCoffee() {
        return specialCoffee.makeCoffee() + addWhey();
    }

    private double addWhey() {

        System.out.println(" + Whey Protein: $6.9");

        return cost;
    }
}
