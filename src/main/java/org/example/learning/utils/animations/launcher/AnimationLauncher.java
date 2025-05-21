package org.example.learning.utils.animations.launcher;

import org.example.learning.utils.animations.presets.graphic.*;
import org.example.learning.utils.animations.presets.loading.DotsAnimation;

/**
 * Created by User on 21.05.2025
 */

@SuppressWarnings("unused")
public class AnimationLauncher {

    @SuppressWarnings("unused")
    public static void runAll() {
        /// Anonymous object usage – one-time object creation and method call
        new HerbalLeafAnimation().run();
        new FourLeafCloverAnimation().run();
        new LemonAnimation().run();
        new DotsAnimation().run();
    }

    @SuppressWarnings("unused")
    public static void runHerbalLeaf() {
        //System.out.println("Running Herbal Leaf animation...");
        new HerbalLeafAnimation().run();
    }

    @SuppressWarnings("unused")
    public static void runClover() {
        //System.out.println("Running Four Leaf Clover animation...");
        new FourLeafCloverAnimation().run();
    }

    @SuppressWarnings("unused")
    public static void runLemon() {
        //System.out.println("Running Lemon animation...");
        new LemonAnimation().run();
    }

    @SuppressWarnings("unused")
    public static void runDots() {
        //System.out.println("Running Dots animation...");
        new DotsAnimation().run();
    }

    @SuppressWarnings("unused")
    public static void greenRain() {
        //System.out.println("Running Green Rain animation...");
        new GreenRain().run();
    }

    @SuppressWarnings("unused")
    public static void gradientProgressBar() {
        //System.out.println("Running Gradient Progress Bar animation...");
        new GradientAnimation().run();
    }

    @SuppressWarnings("unused")
    public static void displayAvailableMethods(){
        System.out.println(new AnimationLauncher().toString());
    }

    @Override
    public String toString() {
        return """
                Animation Launcher:

                1. runAll()        - Run all predefined animations (Herbal Leaf, Four Leaf Clover, Lemon, Dots).
                2. runHerbalLeaf() - Run the Herbal Leaf animation.
                3. runClover()     - Run the Four Leaf Clover animation.
                4. runLemon()      - Run the Lemon animation.
                5. runDots()       - Run the Dots animation.
                6. greenRain()     - Run the Green Rain (not conventional) animation.
                7. gradientProgressBar() - Run the Gradient Progress Bar (not conventional) animation.

                To execute a specific animation, use the corresponding method call. For example: AnimationLauncher.runHerbalLeaf();
                """;
    }

}
