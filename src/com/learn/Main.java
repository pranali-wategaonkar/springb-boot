package com.learn;


public class Main {
    public static void main(String[] args) {
        com.learn.Data data = new Data("name","add");
    }
}


record Data(String name, String address)