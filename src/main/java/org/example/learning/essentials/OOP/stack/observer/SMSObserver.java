package org.example.learning.essentials.OOP.stack.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by User on 26.05.2025
 */
public class SMSObserver implements Observer {

    private static final Logger logger = LoggerFactory.getLogger(SMSObserver.class);


    @Override
    public void update(String message) {
        logger.info("📱 SMS wysłany: {}", message);
    }
}
