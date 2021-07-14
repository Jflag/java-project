package com.jjq.list_;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class List_ {
    public static void main(String[] args) {
        Dog d1 = new Dog("小黄");
        Dog d2 = new Dog("小黑");
        System.out.println(d1.equals(d2));
        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());
    }
}

class Dog{
    private String name;

    Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
