package com.filip.custom.swagger.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.filip.custom.swagger.models.Product;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "helloworld")
@Controller
@RequestMapping("/")
public class SampleController {

	@ApiOperation(
			value = "Get hello response", 
			notes = "Service greets with hello", 
			httpMethod = "GET",
			response = String.class)
	@ResponseBody
	@RequestMapping(value = "/hello/", method = RequestMethod.GET)
	public String hello() {
		return "Hello, client!";
	}
	
	@ApiOperation(
			value = "View a list of available products",
			response = Product.class,
			responseContainer = "List")
    @RequestMapping(value = "/products", method= RequestMethod.GET, produces = "application/json")
    public Iterable<Product> getAllProducts() {
        return null;
    }
	
	@ApiOperation(value = "Search a product with an ID",response = Product.class)
    @RequestMapping(value = "/show/{id}", method= RequestMethod.GET, produces = "application/json")
    public Product showProduct(@PathVariable Integer id) {
        return null;
    }
}
