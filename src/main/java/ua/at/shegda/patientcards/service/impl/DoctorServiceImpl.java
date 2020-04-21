package ua.at.shegda.patientcards.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.at.shegda.patientcards.model.tables.pojos.Doctor;
import ua.at.shegda.patientcards.model.tables.records.DoctorRecord;
import ua.at.shegda.patientcards.repository.DoctorRepository;
import ua.at.shegda.patientcards.service.DoctorService;

@Service
@Transactional
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	DoctorRepository docRep;
	
	
	
	@Override
	public List<Doctor> getAllDoctors() {
		 List<Doctor> doctors = new ArrayList<>();
	        // Get list of customers.
	        List<DoctorRecord> doctorRecords = this.docRep.findAll();
	        doctorRecords.stream()
	                .forEach(doctorRecord -> doctors.add(doctorRecord.into(Doctor.class)));
	        return doctors;
	}

	@Override
	public Doctor addDoctor(Doctor doctor) {
		  return this.docRep.save(doctor).into(Doctor.class);
	}

	@Override
	public Doctor getDoctorById(Long doctorId) {
		 DoctorRecord record = this.docRep.findOne(doctorId);
	        if (record == null) {
	            throw new RuntimeException("Doctor not found");
	        }
	        return record.into(Doctor.class);
	}

	@Override
	public Doctor updateDoctor(Long doctorId, Doctor doctor) {
		 DoctorRecord record = this.docRep.findOne(doctorId);
	        if (record == null) {
	            throw new RuntimeException("Doctor not found");
	        }
	        // Add id.
	        doctor.setDoctorcolId(record.getDoctorcolId());
	        return this.docRep.update(doctor).into(Doctor.class);
	}

	@Override
	public void removeDoctorById(Long doctorId) {
		 DoctorRecord record = this.docRep.findOne(doctorId);
	        if (record == null) {
	            throw new RuntimeException("Doctor not found");
	        }
	        this.docRep.delete(doctorId);

	}

}
