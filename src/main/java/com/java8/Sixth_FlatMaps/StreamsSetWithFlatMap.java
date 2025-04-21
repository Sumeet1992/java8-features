package com.java8.Sixth_FlatMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsSetWithFlatMap {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setName("Sumeet");
        emp1.addDevices("lenovo windows 10");
        emp1.addDevices("Samsung9");
        emp1.addDevices("iPhone9");
        emp1.addDevices("macbook air");

        Employee emp2 = new Employee();
        emp2.setName("Sum");
        emp2.addDevices("lenovo windows 10");
        emp2.addDevices("Samsung10");
        emp2.addDevices("iPhone9");
        emp2.addDevices("macbook air lite");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);

//        Suppose we want to print all the distinct devices

        List<String> deviceList = employeeList
                .stream()
                .map(x -> x.getDevices())
                .flatMap(x -> x.stream())
                .distinct()
                .toList();

        deviceList.forEach(System.out::println);

    }

}
