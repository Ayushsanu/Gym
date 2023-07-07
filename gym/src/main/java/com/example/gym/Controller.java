package com.example.gym;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    Service service;
    @PostMapping("/addgym")
    public String addGym(@RequestBody Gym gym){
        return service.addGym(gym);
    }
    @PostMapping("/addmember")
    public String addMember(@RequestBody Member member){
        return service.addMember(member);
    }
    @PostMapping("/addTrainer")
    public String addTrainer(@RequestBody Trainer trainer){
        return service.addTrainer(trainer);
    }
    @GetMapping("/mostNumberTrainer")
    public  int mostNumberTrainer(){
        return service.mostNumberTrainer();
    }
    @GetMapping("/trainedMostNoOfTrainer")
    public int trainedMostNoOfTrainer(){
        return service.trainedMostNoOfTrainer();
    }
    @GetMapping("/moreThan5gym")
    public int moreThan5gym(){
        return service.moreThan5gym();
    }

}
