package service.impl;

import repository.IProductRepositoryPhone;
import repository.impl.ProductRepository;
import service.IProduct;

public class ProductService implements IProduct {
    IProductRepositoryPhone iProductRepository = new ProductRepository();

}
