package sfg.springframework.sfgdi.services;


public class PrimaryGreetingService implements IGreetingService{

    @Override
    public String sayGreetings() {
        return "Hello from the Primary Bean";
    }
}
