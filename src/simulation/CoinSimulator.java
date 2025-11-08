package simulation;

import java.util.Random;

public class CoinSimulator {
    private int headsCount;
    private int tailsCount;
    private final Random random;

    public CoinSimulator() {
        this.random = new Random();
    }

    public CoinSimulator(long seed) {
        this.random = new Random(seed);
    }

    public void simulate(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive");
        }

        headsCount = 0;
        tailsCount = 0;

        for (int i = 0; i < n; i++) {
            if (random.nextBoolean()) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }
    }

    public int getHeadsCount() {return headsCount;}
    public int getTailsCount() {return tailsCount;}

    public double getHeadsPercentage(int n) {
        if (n <= 0) return Double.NaN;
        return headsCount * 100.0 / n;
    }

    public void printResults(int n) {
        if (n <= 0) {
            System.out.println("There are no rolls to display the results");
            return;
        }
        System.out.println("=== Coin Toss Results ===");
        System.out.printf("Total tosses: %d%n", n);
        System.out.printf("Heads: %d (%.2f%%)%n", headsCount, getHeadsPercentage(n));
        System.out.printf("Tails: %d (%.2f%%)%n", tailsCount, 100.0 - getHeadsPercentage(n));
        System.out.println("Theoretical probability: 50% / 50%\n");
    }
}
