package com.example.gym;

import java.util.List;

public class Member {
    private int memeberId;
    private List<Trainer> trainer;
    private String gym;

    public Member() {
    }

    public Member(int memeberId, List<Trainer> trainer, String gym) {
        this.memeberId = memeberId;
        this.trainer = trainer;
        this.gym = gym;
    }

    public int getMemeberId() {
        return memeberId;
    }

    public void setMemeberId(int memeberId) {
        this.memeberId = memeberId;
    }

    public List<Trainer> getTrainer() {
        return trainer;
    }

    public void setTrainer(List<Trainer> trainer) {
        this.trainer = trainer;
    }

    public String getGym() {
        return gym;
    }

    public void setGym(String gym) {
        this.gym = gym;
    }
}
