# Guess the Number Game

## Overview

The **Guess the Number** game is a simple console-based game written in Java as a practice project.

The goal is to guess a randomly generated number within a specified range. The game features different difficulty levels, a scoring system, and the ability to play multiple rounds while tracking your highest score.

## Features

- **Difficulty Levels**: Choose between Easy, Medium, and Hard, each offering different number ranges and attempt limits.
- **Hint System**: Receive hints (e.g., whether the number is even or odd) after a certain number of incorrect guesses.
- **Score System**: Earn points based on the difficulty level and the number of attempts taken to guess the correct number.
- **High Score Tracking**: The game tracks the highest score achieved across multiple rounds.
- **Play Again Option**: Continue playing as many rounds as you like without restarting the game.

## Getting Started

### Prerequisites

- **Java**: Ensure that you have Java installed on your system. You can download the latest version from [Oracle's official website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

### Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/guess-the-number-game.git
   ```
   
2. **Navigate to the Project Directory**:
   ```bash
   cd guess-the-number-game
   ```

3. **Compile the Java Program**:
   ```bash
   javac GuessTheNumber.java
   ```

4. **Run the Game**:
   ```bash
   java GuessTheNumber
   ```

## How to Play

1. **Start the Game**: After running the program, you'll be prompted to select a difficulty level:
   - **1. Easy**: Guess a number between 1 and 50 with 10 attempts.
   - **2. Medium**: Guess a number between 1 and 100 with 7 attempts.
   - **3. Hard**: Guess a number between 1 and 200 with 5 attempts.

2. **Enter Your Guesses**: Type your guess and press Enter. The game will tell you if your guess is too low, too high, or correct.

3. **Hints**: After a certain number of incorrect guesses, you'll receive a hint indicating whether the number is even or odd.

4. **Scoring**: Your score starts at 1000 and decreases by 100 points for each incorrect guess. If you guess the number correctly, your score is compared to the high score, which is updated if you outperform it.

5. **Play Again**: After each round, you can choose to play again by typing 'y'. Type 'n' to exit the game.

6. **High Score**: When you decide to quit, the game will display your highest score across all rounds.

## Example Gameplay

```text
Select difficulty level:
1. Easy (1-50, 10 attempts)
2. Medium (1-100, 7 attempts)
3. Hard (1-200, 5 attempts)
> 2

I've picked a number between 1 and 100. Try to guess it!
Enter your guess (or type '0' to quit): 50
Too low!
Enter your guess (or type '0' to quit): 75
Too high!
Hint: The number is odd.
Enter your guess (or type '0' to quit): 65
Too high!
Out of attempts! The number was 55.
Would you like to play again? (y/n): n
Thanks for playing! Your highest score was: 700
```