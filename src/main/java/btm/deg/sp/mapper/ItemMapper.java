package btm.deg.sp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import btm.deg.sp.entity.Item;

import java.util.List;

@Mapper
public interface ItemMapper extends BaseMapper<Item> {
    List<Item> selectAll();
    List<Item> selectByName(String itemName);
}
