package hrm;

import java.lang.*;

public class Team extends java.lang.Object {
    private String namee;

     public Team(String name) {
        setName(name);
    }

    public String getName() {
        return namee;
    }

    public void setName(String name) {
        this.namee = name;
    }

}