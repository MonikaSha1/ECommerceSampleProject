package com.example.productservice.dtos;

import com.example.productservice.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    public Long id;
    private String title;
    private long price;
    private String category;
    private String description;
    private String image;
}
