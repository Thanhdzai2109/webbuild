package com.michaelakamihe.ecommercebackend.controller;

import com.michaelakamihe.ecommercebackend.model.Hoadon;
import com.michaelakamihe.ecommercebackend.service.HoadonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class HoaDonController {
    @Autowired
    HoadonService hoadonService;
    @PostMapping("/Thanhtoan")
    public ResponseEntity<Hoadon>CreateHoaDon(@RequestBody Hoadon hoadon){
        return new ResponseEntity<>(hoadonService.ThanhToan(hoadon), HttpStatus.OK);
    }
}
