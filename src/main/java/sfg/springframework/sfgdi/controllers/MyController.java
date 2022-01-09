package sfg.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import sfg.springframework.sfgdi.services.IGreetingService;

@Controller
public class MyController {

    private final IGreetingService greetingService;

    public MyController(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreetings();
    }
}
