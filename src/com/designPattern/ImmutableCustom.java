package com.designPattern;


import netscape.javascript.JSObject;

import java.util.ArrayList;
import java.util.List;

class Alien implements Cloneable{
    private String name;
    private String loc;

    public Alien(String name, String loc) {
        this.name = name;
        this.loc = loc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Alien{" +
                "name='" + name + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}

final public class ImmutableCustom implements Cloneable {

    private final String name;
    private final int id;
    private final List<String> list;
    private  Alien alien;

    public ImmutableCustom(String name, int id, List<String> list, Alien alien) {
        this.name = name;
        this.id = id;
        this.list = list;
        this.alien = alien;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Object clone() throws CloneNotSupportedException {

        ImmutableCustom immutableCustom = (ImmutableCustom) super.clone();
        immutableCustom.alien = (Alien) alien.clone();

      return immutableCustom;
    }

//
    public Alien getAlien() throws CloneNotSupportedException {
        return (Alien) alien.clone();
    }

    public List<String> getList() {
        return new ArrayList<>(list);
    }


    @Override
    public String toString() {
        return "ImmutableCustom{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", list=" + list +
                ", alien=" + alien +
                '}';
    }




    public static void main(String[] args) throws CloneNotSupportedException {
        Alien alien = new Alien("Dev","Pune");
        ImmutableCustom immutableCustom = new ImmutableCustom("Ani",2,List.of("A","B","C"),alien);
        ImmutableCustom immutableCustom2 = null;

        try{
            immutableCustom2 = (ImmutableCustom) immutableCustom.clone(); //deepcopy
        }catch (CloneNotSupportedException c){
            c.printStackTrace();
        }

        //System.out.println(immutableCustom.toString());

        immutableCustom.getList().add("D");
        immutableCustom2.getList().add("D");
        immutableCustom2.alien.setLoc("Kolkata");
        System.out.println(immutableCustom);
        System.out.println(immutableCustom2);
        //System.out.println(immutableCustom+"  "+immutableCustom2);

    }
}
