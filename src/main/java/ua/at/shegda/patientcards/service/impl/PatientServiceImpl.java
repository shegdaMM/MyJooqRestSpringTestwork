package ua.at.shegda.patientcards.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.at.shegda.patientcards.model.tables.pojos.Patient;
import ua.at.shegda.patientcards.model.tables.records.PatientRecord;
import ua.at.shegda.patientcards.repository.PatientRepository;
import ua.at.shegda.patientcards.service.PatientService;

@Service
@Transactional
public class PatientServiceImpl implements PatientService {
	@Autowired
	PatientRepository patRep;
	
	@Override
	public List<Patient> getAllPatients() {
		 List<Patient> patients = new ArrayList<>();
	        // Get list of customers.
	        List<PatientRecord> patientRecords = this.patRep.findAll();
	        patientRecords.stream()
	                .forEach(patientRecord -> patients.add(patientRecord.into(Patient.class)));
	        return patients;
	}

	@Override
	public Patient addPatient(Patient patient) {
		  return this.patRep.save(patient).into(Patient.class);
	}

	@Override
	public Patient getPatientById(Long patientId) {
		 PatientRecord record = this.patRep.findOne(patientId);
	        if (record == null) {
	            throw new RuntimeException("Patient not found");
	        }
	        return record.into(Patient.class);
	}

	@Override
	public Patient updatePatient(Long patientId, Patient patient) {
		 PatientRecord record = this.patRep.findOne(patientId);
	        if (record == null) {
	            throw new RuntimeException("Patient not found");
	        }
	        // Add id.
	        patient.setPatientcolId(record.getPatientcolId());
	        return this.patRep.update(patient).into(Patient.class);
	}

	@Override
	public void removePatientById(Long patientId) {
		 PatientRecord record = this.patRep.findOne(patientId);
	        if (record == null) {
	            throw new RuntimeException("Patient not found");
	        }
	        this.patRep.delete(patientId);

	}



}
