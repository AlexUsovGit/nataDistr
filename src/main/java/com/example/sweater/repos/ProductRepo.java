package com.example.sweater.repos;


import com.example.sweater.domain.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepo extends CrudRepository<Product, Integer> {

    List<Product> findAllByOrderByIdAsc();
    List<Product> findByBarcodeOrderByIdAsc(String barcode);

    List<Product> findByIdOrderByIdAsc(Long id);
    List<Product> findByisDistrib(Integer id);
}
