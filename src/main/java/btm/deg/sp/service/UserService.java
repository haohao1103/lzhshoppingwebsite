package btm.deg.sp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletResponse;
import btm.deg.sp.dto.Result;
import btm.deg.sp.entity.User;

public interface UserService extends IService<User> {

    Result login(User user, HttpServletResponse response);
    Result register(User user);

    Result getUsers();
}
