import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor( "Hetor Toñealo", "Tolear");
        //myDoctor.name = "Hetor Toleado";
        myDoctor.showName();
        System.out.println(CalculatorTola.sumTola(5,6));

        showMenu();
    }
}
