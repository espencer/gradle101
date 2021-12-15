package net.dlopez.gradle101.common;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Hello {
    protected static final Logger logger = LogManager.getLogger();

    public void SayHello() {
        logger.log(Level.ERROR, "Hey");
        System.out.println("Hello World");
    }
}
