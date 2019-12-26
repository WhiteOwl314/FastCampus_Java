package stream.coffee;

public class Lattee extends Decorator{
    public Lattee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.print("Adding Milk ");
    }
}
