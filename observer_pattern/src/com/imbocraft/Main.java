package com.imbocraft;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MainClass object = new MainClass();
        object.subscribe(new member1());
        object.subscribe(new member2());
        object.setData(3);
    }
}
