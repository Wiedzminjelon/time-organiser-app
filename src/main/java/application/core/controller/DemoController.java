package application.core.controller;

import application.core.service.DemoServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class DemoController {

    // == fields ==
    private final DemoServiceImpl demoService;

    // == costructors ==
    @Autowired
    public DemoController(DemoServiceImpl demoService) {
        this.demoService = demoService;
    }

    // == request methods ==

    // http://localhost:8080/todo-app/hello
    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    // http://localhost:8080/todo-app/welcome
    @GetMapping("welcome")
    // prefix + name + suffix
    //WEB-INF/view/welcome.jsp
    public String welcome(Model model) {
        model.addAttribute("helloMessage", demoService.getHelloMessage("Wiedzmin"));
        log.info("Model = {} ", model);
        return "welcome";
    }

    // == model attributes ==
    @ModelAttribute("welcomeMessage")
    public String welcomeMessage() {
        log.info("welcomeMessage() called");
        return demoService.getWelcomeMessage();
    }


}
