package app.web;

import app.model.binding.ProductDto;
import app.model.entity.ProductEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    @PostMapping
    public ResponseEntity<ProductEntity> orders(@Valid @RequestBody ProductDto productDto) {
        //TODO
        return null;
    }
}
