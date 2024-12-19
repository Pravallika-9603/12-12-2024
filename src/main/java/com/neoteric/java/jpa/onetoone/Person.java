package com.neoteric.java.jpa.onetoone;

import jakarta.persistence.*;
import lombok.Data;

//@Entity
@Table(name = "person")
@Data
public class Person {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private int pid;


        @Column(name = "name")
        private String name;

        @OneToOne
        private Address addressenity;

        public int getPid() {
            return pid;
        }

        public void setPid(int pid) {
            this.pid = pid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    public Address getAddressenity() {
        return addressenity;
    }

    public void setAddressenity(Address addressenity) {
        this.addressenity = addressenity;
    }
}


