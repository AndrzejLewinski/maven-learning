package org.example.learning.utils.animations.presets.graphic;

import org.example.learning.utils.animations.generators.Animation;
import org.example.learning.utils.animations.generators.ProgressBarAnimations;

/**
 * Created by User on 21.05.2025
 */
@SuppressWarnings("unused")
public class LemonAnimation implements Animation {
    @Override
    public void run() {
        ProgressBarAnimations progressBarAnimations = new ProgressBarAnimations();
        progressBarAnimations.lemonAnimation();
    }
}
