# Coin & dice simulations (Java)


## 📖 Project Overview
This repository contains a **Java console application** that simulates random experiments based on the principles of **probability theory**.  
The project demonstrates the use of pseudo-random number generation and frequency analysis in repeated independent trials.

Two experiments are implemented:
- **Coin Toss Simulation** — models repeated coin flips (Heads/Tails).
- **Dice Roll Simulation** — models repeated dice throws (1–6).

---

## ⚙️ Features
- Simulation of independent random events using `java.util.Random`.
- Frequency counting and percentage calculation for each outcome.
- Comparison of **empirical** and **theoretical** probabilities.
- Modular code structure (each simulation as a separate class).

---

## 🧩 Project Structure
```
src/
 └── simulation/
      ├── CoinSimulator.java   // Simulates coin tosses
      ├── DiceSimulator.java   // Simulates dice rolls
      └── Main.java            // Entry point of the program
```

---

## 🧠 Example Output
```
=== Simulation of Coin Tosses and Dice Rolls ===
Enter number of trials: 10000

=== Coin Toss Results ===
Total tosses: 10000
Heads: 5018 (50.18%)
Tails: 4982 (49.82%)
Theoretical probability: 50% / 50%

=== Dice Roll Results ===
Total rolls: 10000
1: 1670 (16.70%)
2: 1651 (16.51%)
3: 1690 (16.90%)
4: 1644 (16.44%)
5: 1663 (16.63%)
6: 1682 (16.82%)
Theoretical probability: 16.67% per side
```

---

## 🚀 How to Run
### Prerequisites
- **JDK 17+**
- Java compiler available in PATH (`javac`)

### Run Instructions
```bash
# Clone the repository
git clone https://github.com/sh-anastasia06/coin-dice-simulations.git
cd coin-dice-simulations/src

# Compile source files
javac simulation/*.java

# Run the program
java simulation.Main
```

---

## 🧮 Theoretical Background
- **Coin toss:** P(Heads) = ½, P(Tails) = ½
- **Dice roll:** P(i) = 1/6 for i = 1…6

With an increasing number of trials `n`, the **relative frequencies** approach the **theoretical probabilities**, illustrating the *Law of Large Numbers*.

---

## 🧱 Code Logic Summary
| Class | Responsibility |
|-------|----------------|
| `CoinSimulator` | Generates random boolean values to simulate coin flips; counts Heads/Tails; computes frequencies. |
| `DiceSimulator` | Generates random integers (1–6); counts outcomes; computes frequencies for each side. |
| `Main` | Provides user interface (input/output), orchestrates simulations, and displays results. |

---

## 🧩 Possible Extensions
- Add graphical visualization (Swing/JavaFX charts).
- Compute deviation from theoretical probability.
- Add more experiments (e.g., roulette, binomial trials, Monte Carlo π estimation).
- Include automated testing with JUnit.

---

## 🧰 Technologies
- **Java 17+**
- **Random API**
- **Object-Oriented Programming**

---

## 👩‍💻 Author
**Anastasia**  
Educational project demonstrating random simulation and probability modeling in Java.

# coin-dice-simulations
# coin-dice-simulations
