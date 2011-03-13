package logger;

import java.lang.*;
import hrm.*;

public class Main extends java.lang.Object {
    private String test = Person.someStaticString();

    public void v() {
        Person p = new Person("Jan", "Student", 21);
        LogAspect.instance().<java.lang.Integer>advice_opdcmeic_ckzdqxch(p, "doFoo", new Object[]{5}, new int[]{0}, this);
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.v();
    }

}