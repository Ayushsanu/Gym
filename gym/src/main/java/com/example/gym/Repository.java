package com.example.gym;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

@org.springframework.stereotype.Repository
public class Repository {
    HashMap<Integer,Gym> gymDb=new HashMap<>();
    //Trainer obj3=new Trainer(1,);
    //Member obj2=new Member();
    //Gym obj=new Gym(1,"cannaught",);
    //obj.se
    HashMap<Integer,Member> memberDb=new HashMap<>();
    HashMap<Integer,Trainer> trainerDb=new HashMap<>();
    //@Autowired
    //Gym obj=new Gym();

    public String addGym(Gym gym){
        if(gymDb.containsKey(gym.getGymId())){
            return "Gym is already present";
        }
        else{
            gymDb.put(gym.getGymId(),gym);
            return "gym added";
        }
    }
    public String addMember(Member member){
        if(memberDb.containsKey(member.getMemeberId())){
            return "member already present";
        }
        else{
            memberDb.put(member.getMemeberId(), member);
            return "member added";
        }
    }
    public String addTrainer(Trainer trainer){
        if(trainerDb.containsKey(trainer.getTrainerId())){
            return "trainer alraedy added";
        }
        else{
            trainerDb.put(trainer.getTrainerId(), trainer);
            return "trainer added";
        }
    }
    public  int mostNumberTrainer(){
        int ans=0;
        for(int gym: gymDb.keySet()){
            int trainer=gymDb.get(gym).getTrainers().size();
            if(trainer>ans)ans=trainer;
        }
        return ans;
    }
    //Find the member which is being trained by most number of trainers
    public int trainedMostNoOfTrainer(){
        int ans=0;
        int prev=0;
        int res=0;
        for(int member:memberDb.keySet()){
            int noOfTrainer=memberDb.get(member).getTrainer().size();
            if(noOfTrainer>prev) {
                ans = noOfTrainer;
                res = member;
            }
        }
        return res;
    }
    //Find the number of trainers that work in more than 5 gyms.
    public int moreThan5gym(){
        int count=0;
        for(int trainer:trainerDb.keySet()){
            int noOfgym=trainerDb.get(trainer).getGym().size();
            if(noOfgym>5){
                count++;
            }
        }
        return count;
    }
}
