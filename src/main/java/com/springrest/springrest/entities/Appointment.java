package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Appointment {
    @Id
    private String id;
    private String date;
    private String time;
    private String customer_name;
    private String phone_number;

    public Appointment(){}


    public Appointment(String id, String date, String time, String customer_name, String phone_number) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.customer_name = customer_name;
        this.phone_number = phone_number;
    }

    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", customer_name='" + customer_name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}
