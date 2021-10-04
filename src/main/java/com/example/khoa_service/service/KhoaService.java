package com.example.khoa_service.service;

import com.example.khoa_service.entity.Khoa;
import com.example.khoa_service.repository.KhoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KhoaService {

    @Autowired
    private KhoaRepository khoaRepository;

    public Khoa saveKhoa(Khoa khoa) {
        return khoaRepository.save(khoa);
    }

    public Khoa findKhoaById(Long khoaId) {
        return khoaRepository.findById(khoaId).get();
    }
}
