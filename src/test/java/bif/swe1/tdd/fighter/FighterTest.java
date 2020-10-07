package bif.swe1.tdd.fighter;

import bif.swe1.tdd.fighter.testmodel.TestFighter;
import bif3.swe1.tdd.fighter.DarthVader;
import bif3.swe1.tdd.fighter.Fighter;
import bif3.swe1.tdd.fighter.Luke;
import bif3.swe1.tdd.fighter.Yoda;
import bif3.swe1.tdd.weapon.LightsaberColor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FighterTest {
    @Test
    public void testColorOfLuke() {
        // Arrange
        Fighter luke = new Luke();

        // Act
        var actual = luke.getLightsaber().getColor();

        // Assert
        Assertions.assertEquals(LightsaberColor.Green, actual);
    }

    @Test
    public void testColorOfYoda(){
        // Arrange
        Fighter fighter = new Yoda();

        // Act
        var actual = fighter.getLightsaber().getColor();

        // Assert
        Assertions.assertEquals(LightsaberColor.Blue, actual);
    }

    @Test
    public void testColorOfDarthVader() {
        // Arrange
        Fighter fighter = new DarthVader();

        // Act
        var actual = fighter.getLightsaber().getColor();

        // Assert
        Assertions.assertEquals(LightsaberColor.Red, actual);
    }

    @Test
    public void testColorOfUnknown() {
        // Arrange
        Fighter fighter = new TestFighter();

        // Act
        var actual = fighter.getLightsaber().getColor();

        // Assert
        Assertions.assertEquals(LightsaberColor.Unknown, actual);
    }
}
