package com.ohgiraffers.section01.xmlconfig;

public class MenuDTO {

    private int code;
    private String name;
    private int price;
    private int categoryCode;
    private String orderalbeStatus;

    public MenuDTO() {
    }

    public MenuDTO(int code, String name, int price, int categoryCode, String orderalbeStatus) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.categoryCode = categoryCode;
        this.orderalbeStatus = orderalbeStatus;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getOrderalbeStatus() {
        return orderalbeStatus;
    }

    public void setOrderalbeStatus(String orderalbeStatus) {
        this.orderalbeStatus = orderalbeStatus;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", categoryCode=" + categoryCode +
                ", orderalbeStatus='" + orderalbeStatus + '\'' +
                '}';
    }
}
