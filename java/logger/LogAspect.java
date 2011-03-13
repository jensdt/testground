package logger;

import java.lang.*;
import hrm.*;

public class LogAspect {
     private LogAspect() {
    }

    static private LogAspect instance = new LogAspect();

    static public LogAspect instance() {
        return instance;
    }

    private static <T>T proceed(Object _$object, String _$methodName, Object[] _$arguments, Class[] _$types) throws Throwable {
        Class invocationClass;
        if((_$object instanceof Class)) {
            invocationClass = ((Class)_$object);
        }
        else {
            invocationClass = _$object.getClass();
        }
        try {
            java.lang.reflect.Method m = invocationClass.getMethod(_$methodName, _$types);
            return ((T)m.invoke(_$object, _$arguments));
        }
        catch (IllegalArgumentException iarg) {
        }
        catch (SecurityException se) {
        }
        catch (IllegalAccessException iac) {
        }
        catch (java.lang.reflect.InvocationTargetException invo) {
            throw invo.getCause();
        }
        catch (NoSuchMethodException nsm) {
            try {
                java.lang.reflect.Method m = invocationClass.getMethod(_$methodName, _$types);
                return ((T)m.invoke(_$object, _$arguments));
            }
            catch (IllegalArgumentException iarg) {
            }
            catch (SecurityException se) {
            }
            catch (IllegalAccessException iac) {
            }
            catch (java.lang.reflect.InvocationTargetException invo) {
                throw invo.getCause();
            }
            catch (NoSuchMethodException nsm_inner) {
            }
        }
        throw new Error();
    }

    public static <T>T advice_opdcmeic_ckzdqxch(Object _$object, String _$methodName, Object[] _$arguments, int[] _$argumentIndex, Object _$callee) {
        try {
            if(!((_$object instanceof hrm.Person))) {
                return LogAspect.<T>proceed(_$object, _$methodName, _$arguments, new Class[]{Number.class});
            }
        }
        catch (RuntimeException unchecked) {
            throw unchecked;
        }
        catch (Throwable thrwbl) {
            ;
        }
        try {
            if(!((_$callee instanceof logger.Main))) {
                return LogAspect.<T>proceed(_$object, _$methodName, _$arguments, new Class[]{Number.class});
            }
        }
        catch (RuntimeException unchecked) {
            throw unchecked;
        }
        catch (Throwable thrwbl) {
            ;
        }
        try {
            if((_$arguments.length) != (1)) {
                return LogAspect.<T>proceed(_$object, _$methodName, _$arguments, new Class[]{Number.class});
            }
            if(!((_$arguments[0] instanceof int))) {
                return LogAspect.<T>proceed(_$object, _$methodName, _$arguments, new Class[]{Number.class});
            }
        }
        catch (RuntimeException unchecked) {
            throw unchecked;
        }
        catch (Throwable thrwbl) {
            ;
        }
        int s = ((int)_$arguments[_$argumentIndex[0]]);
        try {
            if(!((s) > (6))) {
                return LogAspect.<T>proceed(_$object, _$methodName, _$arguments, new Class[]{Number.class});
            }
        }
        catch (RuntimeException unchecked) {
            throw unchecked;
        }
        catch (Throwable thrwbl) {
            ;
        }
        try {
            return LogAspect.<T>proceed(_$object, _$methodName, _$arguments, new Class[]{Number.class});
        }
        catch (RuntimeException unchecked) {
            throw unchecked;
        }
        catch (Throwable thrwbl) {
            ;
        }finally {
            Logger.instance().log(("I'm after a method invocation with parameter ") + (s));
        }
        throw new Error();
    }

}