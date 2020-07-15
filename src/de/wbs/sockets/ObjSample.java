package de.wbs.sockets;

import java.io.Serializable;

public class ObjSample implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name = "Max Muster";
    private int alter = 33;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}
