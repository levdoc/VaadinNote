package com.levdoc.vaadinnoteapp.repository;

import com.levdoc.vaadinnoteapp.model.notification.Patient;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository
        extends GenericRepository<Patient>{
}
