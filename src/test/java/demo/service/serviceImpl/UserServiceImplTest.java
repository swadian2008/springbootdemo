package demo.service.serviceImpl;


import demo.entity.User;
import demo.service.UserService;
import demo.utils.LogUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Test
    public void selectUserInfo() {
        User user = new User();
        List<User> users = userService.selectUserInfo(user);
        LogUtils.info("查询数据：",users);
    }

    @Test
    public void insertUserInfo() {
        for(int i =0;i<10;i++){
            User user = new User();
            String str = UUID.randomUUID().toString();
            String replaceStr = str.replace("-", "");
            user.setUserId(replaceStr);
            user.setUserName("userName"+i);
            user.setUserAge(18+i);
            user.setUserSex("1");
            String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            user.setCreateTime(format);
            user.setUpdateTime(format);
            userService.insertUserInfo(user);
            LogUtils.info("+++新增成功=====");
        }
    }

    @Test
    public void updateUserInfo() {
        User user = new User();
        user.setUserName("userNameq");
        user.setUserId("4068530c29e64bae870d865bece86b9e");
        int i = userService.updateUserInfo(user);
        LogUtils.info("+++修改成功=====");
    }

    @Test
    public void deleteUserInfoById() {
        User user = new User();
        user.setUserId("4068530c29e64bae870d865bece86b9e");
        int i = userService.deleteUserInfoById(user.getUserId());
        LogUtils.info("+++删除成功=====");
    }


}
