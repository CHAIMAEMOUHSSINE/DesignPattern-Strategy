package net.chaimae;

public class DefaultStrategyImpl implements Strategy {
    @Override
    public void effectuerOperation() {
        System.out.println("Operation effectuée par Default");
    }
}
