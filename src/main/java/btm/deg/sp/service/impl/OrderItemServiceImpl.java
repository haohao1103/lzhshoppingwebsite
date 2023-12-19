package btm.deg.sp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import btm.deg.sp.entity.OrderItem;
import btm.deg.sp.mapper.OrderItemMapper;
import btm.deg.sp.service.OrderItemService;

@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {
}
