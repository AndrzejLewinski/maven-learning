package org.example.learning.utils.animations.presets.graphic;

import org.example.learning.utils.animations.generators.Animation;
import org.example.learning.utils.animations.generators.MinimalisticAnimations;

/**
 * Created by User on 21.05.2025
 */
@SuppressWarnings("unused")
public class HerbalLeafAnimation implements Animation {

    @Override
    public void run() {
        MinimalisticAnimations minimalisticAnimations = new MinimalisticAnimations();
        minimalisticAnimations.herbalLeafAnimation();
    }
}
