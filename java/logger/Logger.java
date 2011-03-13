package logger;

import java.lang.*;

public class Logger extends java.lang.Object {
    private static Logger instance;

     public Logger() {
    }

     public Logger(String s) {
    }

    public static Logger instance() {
        if((instance) == (null)) instance = new Logger("");
        return instance;
    }

    public void log(String entry) {
        System.out.println((" -- Logger adding entry: ") + (entry));
    }

}