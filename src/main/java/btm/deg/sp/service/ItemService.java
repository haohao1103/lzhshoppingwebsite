package btm.deg.sp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import btm.deg.sp.dto.Result;
import btm.deg.sp.entity.Item;

public interface ItemService extends IService<Item> {

    public Result getAllItem();

    Result insertItem(Item item);

    Result deleteItem(long id);

    Result modifyItem(Item item);

    Result getItem(String name);
}
