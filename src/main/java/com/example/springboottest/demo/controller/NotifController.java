package com.example.springboottest.demo.controller;

import com.example.springboottest.demo.entity.Notifications;
import com.example.springboottest.demo.repository.NotifRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/notifications")
public class NotifController {

    private final NotifRepository notifRepository;

    public NotifController(NotifRepository notifRepository) {
        this.notifRepository = notifRepository;
    }

    @GetMapping
    public List<Notifications> getAllNotifications() {
        return notifRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Notifications> getNotificationById(@PathVariable Integer id) {
        return notifRepository.findById(id);
    }

    @PostMapping
    public Notifications createNotification(@RequestBody Notifications notifications) {
        return notifRepository.save(notifications);
    }

    @PutMapping("/{id}")
    public Notifications updateNotification(@PathVariable Integer id, @RequestBody Notifications notificationsDetails) {
        Notifications notifications = notifRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Notification not found with id: " + id));

        notifications.setIdUser(notificationsDetails.getIdUser());
        notifications.setMessage(notificationsDetails.getMessage());
        notifications.setRead(notificationsDetails.getRead());
        notifications.setCreatedAt(notificationsDetails.getCreatedAt());

        return notifRepository.save(notifications);
    }

    @DeleteMapping("/{id}")
    public void deleteNotification(@PathVariable Integer id) {
        notifRepository.deleteById(id);
    }
}
