package net.chaimae;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{


        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Choisissez une stratégie ? :");
            String strategyClassName = scanner.nextLine();
            Strategy strategy = (Strategy) Class.forName(strategyClassName).newInstance();
            context.setStrategy(strategy);
            context.effectuerOperation();
        }
    }
}