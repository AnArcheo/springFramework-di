package sfg.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sfg.springframework.sfgdi.services.IGreetingService;

@Controller
public class ConstructorInjectedController {

    private final IGreetingService greetingService;
    @Autowired
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreetings();
    }
}
