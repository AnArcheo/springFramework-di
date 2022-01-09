package sfg.springframework.sfgdi.services;

import org.springframework.stereotype.Service;


public class SetterInjectedGreetingService implements IGreetingService{

    @Override
    public String sayGreetings() {
        return "Hello---Setter";
    }
}
