package com.collections;

public class Employee implements Comparable<Employee>{
    String name;
    int age;

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.age - o.age;
    }
}
