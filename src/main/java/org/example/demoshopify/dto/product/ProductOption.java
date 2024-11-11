package org.example.demoshopify.dto.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author 'Mukhtarov Sarvarbek' on 11/11/2024
 * @project demo-shopify
 * @contact @sarvargo
 */
@Getter
@Setter
public class ProductOption {
    private long id;

    @JsonProperty("product_id")
    private long productId;

    private String name;

    private int position;

    private List<String> values;
}
