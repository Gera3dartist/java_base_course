package com.gera.javacore.exercises.Chapter5;


import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

class Ex13 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("com.gera.javacore.exercises.Chapter5");
        logger.setUseParentHandlers(false);
        Handler handler = new ConsoleHandler();
        logger.addHandler(handler);
        logger.setFilter((line) -> line.getMessage().contains("drugs")
                || line.getMessage().contains("sex")
                || line.getMessage().contains("C++")
        );
        logger.info("Some message");
        logger.info("Some drugs");
        logger.info("Some sex");
        logger.info("Some C++");


    }

}