package btm.deg.sp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import btm.deg.sp.dto.Result;
import btm.deg.sp.entity.Order;

public interface OrderService extends IService<Order> {
    Result newOrder(Long userId);

    Result finishOrder(Long id);

    Result getReport();

    Result getAllOrder();
}
