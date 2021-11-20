package com.study.pojo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @ClassName: Car
 * @Description:
 * @date: 2021/11/20
 * @author zhb
 */
@XmlRootElement(name = "Car")
public class Car {
    private Integer id;
    private String name;
    private Double price;

    public Car() {
    }

    public Car(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", price=" + price +
            '}';
    }
}
