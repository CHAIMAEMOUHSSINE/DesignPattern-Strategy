package net.chaimae;

public class StrategyImpl1 implements   Strategy {
    @Override
    public void effectuerOperation() {
        System.out.println("Operation effectuée par StrategyImpl1");
    }
}
