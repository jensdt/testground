package ;

import java.lang.*;

public class Test extends java.lang.Object {
    public String a() {
        return "a";
    }

    public String b() {
        return "b";
    }

    public String c() {
        return "c";
    }

    public void d(String a, String b, String c) {
        System.out.println(((a) + (b)) + (c));
    }

}