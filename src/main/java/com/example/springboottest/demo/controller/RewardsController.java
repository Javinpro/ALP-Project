package com.example.springboottest.demo.controller;

import com.example.springboottest.demo.entity.Rewards;
import com.example.springboottest.demo.repository.RewardsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/rewards")
public class RewardsController {

    private final RewardsRepository rewardsRepository;

    public RewardsController(RewardsRepository rewardsRepository) {
        this.rewardsRepository = rewardsRepository;
    }

    @GetMapping
    public List<Rewards> getAllRewards() {
        return rewardsRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Rewards> getRewardById(@PathVariable Integer id) {
        return rewardsRepository.findById(id);
    }

    @PostMapping
    public Rewards createReward(@RequestBody Rewards reward) {
        return rewardsRepository.save(reward);
    }

    @PutMapping("/{id}")
    public Rewards updateReward(@PathVariable Integer id, @RequestBody Rewards rewardDetails) {
        Rewards reward = rewardsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reward not found with id: " + id));

        reward.setName(rewardDetails.getName());
        reward.setDescription(rewardDetails.getDescription());
        reward.setPointsRequired(rewardDetails.getPointsRequired());
        reward.setStock(rewardDetails.getStock());
        reward.setCreatedAt(rewardDetails.getCreatedAt());

        return rewardsRepository.save(reward);
    }

    @DeleteMapping("/{id}")
    public void deleteReward(@PathVariable Integer id) {
        rewardsRepository.deleteById(id);
    }
}
