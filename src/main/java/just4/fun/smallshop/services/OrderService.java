package just4.fun.smallshop.services;

import just4.fun.smallshop.dto.OrderDto;
import just4.fun.smallshop.model.order.Order;
import zinjvi.service.Service;

public interface OrderService extends Service<Order, Long> {

    void order(OrderDto orderDto);

}
