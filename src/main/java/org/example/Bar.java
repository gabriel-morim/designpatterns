package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public abstract class Bar {
    public abstract boolean isHappyHour();

    public abstract void startHappyHour();

    public abstract void endHappyHour();

    private List<BarObserver> observers = new ArrayList<>();

    public void addObserver(BarObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }
}
