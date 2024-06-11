package com.example.springboottest.demo.service;

import com.example.springboottest.demo.entity.UserRewards;
import com.example.springboottest.demo.repository.UserRewardsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserRewardsService {

    private final UserRewardsRepository userRewardsRepository;

    public UserRewardsService(UserRewardsRepository userRewardsRepository) {
        this.userRewardsRepository = userRewardsRepository;
    }

    public List<UserRewards> getAllUserRewards() {
        return userRewardsRepository.findAll();
    }

    public Optional<UserRewards> getUserRewardsById(Long id) {
        return userRewardsRepository.findById(id);
    }

    public UserRewards createUserRewards(UserRewards userRewards) {
        return userRewardsRepository.save(userRewards);
    }

    public UserRewards updateUserRewards(Long id, UserRewards userRewardsDetails) {
        UserRewards userRewards = userRewardsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User Rewards not found with id: " + id));

        userRewards.setUser(userRewardsDetails.getUser());
        userRewards.setRewards(userRewardsDetails.getRewards());
        userRewards.setRedeemedAt(userRewardsDetails.getRedeemedAt());

        return userRewardsRepository.save(userRewards);
    }

    public void deleteUserRewards(Long id) {
        userRewardsRepository.deleteById(id);
    }
}
