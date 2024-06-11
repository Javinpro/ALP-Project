package com.example.springboottest.demo.service;

import com.example.springboottest.demo.entity.Notifications;
import com.example.springboottest.demo.repository.NotifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificationsService {

    @Autowired
    private NotifRepository notificationsRepository;

    public Optional<Notifications> findNotificationById(Integer id) {
        return notificationsRepository.findById(id);
    }

    public Notifications saveNotification(Notifications notification) {
        return notificationsRepository.save(notification);
    }

    public void deleteNotification(Integer id) {
        notificationsRepository.deleteById(id);
    }

    public List<Notifications> findAllNotifications() {
        return notificationsRepository.findAll();
    }

    public List<Notifications> findNotificationsByUserId(Integer idUser) {
        return notificationsRepository.findByIdUser(idUser);
    }

    public List<Notifications> findNotificationsByReadStatus(Boolean isRead) {
        return notificationsRepository.findByIsRead(isRead);
    }
}
