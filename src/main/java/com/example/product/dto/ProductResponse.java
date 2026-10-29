package com.example.product.dto;

import java.math.BigDecimal;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Product details returned by the API")
public class ProductResponse {
	@Schema(description = "Unique product ID", example = "1")
	private Long id;
    
	@Schema(description = "Product name", example = "Samsung Mobile")
	private String name;
   
	@Schema(description = "Product price", example = "25000.00")
	private BigDecimal price;
	
	@Schema(description = "Product description",
            example = "Samsung smartphone")
    private String description;

    public ProductResponse() {
    }

    public ProductResponse(Long id, String name,
                           BigDecimal price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
