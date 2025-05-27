package org.example.learning.essentials.OOP.stack.singletons.singleton;

/**
 * Created by User on 27.05.2025
 */
public class SimpleLogger {


    //jedyna instancja klasy Logger
    private static final SimpleLogger logger = new SimpleLogger();

    //prywatny konstruktor
    private SimpleLogger() {
    }

    //globalny punkt dostępu do instancji
    public static SimpleLogger getInstance() {
        return logger;
    }

    public void message(String message){
        System.out.println(message);
    }

}

   class SimpleLoggerExampleUse {

    public static void main(String[] args) {

        SimpleLogger logger = SimpleLogger.getInstance();
        logger.message("message");
    }

}
