package ua.at.shegda.patientcards.service;

import java.util.List;

import ua.at.shegda.patientcards.model.tables.pojos.Patient;



public interface PatientService {
	
	List<Patient> getAllPatients();
	Patient addPatient(Patient patient);
	Patient getPatientById(Long patientId);
	Patient updatePatient(Long patientId, Patient patient);
	void removePatientById(Long patientId);
}
