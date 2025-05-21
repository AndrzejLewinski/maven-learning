package org.example.learning.utils.animations.presets.loading;

import org.example.learning.utils.animations.generators.Animation;
import org.example.learning.utils.animations.generators.MinimalisticAnimations;

/**
 * Created by User on 20.05.2025
 */
public class DotsAnimation implements Animation {

    @Override
    public void run() {
        MinimalisticAnimations.loadingAndDotsAnimation();
    }
}
