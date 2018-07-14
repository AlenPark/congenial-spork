package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiangchuan.deng on 2018/7/14.
 */
@RestController
public class TestController {

    @RequestMapping("/")
    public String test() {
        return "hello world.";
    }
}
