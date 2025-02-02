package com.neoteric.java.jpa.onetoone;

import jakarta.persistence.*;

//@Entity
@Table(name = "Address")
public class Address {



        @Id//primary key
        @GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
        private int id;

        @Column(name = "city")
        private String city;
        @Column(name = "state")
        private String state;


        public void setPersonEntity1(Person person) {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }


}

