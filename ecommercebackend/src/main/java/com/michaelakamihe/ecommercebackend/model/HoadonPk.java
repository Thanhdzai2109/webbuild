package com.michaelakamihe.ecommercebackend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.michaelakamihe.ecommercebackend.model.cart.CartItem;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class HoadonPk {
    @JsonBackReference
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    private CartItem cartItem;

    public HoadonPk () {

    }

    public HoadonPk(CartItem cartItem) {
        this.cartItem=cartItem;
    }

    public CartItem getCartItem() {
        return cartItem;
    }

    public void setCartItem(CartItem cartItem) {
        this.cartItem = cartItem;
    }
}
