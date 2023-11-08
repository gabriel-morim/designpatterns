package org.example;

public class RomulanClient extends AlienClient{

    public OrderingStrategy createOrderingStrategy(){
        ImpatientStrategy strategy = new ImpatientStrategy();
        return strategy;
    }

}
