package sfg.springframework.sfgdi.services;


import sfg.springframework.sfgdi.repositories.EnglishGreetingRepository;


public class I18nEnglishGreetingService implements IGreetingService{

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreetings() {
        return "Hello World";
    }
}
