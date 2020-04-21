package ua.at.shegda.patientcards.service;

import java.util.List;

import ua.at.shegda.patientcards.model.tables.pojos.Doctor;



public interface DoctorService {
	
	List<Doctor> getAllDoctors();
	Doctor addDoctor(Doctor doctor);
	Doctor getDoctorById(Long doctorId);
	Doctor updateDoctor(Long doctorId, Doctor doctor);
	void removeDoctorById(Long doctorId);
}
