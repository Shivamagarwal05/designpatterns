package com.shivam.patterna.singleton;

import java.io.Serializable;
import java.util.Objects;

public class Logger implements Serializable, Cloneable {

    private static Logger logger;

    private Logger() {
        System.out.println("Object initialised.");

    }

    public static Logger getLogger() {
        if (Objects.isNull(logger)) {
            synchronized (Logger.class) {
                if (Objects.isNull(logger)) {
                    logger = new Logger();
                }
            }

        }
        return logger;
    }

    @Override
    public Logger clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    protected Object readResolve() {
        return getLogger();
    }
}
