package org.example;

import java.util.ArrayList;
import java.util.List;

public class StringBar extends Bar{

    private boolean HappyHourStatus;

    public StringBar(){
        this.HappyHourStatus = false;

    }
    public boolean isHappyHour(){
        return HappyHourStatus;
    };

    public void startHappyHour(){
        this.HappyHourStatus = true;
        this.notifyObservers();
    };

    public void endHappyHour(){
        this.HappyHourStatus = false;
        this.notifyObservers();
    };

    public void order(StringDrink drink, StringRecipe recipe){
        recipe.mix(drink);

    }


}
