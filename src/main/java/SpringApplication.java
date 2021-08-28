import component.Cart;
import configuration.ApplicationConfiguration;
import configuration.ShopConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rapository.ProductRepository;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Cart cart = context.getBean(Cart.class);
        System.out.println(cart);
        ProductRepository productRepository = context.getBean(ProductRepository.class);
        System.out.println(productRepository);
        ShopConfiguration shop = context.getBean(ShopConfiguration.class);
        shop.start();


    }
}
