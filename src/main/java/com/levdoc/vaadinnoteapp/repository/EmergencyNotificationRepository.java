package com.levdoc.vaadinnoteapp.repository;

import com.levdoc.vaadinnoteapp.model.notification.EmergencyNotification;
import org.springframework.stereotype.Repository;

@Repository
public interface EmergencyNotificationRepository
        extends GenericRepository<EmergencyNotification>{

    EmergencyNotification getEmergencyNotificationById(Long id);

}
