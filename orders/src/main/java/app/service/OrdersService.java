package app.service;

import app.model.binding.ProductDto;
import app.model.entity.ProductEntity;



public interface OrdersService {

    ProductEntity orders(ProductDto productDto);
}
