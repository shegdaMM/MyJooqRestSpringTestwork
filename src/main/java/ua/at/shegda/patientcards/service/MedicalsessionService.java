package ua.at.shegda.patientcards.service;

import java.util.List;

import ua.at.shegda.patientcards.model.tables.pojos.Medicalsession;

public interface MedicalsessionService {

	List<Medicalsession> getAllMedicalsessions(boolean isActive);
	
	
	Medicalsession addMedicalsession(Medicalsession medicalsession);
	Medicalsession getMedicalsessionById(Long medicalsessionId);
	Medicalsession updateMedicalsession(Long medicalsessionId, Medicalsession medicalsession);
	void removeMedicalsessionById(Long medicalsessionId);
}
