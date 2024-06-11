package com.example.springboottest.demo.entity;

import jakarta.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "user_rewards")
public class UserRewards {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user_reward")
    private Long idUserReward;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_reward", nullable = false)
    private Rewards rewards;

    @Column(name = "redeemed_at", nullable = false)
    private Time redeemedAt;

    // Constructors, getters, and setters

    public UserRewards() {
    }

    public UserRewards(User user, Rewards rewards, Time redeemedAt) {
        this.user = user;
        this.rewards = rewards;
        this.redeemedAt = redeemedAt;
    }

    public Long getIdUserReward() {
        return idUserReward;
    }

    public void setIdUserReward(Long idUserReward) {
        this.idUserReward = idUserReward;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Rewards getRewards() {
        return rewards;
    }

    public void setRewards(Rewards rewards) {
        this.rewards = rewards;
    }

    public Time getRedeemedAt() {
        return redeemedAt;
    }

    public void setRedeemedAt(Time redeemedAt) {
        this.redeemedAt = redeemedAt;
    }
}
