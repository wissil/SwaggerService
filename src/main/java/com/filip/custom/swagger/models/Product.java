package com.filip.custom.swagger.models;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Sample Product")
public class Product {

	@ApiModelProperty(notes = "The auto-generated version of the product")
    private Integer version;
	
    @ApiModelProperty(notes = "The application-specific product ID")
    private String productId;
    
    @ApiModelProperty(notes = "The product description")
    private String description;
    
    @ApiModelProperty(notes = "The image URL of the product")
    private String imageUrl;
    
    @ApiModelProperty(notes = "The price of the product", required = true)
    private BigDecimal price;

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
