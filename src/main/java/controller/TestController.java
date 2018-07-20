package controller;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

/**
 * Created by jiangchuan.deng on 2018/7/14.
 */
@RestController
public class TestController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String test() {
        return "hello world.";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUserByName(@RequestParam("name") String name) {
        User user = this.userService.find(name);
        return user == null ? "No such user!" : user.toString();
    }
}
