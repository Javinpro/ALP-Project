package com.example.springboottest.demo.repository;

import com.example.springboottest.demo.entity.Notifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface NotifRepository extends JpaRepository<Notifications, Integer> {
    List<Notifications> findByIdUser(Integer idUser);
    List<Notifications> findByIsRead(Boolean isRead);
}
