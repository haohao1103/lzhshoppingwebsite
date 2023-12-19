package btm.deg.sp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import btm.deg.sp.dto.Result;
import btm.deg.sp.entity.Cart;

public interface CartService extends IService<Cart> {
    Result addCart(Long userId, Long itemId);

    Result getCart(Long userId);

    Result deleteCart(Long userId, Long itemId);

    Result getViewReport();
}
