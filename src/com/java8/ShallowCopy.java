package com.java8;

class Dept implements Cloneable {

    public String dept_name;
    public int dept_id;

    public Dept(String dept_name, int dept_id) {
        this.dept_name = dept_name;
        this.dept_id = dept_id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dept_name='" + dept_name + '\'' +
                ", dept_id=" + dept_id +
                '}';
    }
}

class Student1 implements Cloneable {

    int id;
    String name;
    Dept dept;


    public Student1(int id, String name, Dept dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student1 stu = (Student1) super.clone();
        stu.dept = (Dept) dept.clone();
        return stu;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name=" + name +
                ", dept=" + dept +
                '}';
    }
}

public class ShallowCopy {

    public static void main(String[] args) {
        Dept dept = new Dept("Civil", 1011);
        Student1 student1 = new Student1(1, "John", dept);
        Student1 student2 = null;

        try {
            student2 = (Student1) student1.clone(); //shallowcopt means both the objects will refer to the same memory ref
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        student2.dept.dept_name = "CSE";
        System.out.println(student1 + "--------" + student2);


    }
}
