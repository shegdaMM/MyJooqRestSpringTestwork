package ua.at.shegda.patientcards.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ua.at.shegda.patientcards.model.tables.pojos.Medicalsession;
import ua.at.shegda.patientcards.model.tables.pojos.Positionbuild;
import ua.at.shegda.patientcards.model.tables.records.MedicalsessionRecord;
import ua.at.shegda.patientcards.model.tables.records.PositionbuildRecord;
import ua.at.shegda.patientcards.repository.DoctorRepository;
import ua.at.shegda.patientcards.repository.MedicalsessionRepository;
import ua.at.shegda.patientcards.repository.PatientRepository;
import ua.at.shegda.patientcards.repository.PositionbuildRepository;
import ua.at.shegda.patientcards.repository.StatusRepository;
import ua.at.shegda.patientcards.service.MedicalsessionService;

public class MedicalessionServiceImpl implements MedicalsessionService {
	@Autowired
	MedicalsessionRepository medRep;
	
	@Autowired
	DoctorRepository docRep;
	
	@Autowired
	PatientRepository patRep;
	
	@Autowired
	PositionbuildRepository posRep;
	
	@Autowired
	StatusRepository statRep;
	
	@Override
	public List<Medicalsession> getAllMedicalsessions(boolean isActive) {
		List<Medicalsession> medicalsession = new ArrayList<>();
        // Get list of customers.
        List<MedicalsessionRecord> positionbuildRecords = this.medRep.findAll(isActive);
        positionbuildRecords.stream()
                .forEach(medicalsessionRecord -> medicalsession
                		
                		.add(medicalsessionRecord.into(Medicalsession.class)));
        return medicalsession;
	}

	@Override
	public Medicalsession addMedicalsession(Medicalsession medicalsession) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Medicalsession getMedicalsessionById(Long medicalsessionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Medicalsession updateMedicalsession(Long medicalsessionId, Medicalsession medicalsession) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeMedicalsessionById(Long medicalsessionId) {
		// TODO Auto-generated method stub

	}

}
