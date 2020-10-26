package com.ll.jiegouxing.guolvqi;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/10/26 0026 上午 10:35
 */
public class Person
{
    public String name;
    public String sex;
    public String marrierStatus;

    public Person(String name, String sex, String marrierStatus) {
        this.name = name;
        this.sex = sex;
        this.marrierStatus = marrierStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMarrierStatus() {
        return marrierStatus;
    }

    public void setMarrierStatus(String marrierStatus) {
        this.marrierStatus = marrierStatus;
    }
}
