package ua.at.shegda.patientcards.repository;



import java.util.List;

import ua.at.shegda.patientcards.model.tables.pojos.Doctor;
import ua.at.shegda.patientcards.model.tables.records.DoctorRecord;


public interface DoctorRepository extends JooqRepository<DoctorRecord, Doctor, Long> {
	
	public List<DoctorRecord> getAdministators();
}
