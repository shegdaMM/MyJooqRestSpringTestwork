package ua.at.shegda.patientcards.repository;

import java.util.List;

import ua.at.shegda.patientcards.model.tables.pojos.Patient;
import ua.at.shegda.patientcards.model.tables.records.PatientRecord;

public interface PatientRepository extends JooqRepository<PatientRecord, Patient, Long> {
	
	List<PatientRecord> getPatientBySurname(String surname);
	List<PatientRecord> getPatientByPasportData(String pasportData);

}
