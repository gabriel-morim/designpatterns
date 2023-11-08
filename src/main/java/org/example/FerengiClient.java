package org.example;

public class FerengiClient extends AlienClient{
    public OrderingStrategy createOrderingStrategy(){
        SmartStrategy strategy = new SmartStrategy();
        return strategy;
    }

}
