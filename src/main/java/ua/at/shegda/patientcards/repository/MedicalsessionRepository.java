package ua.at.shegda.patientcards.repository;

import java.util.List;

import ua.at.shegda.patientcards.model.tables.pojos.Medicalsession;
import ua.at.shegda.patientcards.model.tables.records.MedicalsessionRecord;

public interface MedicalsessionRepository extends JooqRepository<MedicalsessionRecord, Medicalsession, Long> {

	public List<MedicalsessionRecord> findAll(Boolean isActive);
	
	public List<MedicalsessionRecord> findByDoctor(Long id);
	
	public List<MedicalsessionRecord> findByDoctor(Long id, Boolean isActive);
	
	public List<MedicalsessionRecord> findByPatient(Long id);
	
	public List<MedicalsessionRecord> findByPatient(Long id, Boolean isActive);
	
	public List<MedicalsessionRecord> findByBuild(Long id);
	
	public List<MedicalsessionRecord> findByBuild(Long id, Boolean isActive);
	
	public List<MedicalsessionRecord> findByState(Long id);
	
	public List<MedicalsessionRecord> findByState(Long id, Boolean isActive);
	
	public List<MedicalsessionRecord> findByDiagnoz(String diagnoz);
	
	public List<MedicalsessionRecord> findByDiagnoz(String diagnoz, Boolean isActive);
	
	
	
	
	
}
