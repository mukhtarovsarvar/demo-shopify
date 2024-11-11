package org.example.demoshopify.dto.product;

import lombok.Data;

import java.util.List;

/**
 * @author 'Mukhtarov Sarvarbek' on 11/11/2024
 * @project demo-shopify
 * @contact @sarvargo
 */
@Data
public class Products {
    private List<ProductDTO> products;
}
