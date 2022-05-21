package com.example.employee.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    public int id;
    public String name;
    public String email;
    private String job;
    private String phone;
    @Column(nullable = false,updatable = false)
    private String employeeCode;
    public employee(){

    }
    public employee(String name,String email,String job,String phone){
        this.name=name;
        this.email=email;
        this.job=job;
        this.phone=phone;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public  void  setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public  void setEmail(String email){
        this.email=email;
    }
    public String getJob(){
        return job;
    }
    public  void setJob(String job){
        this.job=job;
    }
    public String getPhone(){
        return phone;
    }
    public  void setPhone(String phone){
        this.phone=phone;
    }
    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                " name=" + name + " " +
        " email=" + email + " " + " job=" + job + " " + "phone=" + phone +
        '}';
    }

}
