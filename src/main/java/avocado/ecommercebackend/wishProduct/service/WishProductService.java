package avocado.ecommercebackend.wishProduct.service;

import avocado.ecommercebackend.wishProduct.dto.WishProductDto;
import avocado.ecommercebackend.wishProduct.model.WishProduct;

import java.util.List;

public interface WishProductService {
    WishProduct addProduct(WishProductDto wishProductDto);
    List<WishProduct> getWishList(Long id);
}
