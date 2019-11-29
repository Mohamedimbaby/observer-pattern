package com.imbocraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class MainClass {
    List<observerable> observers = new ArrayList<>();
    int data ;


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
        NotifyAllSubscribers();
    }

    private void NotifyAllSubscribers() {
        for (observerable observer : observers) {
            observer.update();
        }
    }

    void subscribe (observerable member)
    {
        observers.add(member);
    }

}
