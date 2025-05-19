# Animations - Java Learning Project

This section of the project includes various fun terminal-based animations implemented in Java. These animations are designed to showcase different ways of creating visually interesting progress bars and effects using emojis and colored text. All of these animations were created with **the help of ChatGPT**, with some elements being developed independently.

## Overview

The animations are part of a broader educational project aimed at learning Java through coding exercises. In this section, you'll find a collection of fun and minimalist animations that can be displayed directly in the terminal.

## List of Animations

### 1. **Extreme Minimalistic Animation**
A very simple loading animation using nature-inspired symbols. It is a highly simplified progress bar that cycles through symbols like leaves and trees.

### 2. **Green Rain Animation**
A visually appealing animation where plant-related emojis (like 🌿 and 🍃) fall from the top of the terminal, simulating a "green rain" effect. Each frame changes slightly with random plant emojis, creating a dynamic visual.

### 3. **Gradient Progress Bar**
A loading progress bar that fills up with different shades of green, creating a gradient effect as it progresses. This animation simulates a color transition as it reaches 100%.

### 4. **myAnimation()**
A minimalistic animation that simulates a loading process by gradually adding dots to the word "Loading". **This specific animation was developed entirely independently by me**.

### 5. **Minimalistic Green Lemon**
A progress bar animation that uses various symbols (plants, fruits, etc.) to indicate progress. This one is a bit more playful, with symbols changing throughout the progress bar.

## How to Customize Animations

Each animation is designed to be customizable. You can tweak parameters such as:
- **Symbols**: Change the emojis or symbols used in the animations.
- **Speed**: Adjust the delay between frames to make the animations faster or slower.
- **Colors**: Modify the colors used in the progress bars or the emojis (using ANSI escape codes).

For example, if you want to change the speed of an animation, look for the `TimeUnit.MILLISECONDS.sleep()` calls in the animation methods and modify the delay value.

### Customization Example:
In the **Green Rain** animation, you can change the array of `shades` or the `drops` to use different emojis or colors, making the animation fit your personal style.

```java
String[] shades = {
    "\033[38;5;34m", "\033[38;5;40m", "\033[38;5;46m", "\033[38;5;82m"
};
String[] drops = {"🌿", "🍃", "🌱", "🍀"};
