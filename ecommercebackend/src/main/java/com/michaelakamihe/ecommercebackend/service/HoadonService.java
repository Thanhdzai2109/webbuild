package com.michaelakamihe.ecommercebackend.service;

import com.michaelakamihe.ecommercebackend.model.Hoadon;
import com.michaelakamihe.ecommercebackend.repo.Hoadonreponsitory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoadonService {
    private  Hoadonreponsitory repo;

    public HoadonService(Hoadonreponsitory repo) {
        this.repo = repo;
    }
    public List<Hoadon> getProducts () {
        return (List<Hoadon>) repo.findAll();
    }
    public Hoadon ThanhToan(Hoadon hoadon){
        return repo.save(hoadon);
    }

}
