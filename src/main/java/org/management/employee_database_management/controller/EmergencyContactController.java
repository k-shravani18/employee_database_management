package org.management.employee_database_management.controller;

import org.management.employee_database_management.model.EmergencyContact;
import org.management.employee_database_management.service.EmergencyContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/login2")
public class EmergencyContactController {
    @Autowired
    private EmergencyContactService emergencyContactService;

    @GetMapping("/retrieve")
    public List<EmergencyContact> list() {
        return emergencyContactService.listAll();
    }

    @PostMapping("/create")
    public void add(@RequestBody EmergencyContact emergencyContactInfo) {
        emergencyContactService.save(emergencyContactInfo);
    }

    @GetMapping("/retrieve/{id}")
    public ResponseEntity<EmergencyContact> get(@PathVariable Long id) {
        EmergencyContact emergencyContactInfo = emergencyContactService.get(id);
        try {
            return new ResponseEntity<EmergencyContact>(emergencyContactInfo, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<EmergencyContact>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<EmergencyContact> update(@RequestBody EmergencyContact emergencyContactInfo, @PathVariable Long id) {
        try {
            EmergencyContact existEmergencyContactInfo = emergencyContactService.get(id);
            existEmergencyContactInfo.setName(existEmergencyContactInfo.getName());
            existEmergencyContactInfo.setAddress(existEmergencyContactInfo.getAddress());
            existEmergencyContactInfo.setContactNumber(existEmergencyContactInfo.getContactNumber());
            existEmergencyContactInfo.setRelationship(existEmergencyContactInfo.getRelationship());
            existEmergencyContactInfo.setWorkNumber(existEmergencyContactInfo.getWorkNumber());
//            existEmergencyContactInfo.setHealthCondition(existEmergencyContactInfo.getHealthCondition());
//            emergencyContactService.save(existEmergencyContactInfo);
            return new ResponseEntity<EmergencyContact>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<EmergencyContact>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id) {
        emergencyContactService.delete(id);
    }
}
