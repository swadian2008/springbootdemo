package demo.cotroller;

import demo.entity.User;
import demo.service.UserService;
import demo.utils.LogUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @author Administrator
 * @date 2019/7/6/006 20:25
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * @RestController注解，相当于@Controller+@ResponseBody两个注解的结合,
     * 返回json数据不需要在方法前面加@ResponseBody注解
     * 但使用@RestController这个注解，就不能返回jsp,html页面，视图解析器无法解析jsp,html页面
     */

    @Autowired
    private UserService userService;

    /**
     * 查询
     * @param user
     * @return
     */
    @RequestMapping("/selectUserInfo")
    public Object selectUserInfo(User user){
        return userService.selectUserInfo(user);
    }

    /**
     * 增加
     * @param user
     * @return
     */
    @RequestMapping("/insertUserInfo")
    public Object insertUserInfo(User user){
        return userService.insertUserInfo(user);
    }

    /**
     * 修改
     * @param user
     * @return
     */
    @RequestMapping("/updateUserInfo")
    public Object updateUserInfo(User user){
        return userService.updateUserInfo(user);
    }

    /**
     * 删除
     * @param userId
     * @return
     */
    @RequestMapping("/deleteUserInfoById")
    public Object deleteUserInfoById(String userId){
        return userService.deleteUserInfoById(userId);
    }

    public static void main(String[] args) {
        String str = UUID.randomUUID().toString();
        String replace = str.replace("-", "");
        System.out.println(replace);
    }
}
