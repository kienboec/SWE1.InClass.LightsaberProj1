package bif3.swe1.tdd.weapon;

import lombok.Getter;

public class Lightsaber {
    @Getter
    LightsaberColor color;

    public Lightsaber(LightsaberColor color) {
        this.color = color;
    }
}
