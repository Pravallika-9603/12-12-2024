package com.neoteric.java.jpa.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Department {

        private String dname;
        private int did;
        private Employee employee;
        @Autowired
        public  Department(String dname,int did,Employee employee){
            this.dname=dname;
            this.did=did;
            this.employee=employee;
        }

        @Override
        public String toString() {
            return "Department{" +
                    "dname='" + dname + '\'' +
                    ", did=" + did +
                    ", employee=" + employee +
                    '}';
        }

        public String getDname() {
            return dname;
        }

        public void setDname(String dname) {
            this.dname = dname;
        }

        public int getDid() {
            return did;
        }

        public void setDid(int did) {
            this.did = did;
        }

        public Employee getEmployee() {
            return employee;
        }

        public void setEmployee(Employee employee) {
            this.employee = employee;
}
    }

