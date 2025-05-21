package org.example.learning.utils.animations.demo;

import org.example.learning.utils.animations.presets.graphic.FourLeafCloverAnimation;
import org.example.learning.utils.animations.presets.graphic.HerbalLeafAnimation;
import org.example.learning.utils.animations.presets.graphic.LemonAnimation;
import org.example.learning.utils.animations.presets.loading.DotsAnimation;

/**
 * Created by User on 21.05.2025
 */
public class AnimationDemo {


    public static void main(String[] args) {
        herbalLeafAnimation();
    }

    @SuppressWarnings("unused")
    private static void lemonAnimation() {
        LemonAnimation lemon = new LemonAnimation();
        lemon.run();
    }
    @SuppressWarnings("unused")
    private static void fourLeafCloverAnimation(){
        FourLeafCloverAnimation clover = new FourLeafCloverAnimation();
        clover.run();
    }
    @SuppressWarnings("unused")
    private static void herbalLeafAnimation(){
        HerbalLeafAnimation herbalLeafAnimation = new HerbalLeafAnimation();
        herbalLeafAnimation.run();
    }
    @SuppressWarnings("unused")
    private static void dotsAnimation(){
        DotsAnimation dotsAnimation = new DotsAnimation();
        dotsAnimation.run();
    }
}
