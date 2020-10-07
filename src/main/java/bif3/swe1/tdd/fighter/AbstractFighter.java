package bif3.swe1.tdd.fighter;

import bif3.swe1.tdd.weapon.Lightsaber;
import bif3.swe1.tdd.weapon.LightsaberColor;

public abstract class AbstractFighter implements Fighter{
    private Lightsaber _lightsaber;

    private String name;

    public Lightsaber getLightsaber(){
        return _lightsaber;
    }

    public AbstractFighter(String name){
        if(name == "Luke") {
            _lightsaber = new Lightsaber(LightsaberColor.Green);
        } else if(name == "Yoda") {
            _lightsaber = new Lightsaber(LightsaberColor.Blue);
        } else if(name == "DarthVader") {
            _lightsaber = new Lightsaber(LightsaberColor.Red);
        } else {
            _lightsaber = new Lightsaber(LightsaberColor.Unknown);
        }
    }
}
