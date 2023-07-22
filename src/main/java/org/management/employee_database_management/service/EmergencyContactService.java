package org.management.employee_database_management.service;

import org.management.employee_database_management.model.EmergencyContact;
import org.management.employee_database_management.repository.EmergencyContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmergencyContactService {
    @Autowired
    private EmergencyContactRepository emergencyContactRepository;

    public List<EmergencyContact> listAll() {
        return emergencyContactRepository.findAll();
    }

    public void save(EmergencyContact emergencyContactInfo) {
        emergencyContactRepository.save(emergencyContactInfo);

    }

    public EmergencyContact get(Long id) {
        return emergencyContactRepository.findById(id).get();
    }

    public void delete(Long id) {
        emergencyContactRepository.deleteById(id);
    }
}
