package app.service.Impl;

import app.model.binding.ProductDto;
import app.model.entity.ProductEntity;
import app.repository.OrdersRepository;
import app.service.OrdersService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl implements OrdersService {
    private final OrdersRepository ordersRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public OrdersServiceImpl(OrdersRepository ordersRepository, ModelMapper modelMapper) {
        this.ordersRepository = ordersRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public ProductEntity orders(ProductDto productDto) {
        //TODO
        return null;
    }
}
