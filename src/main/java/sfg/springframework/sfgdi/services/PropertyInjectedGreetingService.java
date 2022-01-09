package sfg.springframework.sfgdi.services;

import org.springframework.stereotype.Service;


public class PropertyInjectedGreetingService implements IGreetingService{

    @Override
    public String sayGreetings() {
        return "Hello---Property";
    }
}
