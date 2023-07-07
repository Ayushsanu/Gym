package com.example.gym;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    Repository repository;
    public String addGym(Gym gym){
        return repository.addGym(gym);
    }
    public String addMember(Member member){
        return repository.addMember(member);
    }
    public String addTrainer(Trainer trainer){
        return repository.addTrainer(trainer);
    }
    public  int mostNumberTrainer(){
        return repository.mostNumberTrainer();
    }
    public int trainedMostNoOfTrainer(){
        return repository.trainedMostNoOfTrainer();
    }
    public int moreThan5gym(){
        return repository.moreThan5gym();
    }
}
