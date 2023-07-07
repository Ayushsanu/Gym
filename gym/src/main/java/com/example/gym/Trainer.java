package com.example.gym;

import java.util.List;

public class Trainer {
    private int trainerId;
    private List<Member> member;
    private List<Gym> gym;

    public Trainer() {
    }

    public Trainer(int trainerId, List<Member> member, List<Gym> gym) {
        this.trainerId = trainerId;
        this.member = member;
        this.gym = gym;
    }

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public List<Member> getMember() {
        return member;
    }

    public void setMember(List<Member> member) {
        this.member = member;
    }

    public List<Gym> getGym() {
        return gym;
    }

    public void setGym(List<Gym> gym) {
        this.gym = gym;
    }
}
