package simulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        CoinSimulator coinSimulator = new CoinSimulator();
        DiceSimulator diceSimulator =  new DiceSimulator();

        System.out.println("=== Simulation of Coin Tosses and Dice Rolls ===");
        System.out.print("Enter number of trials: ");
        int n = scanner.nextInt();

        System.out.println();
        coinSimulator.simulate(n);
        coinSimulator.printResults(n);
        diceSimulator.simulate(n);
        diceSimulator.printResults(n);

        scanner.close();
    }
}
