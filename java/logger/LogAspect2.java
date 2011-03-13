package logger;

import java.lang.*;

class LogAspect2 {
    public static void advice_eftapdrl() {
        String s = "foo";
        Logger.instance().log("Calling -> getName()!");
    }

}