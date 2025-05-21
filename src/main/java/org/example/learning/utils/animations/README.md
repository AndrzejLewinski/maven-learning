# Animations - Project Overview

This repository contains various animation examples implemented in Java. The animations are organized into different categories and can be executed either individually or in bulk. Below is an overview of the available animations and their functionality.

---

## Project Structure

The project is organized as follows:

### 1. **Demo**
- **AnimationDemo.java**  
  A simple class to demonstrate various predefined animations. It is used to quickly test and view animations such as `HerbalLeaf 🌿`, `FourLeafClover 🍀`, `Lemon 🍋`, and `Dots`.

### 2. **Generators**
- **Animation.java**  
  The base interface for all animation classes.
- **MinimalisticAnimations.java**  
  Contains minimalistic and simple animations.
- **NotConventionalAnimations.java**  
  Defines animations that do not follow conventional structures, such as the "GreenRain 🌧️" animation.
- **ProgressBarAnimations.java**  
  Includes animations related to progress bars.

### 3. **Launcher**
- **AnimationLauncher.java**  
  The main class that contains methods to run various animations individually or all at once. You can call `AnimationLauncher.runAll()` to execute all predefined animations.

### 4. **Presets**
- **Graphic Animations**
    - **FourLeafCloverAnimation.java**  
      A graphic animation of a four-leaf clover 🍀.
    - **GradientAnimation.java**  
      A gradient-themed animation 
    - **GreenRain.java**  
      A non-conventional animation simulating a "green rain" effect 🌧️.
    - **HerbalLeafAnimation.java**  
      A graphic animation of herbal leaves falling 🌿.
    - **LemonAnimation.java**  
      A graphic animation involving lemons 🍋.

- **Loading Animations**
    - **DotsAnimation.java**  
      A simple dots loading animation.

---

## How to Run

### To run all animations:
Use the following method call:

```java
AnimationLauncher.runAll(); // Runs all animations (Herbal Leaf 🌿, Four Leaf Clover 🍀, Lemon 🍋, Dots)
