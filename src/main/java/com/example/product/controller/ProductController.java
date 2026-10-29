package com.example.product.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;

import com.example.product.dto.ProductRequest;
import com.example.product.dto.ProductRequest;
import com.example.product.dto.ProductResponse;
import com.example.product.entity.Product;
import com.example.product.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    
    private ProductResponse toResponse(Product product) {
        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getDescription()
        );
    }

    private Product toEntity(ProductRequest request) {
        Product product = new Product();
        product.setName(request.getName());
        product.setPrice(request.getPrice());
        product.setDescription(request.getDescription());
        return product;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Create a product")
    @ApiResponses({
        @ApiResponse(responseCode = "201",
                     description = "Product created"),
        @ApiResponse(responseCode = "400",
                     description = "Invalid request")
    })
    public ProductResponse createProduct( @Valid @RequestBody ProductRequest request) {
    	 Product saved = productService.createProduct(toEntity(request));
         return toResponse(saved);
    }

    @GetMapping
    @Operation(summary = "Get all products")
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts()
                .stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }

    //@GetMapping("/{id}")
    @GetMapping("/{id}")
    @Operation(
        summary = "Get product by ID",
        description = "Returns product details for the given ID"
    )
    @ApiResponses({
        @ApiResponse(
            responseCode = "200",
            description = "Product found"
        ),
        @ApiResponse(
            responseCode = "404",
            description = "Product not found"
        )
    })
    public ProductResponse  getProductById(@PathVariable Long id) {
    	return toResponse(productService.getProductById(id));
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update a product")
    @ApiResponses({
        @ApiResponse(responseCode = "200",
                     description = "Product updated"),
        @ApiResponse(responseCode = "400",
                     description = "Invalid request"),
        @ApiResponse(responseCode = "404",
                     description = "Product not found")
    })
    public ProductResponse  updateProduct(
            @PathVariable Long id,
            @Valid @RequestBody ProductRequest request) {
    	Product updated = productService.updateProduct(
                id, toEntity(request));

        return toResponse(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a product")
    @ApiResponses({
        @ApiResponse(responseCode = "204",
                     description = "Product deleted"),
        @ApiResponse(responseCode = "404",
                     description = "Product not found")
    })
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}
