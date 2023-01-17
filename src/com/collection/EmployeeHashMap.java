package com.collection;

import java.util.Objects;

public class EmployeeHashMap {

    private int id ;
    private String name;
    private String address;

    public EmployeeHashMap(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        EmployeeHashMap that = (EmployeeHashMap) o;
//        return id == that.id && Objects.equals(name, that.name) && Objects.equals(address, that.address);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, address);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeHashMap that = (EmployeeHashMap) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }

    @Override
    public String toString() {
        return "EmployeeHashMap{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
