package model;

import static javax.management.Query.value;


public class KeyValue {
    int key;
    String value;
    
    @Override
    public String toString() {
        return value;
    }

    public KeyValue(int key, String Value) {
        this.key = key;
        this.value = Value;
    }

    public KeyValue(String Value) {
        this.key = 0;
        this.value = Value;
    }

    public KeyValue() {
        key = 0;
        value = "";
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String Value) {
        this.value = Value;
    }
    
    
    
    
}
