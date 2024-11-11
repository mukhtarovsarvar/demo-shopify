package org.example.demoshopify.dto.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author 'Mukhtarov Sarvarbek' on 11/11/2024
 * @project demo-shopify
 * @contact @sarvargo
 */
@Data
public class ProductImage {
    private long id;

    private String alt;

    private int position;

    @JsonProperty("product_id")
    private long product_id;

    @JsonProperty("created_at")
    private Date created_at;

    @JsonProperty("updated_at")
    private Date updatedAt;

    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;

    private int width;

    private int height;

    private String src;

    @JsonProperty("variant_ids")
    private List<Integer> variantIds;
}
