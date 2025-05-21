package org.example.learning.utils.animations.presets.graphic;

import org.example.learning.utils.animations.generators.Animation;
import org.example.learning.utils.animations.generators.NotConventionalAnimations;

/**
 * Created by User on 21.05.2025
 */
public class GradientAnimation implements Animation {
    @Override
    public void run() {
        NotConventionalAnimations notConventionalAnimations = new NotConventionalAnimations();
        notConventionalAnimations.gradientProgressBarAnimation();
    }
}
