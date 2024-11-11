package org.example.demoshopify.dto.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author 'Mukhtarov Sarvarbek' on 11/11/2024
 * @project demo-shopify
 * @contact @sarvargo
 */
@Data
public class PresentmentPrice {

    private Price price;

    @JsonProperty("compare_at_price")
    private Double compareAtPrice;
}
