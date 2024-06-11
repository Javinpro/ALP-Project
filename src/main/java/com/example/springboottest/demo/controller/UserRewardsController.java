package com.example.springboottest.demo.controller;

import com.example.springboottest.demo.entity.UserRewards;
import com.example.springboottest.demo.repository.UserRewardsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user-rewards")
public class UserRewardsController {

    private final UserRewardsRepository userRewardsRepository;

    public UserRewardsController(UserRewardsRepository userRewardsRepository) {
        this.userRewardsRepository = userRewardsRepository;
    }

    @GetMapping
    public List<UserRewards> getAllUserRewards() {
        return userRewardsRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<UserRewards> getUserRewardById(@PathVariable Long id) {
        return userRewardsRepository.findById(id);
    }

    @PostMapping
    public UserRewards createUserReward(@RequestBody UserRewards userRewards) {
        return userRewardsRepository.save(userRewards);
    }

    @PutMapping("/{id}")
    public UserRewards updateUserReward(@PathVariable Long id, @RequestBody UserRewards userRewardsDetails) {
        UserRewards userRewards = userRewardsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("UserReward not found with id: " + id));

        userRewards.setUser(userRewardsDetails.getUser());
        userRewards.setRewards(userRewardsDetails.getRewards());
        userRewards.setRedeemedAt(userRewardsDetails.getRedeemedAt());

        return userRewardsRepository.save(userRewards);
    }

    @DeleteMapping("/{id}")
    public void deleteUserReward(@PathVariable Long id) {
        userRewardsRepository.deleteById(id);
    }
}
