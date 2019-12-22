package generic;

public class GenericPrinterTest {
    public static void main(String[] args) {

        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
        Powder powder = new Powder();
        powderPrinter.setMeterial(powder);

        System.out.println(powderPrinter);

        powderPrinter.printing();
    }
}
