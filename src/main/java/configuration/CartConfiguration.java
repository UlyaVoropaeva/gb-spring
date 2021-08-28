package configuration;

import component.Cart;
import component.Shop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rapository.ProductRepository;

import javax.inject.Provider;

@Configuration
public class CartConfiguration {
    @Bean
    public ProductRepository productRepository() {
        return new ProductRepository();
    }

    @Bean
    public Cart cart(ProductRepository productRepository) {
        return new Cart(productRepository);
    }

    @Bean
    public Shop shop(Provider<Cart> cartProvider) {
        return new Shop(cartProvider);
    }

}
