import com.example.dao.UserMapper;
import com.example.pojo.User;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @Description:
 * @author: ZPX
 * @createDate: 2020/3/3 0:34
 * @version: 1.0
 */
public class test {
    @Resource
    private UserMapper userMapper;
    @Test
    public void myTest(){
        User user=new User();
        user.setAge(1);
        user.setId(1);
        user.setName("张三");
        userMapper.insert(user);
    }
}




