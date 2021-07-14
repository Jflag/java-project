package com.jjq.collection_;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("李六");
        Iterator i = list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("hello");
        System.out.println("hello222");
        System.out.println("master test");
        System.out.println("hot-fix test");
        System.out.println("push test");
    }
}
