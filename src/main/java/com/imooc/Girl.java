package com.imooc;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;

/**
 * Created by lehman on 17/11/2.
 */
@Entity
public class Girl {

    @Id
    @GeneratedValue
    private Integer id;
    private int age;
    private String cupSize;

    public Girl() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }
}
