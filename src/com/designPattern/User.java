package com.designPattern;


import java.util.Optional;

public class User {

        //All final attributes
        private final String firstName; // required
        private final String lastName; // required
        private final int age; // pl.piomin.java.samples.optional
        private final String phone; // pl.piomin.java.samples.optional
        private final String address; // pl.piomin.java.samples.optional

        private User(UserBuilder builder) {
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.age = builder.age;
            this.phone = builder.phone;
            this.address = builder.address;
        }

        //All getter, and NO setter to provde immutability
        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public int getAge() {
            return age;
        }
        public String getPhone() {
            return phone;
        }
        public String getAddress() {
            return address;
        }

        public static UserBuilder builder(){
            return  new UserBuilder();
        }

        @Override
        public String toString() {
            return "User: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phone+", "+this.address;
        }

        public static class UserBuilder
        {
            private  String firstName;
            private  String lastName;
            private int age;
            private String phone;
            private String address;


            public UserBuilder firstName(String firstName){
                this.firstName = firstName;
                return this;
            }

            public UserBuilder lastName(String lastName){
                this.lastName = lastName;
                return this;
            }
            public UserBuilder age(int age) {
                this.age = age;
                return this;
            }
            public UserBuilder phone(String phone) {
                this.phone = phone;
                return this;
            }
            public UserBuilder address(String address) {
                this.address = address;
                return this;
            }
            //Return the finally consrcuted User object
            public User build() {
                User user =  new User(this);
                validateUserObject(user);
                return user;
            }
            private void validateUserObject(User user) {
                //Do some basic validations to check
                //if user object does not break any assumption of system
            }
        }

    public static void main(String[] args) {


        User user1 =  User.builder().firstName("Lokesh").lastName("Gupta")
                .age(30)
                .phone("1234567")
                .address("Fake address 1234")
                .build();

        System.out.println(user1);

        /*User user2 = new User.UserBuilder("Jack", "Reacher")
                .age(40)
                .phone("5655")
                //no address
                .build();

        System.out.println(user2);*/

        User user3 =  User.builder().lastName("Super").firstName("Man")
                //No age
                //No phone
                //no address
                .build();

        System.out.println(user3);
    }
    }

