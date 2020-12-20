public class buildOrders{
    Coffee order;
    String orderDetails;
    buildOrders(){
        orderDetails="";
        order = new BasicCoffee();

    }
    public void addCream(){
        order = new Cream(order);
    }
    public void addExtraShot(){
        order = new ExtraShot(order);
    }
    public void addSugar(){
        order = new Sugar(order);
    }
    public void addTequila(){
        order = new Tequila(order);
    }
    public void addWhey(){
        order = new Whey(order);
    }
    public void newCoffee(){
        order= new BasicCoffee();
        orderDetails = "";
    }
    public String returnCost(){
        return ((Double)order.makeCoffee()).toString();
    }
        public class Cream extends CoffeeDecorator{

        private double cost = .50;
        Cream(Coffee specialCoffee){
            super(specialCoffee);
            orderDetails+=" + cream: $.50\n";
        }

        public double makeCoffee() {
            return specialCoffee.makeCoffee() + addCream();
        }

        private double addCream() {

            return cost;
        }
    }
    public class ExtraShot extends CoffeeDecorator {

        private double cost = 1.20;

        ExtraShot(Coffee specialCoffee){
            super(specialCoffee);
            orderDetails+=" + extra shot: $1.20\n";
        }

        public double makeCoffee() {
            return specialCoffee.makeCoffee() + addShot();
        }

        private double addShot() {


            return cost;
        }
    }
    public class Sugar extends CoffeeDecorator{

        private double cost = .50;

        Sugar(Coffee specialCoffee){
            super(specialCoffee);
            orderDetails+=" + sugar: $.50\n";
        }

        public double makeCoffee() {
            return specialCoffee.makeCoffee()+ addSugar();
        }

        private double addSugar() {

            return cost;
        }
    }
    public class Tequila extends CoffeeDecorator{
        private double cost = 4.2;
        Tequila(Coffee specialCoffee){
            super(specialCoffee);
            orderDetails+=" + Tequila: $4.2\n";
        }

        public double makeCoffee() {
            return specialCoffee.makeCoffee() + addTequila();
        }

        private double addTequila() {


            return cost;
        }
    }
    public class Whey extends CoffeeDecorator{
        private double cost = 6.9;
        Whey(Coffee specialCoffee){
            super(specialCoffee);
            orderDetails+=" + Whey Protein: $6.9\n";
        }

        public double makeCoffee() {
            return specialCoffee.makeCoffee() + addWhey();
        }

        private double addWhey() {



            return cost;
        }
    }

}
