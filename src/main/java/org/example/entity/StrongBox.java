package org.example.entity;

public class StrongBox<T> {
    private T item;
    private long counter;
    private Key keytype;

    public StrongBox(Key keytype) {
        this.keytype = keytype;
        switch (keytype){
            case PADLOCK: counter = 1024;
            case BUTTON: counter = 10000;
            case FINGER: counter = 30000;
        }
    }

    public void put(T item){
        this.item = item;
    }

    public T get(){
        if(counter <= 0){
            return this.item;
        }
        counter--;
        return null;
    }
}
