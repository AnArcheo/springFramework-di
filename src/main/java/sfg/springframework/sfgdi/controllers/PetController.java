package sfg.springframework.sfgdi.controllers;

import com.springframework.pets.PetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sfg.springframework.sfgdi.services.IGreetingService;

@Controller
public class PetController {

        private final PetService petService;

        public PetController(@Qualifier("dogPetService") PetService petService) {
            this.petService = petService;
        }

        public String getPet(){
            return petService.getPetType();
        }

}
