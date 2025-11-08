package simulation;

import java.util.Random;

public class DiceSimulator {
    private final int[] outcomes;
    private final Random random;

    public DiceSimulator() {
        this.outcomes = new int[6];
        this.random = new Random();
    }

    public DiceSimulator(long seed) {
        this.outcomes = new int[6];
        this.random = new Random(seed);
    }

    public int[] getOutcomes() {return outcomes.clone();}

    public double[] getPercentages(int n) {
        if (n <= 0) return new double[outcomes.length];
        double[] p = new double[outcomes.length];
        for (int i = 0; i < outcomes.length; i++) {
            p[i] = outcomes[i] * 100.0 / n;
        }
        return p;
    }

    public void simulate(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive");
        }

        for (int i = 0; i < 6; i++) {
            outcomes[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            int roll = random.nextInt(6); // 0-5
            outcomes[roll]++;
        }
    }

    public void printResults(int n) {
        if (n <= 0) {
            System.out.println("There are no rolls to display the results");
            return;
        }
        System.out.println("=== Dice Roll Results ===");
        System.out.printf("Total rolls: %d%n", n);
        for (int i = 0; i < outcomes.length; i++) {
            System.out.printf("%d: %d (%.2f%%)%n", i + 1, outcomes[i], outcomes[i] * 100.0 / n);
        }
        System.out.println("Theoretical probability: 16.67% per side\n");
    }
}
