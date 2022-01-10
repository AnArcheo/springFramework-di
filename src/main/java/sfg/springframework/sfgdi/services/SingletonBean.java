package sfg.springframework.sfgdi.services;


import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating a Singleton Bean");
    }

    public String getMyScope(){
        return "I am Singleton Bean";
    }


}
