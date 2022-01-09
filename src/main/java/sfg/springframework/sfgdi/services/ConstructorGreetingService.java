package sfg.springframework.sfgdi.services;


import org.springframework.stereotype.Service;


public class ConstructorGreetingService implements IGreetingService {
    @Override
    public String sayGreetings() {
        return "Hello---Constructor";
    }
}
