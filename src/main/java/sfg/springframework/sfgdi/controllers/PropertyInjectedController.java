package sfg.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sfg.springframework.sfgdi.services.IGreetingService;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    public IGreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreetings();
    }
}
