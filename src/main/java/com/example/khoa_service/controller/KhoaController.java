package com.example.khoa_service.controller;


import com.example.khoa_service.entity.Khoa;
import com.example.khoa_service.service.KhoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/khoa")
public class KhoaController {
    @Autowired
    private KhoaService khoaService;

    @PostMapping("/")
    public Khoa saveKhoa(@RequestBody Khoa khoa){
        return khoaService.saveKhoa(khoa);
    }

    @GetMapping("/{id}")
    public Khoa findKhoaById(@PathVariable("id") Long khoaId){
        return khoaService.findKhoaById(khoaId);
    }

    @GetMapping("/")
    public String helloWorld(){
        return "Hello Nguyen Van Hung!";
    }
}
