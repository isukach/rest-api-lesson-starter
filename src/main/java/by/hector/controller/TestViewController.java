package by.hector.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author i.sukach
 */
@Controller
public class TestViewController {

    @GetMapping("/test")
    public String showTestPage() {
        return "test";
    }
}
