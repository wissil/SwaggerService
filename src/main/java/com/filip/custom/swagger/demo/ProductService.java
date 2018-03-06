package com.filip.custom.swagger.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.filip.custom.swagger.models.Product;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@Controller
@Api(value = "Product Service")
public interface ProductService {

	@RequestMapping(value = "/show/{id}", method = RequestMethod.GET, produces = "application/json")
	@ApiOperation(
			value = "Gets product with the given ID", 
			httpMethod = "GET",
			response = Product.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Product retrieved"),
			@ApiResponse(code = 400, message = "Invalid ID supplied"),
		    @ApiResponse(code = 404, message = "Product not found") })
	public Product getProduct(
			@ApiParam(value = "ID of the product being fetched", required = true) int id);
}
