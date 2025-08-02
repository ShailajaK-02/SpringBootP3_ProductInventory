package com.inventory.repository;

import com.inventory.entity.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductDetails,Integer>
{
}
