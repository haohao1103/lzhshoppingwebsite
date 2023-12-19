package btm.deg.sp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import btm.deg.sp.dto.Result;
import btm.deg.sp.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping()
    public Result newOrder(@CookieValue("user") Long userId){
        return orderService.newOrder(userId);
    }

    @GetMapping("/{id}")
    public Result finishOrder(@PathVariable Long id){
        return orderService.finishOrder(id);
    }

    @GetMapping("/all")
    public Result getReport(){
        return orderService.getReport();
    }

    @GetMapping("/allOrder")
    public Result getAllOrder(){
        return orderService.getAllOrder();
    }
}
