package com.michaelakamihe.ecommercebackend.model;




import com.michaelakamihe.ecommercebackend.model.cart.CartItem;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="hoa_don")
public class Hoadon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="ngaydat")
    private Date ngayDat =new Date();
    @Column(name="ngaynhan")
    private Date ngayNhan;
    @Column(name="dongia")
    private Long donGia;
    @OneToMany(fetch = FetchType.LAZY)
    private List<CartItem> cartItems ;

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDonGia() {
        return donGia;
    }

    public void setDonGia(Long donGia) {
        this.donGia = donGia;
    }

//    public Long getId_product() {
//        return id_product;
//    }
//
//    public void setId_product(Long id_product) {
//        this.id_product = id_product;
//    }
//
//    public Long getId_user() {
//        return id_user;
//    }
//
//    public void setId_user(Long id_user) {
//        this.id_user = id_user;
//    }

    public Date getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }

    public Date getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(Date ngayNhan) {
        this.ngayNhan = ngayNhan;
    }
}
