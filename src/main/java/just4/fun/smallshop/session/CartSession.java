package just4.fun.smallshop.session;

import just4.fun.smallshop.dto.CartDto;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CartSession {

    void addToCart(Long productId);

    void removeFromCart(Long productId);

    void cleanCart();

    CartDto getCart();

    List<Long> getProductIds();

}
