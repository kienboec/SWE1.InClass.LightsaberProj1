import bif3.swe1.tdd.fighter.DarthVader;
import bif3.swe1.tdd.fighter.Fighter;
import bif3.swe1.tdd.fighter.Luke;
import bif3.swe1.tdd.fighter.Yoda;

public class Main {
    public static void main(String[] args) {
        Fighter luke = new Luke() ;
        Fighter yoda = new Yoda() ;
        Fighter darthVader = new DarthVader() ;

        System.out.println("Luke has color: " + luke.getLightsaber().getColor());
        System.out.println("Yoda has color: " + yoda.getLightsaber().getColor());
        System.out.println("DarthVader has color: " + darthVader.getLightsaber().getColor());

    }
}
