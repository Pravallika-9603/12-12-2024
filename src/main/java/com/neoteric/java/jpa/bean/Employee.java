package com.neoteric.java.jpa.bean;

public class Employee {

        private String name;
        private int id;
        private String state;

        public Employee(String name, int id, String state) {
            this.name = name;
            this.id = id;
            this.state = state;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    ", state='" + state + '\'' +
                    '}';
        }
    }

