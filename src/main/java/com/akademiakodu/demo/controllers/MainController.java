package com.akademiakodu.demo.controllers;

import com.akademiakodu.demo.models.Forms.PersonForm;
import com.akademiakodu.demo.models.Person;
import com.akademiakodu.demo.repository.PersonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller
public class MainController {

    PersonRepository personRepository;

    private MainController(PersonRepository personRepository){
        this.personRepository=personRepository;
    }

    @RequestMapping(value = "/newform", method = RequestMethod.GET)
    public String newform(Model model) {
        model.addAttribute("personObject", new PersonForm());
        return "form";
    }

    @RequestMapping(value = "/newform", method = RequestMethod.POST)
    public String newFormPost(@ModelAttribute("personObject") @Valid PersonForm personForm, BindingResult result) {
        if (result.hasErrors()) {
            return "form";
        }
            Person personObject = new Person(personForm);
        personRepository.save(personObject);

        return "result";
    }
    
//    private void testBuoilder() {
//        PersonForm person = new PersonForm.Builder("Adam")
//                .setAge(25)
//                .setEmail("adamsawicki@gmail.com")
//                .setLastname("Sawicki")
//                .setPhone("697-234-321")
//                .build();
//
//        person.getAge();


}
