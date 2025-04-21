package com.java8.Sixth_FlatMaps;

import java.util.HashSet;
import java.util.Set;

public class Employee {

    private String name;
    private Set<String> devices;

    public void addDevices(String deviceName){
        if(this.devices == null){
            devices = new HashSet<>();
        }
        devices.add(deviceName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getDevices() {
        return devices;
    }

    public void setDevices(Set<String> devices) {
        this.devices = devices;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", devices=" + devices +
                '}';
    }
}
