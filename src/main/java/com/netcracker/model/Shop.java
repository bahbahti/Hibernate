package com.netcracker.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "shop")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shop_id")
    private int id;

    @Column(name = "shop_name", nullable = false)
    private String shopName;
    @Column(name = "area", nullable = false)
    private String area;
    @Column(name = "comissions", nullable = false)
    private int comissions;

  /*  @OneToMany(mappedBy = "shop", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Purchase> purchases;*/

    public Shop(String shopName, String area, int comissions) {
        this.shopName = shopName;
        this.area = area;
        this.comissions = comissions;
    }

    public Shop() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getComissions() {
        return comissions;
    }

    public void setComissions(int comissions) {
        this.comissions = comissions;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", shopName='" + shopName + '\'' +
                ", area='" + area + '\'' +
                ", comissions=" + comissions +
                '}';
    }
}
