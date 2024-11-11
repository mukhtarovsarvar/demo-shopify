package org.example.demoshopify.dto.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author 'Mukhtarov Sarvarbek' on 11/11/2024
 * @project demo-shopify
 * @contact @sarvargo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private long id;

    private String title;

    @JsonProperty("body_html")
    private String bodyHtml;

    private String vendor;

    @JsonProperty("product_type")
    private String productType;

    @JsonProperty("created_at")
    private Date createdAt;

    private String handle;

    @JsonProperty("updated_at")
    private Date updatedAt;

    @JsonProperty("published_at")
    private Date publishedAt;

    @JsonProperty("template_suffix")
    private String templateSuffix;

    @JsonProperty("published_scope")
    private String publishedScope;

    private String tags;

    private String status;

    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;

    private List<ProductVariant> variants;

    private List<ProductOption> options;

    private List<ProductImage> images;

    private ProductImage image;
}
