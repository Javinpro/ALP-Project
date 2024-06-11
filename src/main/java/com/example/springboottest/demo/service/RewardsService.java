package com.example.springboottest.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboottest.demo.entity.Rewards;
import com.example.springboottest.demo.repository.RewardsRepository;

@Service
public class RewardsService {

    @Autowired
    private RewardsRepository rewardsRepository;

    public Optional<Rewards> findRewardById(Integer id) {
        return rewardsRepository.findById(id);
    }

    public Rewards saveReward(Rewards reward) {
        return rewardsRepository.save(reward);
    }

    public void deleteReward(Integer id) {
        rewardsRepository.deleteById(id);
    }

    public List<Rewards> findAllRewards() {
        return rewardsRepository.findAll();
    }
}
