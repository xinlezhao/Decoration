package com.xinle.kotlin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Person {

    private final String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();


        list.add(new Person("hello"));
        list.add(new Person("welcome"));
        list.add(new Person("world"));
        list.add(new Person("world"));
        list.add(new Person("world"));

        Map<String, List<Person>> map = list.stream().collect(Collectors.groupingBy(item -> item.name));
    }


}
