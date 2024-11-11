package org.example.demoshopify.dto.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * @author 'Mukhtarov Sarvarbek' on 11/11/2024
 * @project demo-shopify
 * @contact @sarvargo
 */
@Getter
@Setter
public class ProductVariant {
    private long id;
    @JsonProperty("product_id")
    private long productId;

    private String title;

    private String price;

    private int position;

    @JsonProperty("inventory_policy")
    private String inventoryPolicy;

    @JsonProperty("compare_at_price")
    private Double compareAtPrice;

    private String option1;

    private String option2;

    private String option3;

    @JsonProperty("created_at")
    private Date createdAt;

    @JsonProperty("updated_at")
    private Date updatedAt;

    private boolean taxable;

    private String barcode;

    @JsonProperty("fulfillment_service")
    private String fulfillmentService;

    private int grams;

    @JsonProperty("inventory_management")
    private String inventoryManagement;

    @JsonProperty("requires_shipping")
    private boolean requiresShipping;

    private String sku;

    private double weight;

    @JsonProperty("weight_unit")
    private String weightUnit;

    @JsonProperty("inventory_item_id")
    private long inventoryItemId;

    @JsonProperty("inventory_quantity")
    private int inventoryQuantity;

    @JsonProperty("old_inventory_quantity")
    private int oldInventoryQuantity;

    @JsonProperty("presentment_prices")
    private List<PresentmentPrice> presentmentPrices;

    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;

    @JsonProperty("image_id")
    private long imageId;
}
