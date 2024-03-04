package com.levdoc.vaadinnoteapp.mapper;

import com.levdoc.vaadinnoteapp.dto.EmergencyNotificationDTO;
import com.levdoc.vaadinnoteapp.model.notification.EmergencyNotification;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PatientMapper.class})
public interface EmergencyNotificationMapper {

    EmergencyNotificationMapper EMERGENCY_NOTIFICATION_MAPPER = Mappers.getMapper(EmergencyNotificationMapper.class);

    EmergencyNotificationDTO modelToDTO (EmergencyNotification emergencyNotification);
    EmergencyNotification dtoToModel (EmergencyNotificationDTO emergencyNotificationDTO);
    List<EmergencyNotificationDTO> modelsToDTOs (List<EmergencyNotification> emergencyNotificationList);
    List<EmergencyNotification> dtosToModel (List<EmergencyNotificationDTO> emergencyNotificationDTOList);

}
