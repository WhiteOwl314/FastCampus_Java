package stream.coffee;

public class CoffeeTest {
    public static void main(String[] args) {

        Coffee americano = new KenyaAmericano();
        americano.brewing();

        System.out.println();

        Coffee kenyaLattee = new Lattee(new KenyaAmericano());
        kenyaLattee.brewing();

        System.out.println();
        Coffee kenyaMocha = new Mocha(new Lattee(new KenyaAmericano()));
        kenyaMocha.brewing();
    }
}
