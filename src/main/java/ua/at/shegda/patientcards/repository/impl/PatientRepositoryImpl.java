package ua.at.shegda.patientcards.repository.impl;

import java.util.List;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ua.at.shegda.patientcards.model.Tables;
import ua.at.shegda.patientcards.model.tables.pojos.Patient;
import ua.at.shegda.patientcards.model.tables.records.PatientRecord;
import ua.at.shegda.patientcards.repository.PatientRepository;

@Repository
public class PatientRepositoryImpl implements PatientRepository {
	@Autowired
	DSLContext dslContext;
	
	@Override
	public List<PatientRecord> findAll() {
		return this.dslContext.selectFrom(Tables.PATIENT)
		.fetch();
	}

	@Override
	public PatientRecord findOne(Long id) {
		return this.dslContext.selectFrom(Tables.PATIENT)
		.where(Tables.PATIENT.PATIENTCOL_ID.eq(Math.toIntExact(id)))
		.fetchOne();
	}

	@Override
	public PatientRecord save(Patient entity) {
		PatientRecord record = this.dslContext.newRecord(Tables.PATIENT, entity);
        record.store();
        return record;
	}

	@Override
	public PatientRecord update(Patient entity) {
		PatientRecord record = this.dslContext.newRecord(Tables.PATIENT, entity);
        record.update();
        return record;
	}

	@Override
	public void delete(Long id) {
		this.dslContext.deleteFrom(Tables.PATIENT)
        .where(Tables.PATIENT.PATIENTCOL_ID.eq(Math.toIntExact(id)))
        .execute();

	}

	@Override
	public boolean exist(Long id) {
		return this.dslContext.selectCount()
		.from(Tables.PATIENT)
        .where(Tables.PATIENT.PATIENTCOL_ID.eq(Math.toIntExact(id)))
        .fetchOne(0, Integer.class) > 0;
	}
	
	@Override
	public List<PatientRecord> getPatientBySurname(String surname) {
		return this.dslContext.selectFrom(Tables.PATIENT)
				.where(Tables.PATIENT.PATIENTCOL_SURNAME.eq(surname))
				.fetch();
	}

	@Override
	public List<PatientRecord> getPatientByPasportData(String pasportData) {
		return this.dslContext.selectFrom(Tables.PATIENT)
				.where(Tables.PATIENT.PATIENTCOL_PASPORTDATA.eq(pasportData))
				.fetch();
	}
	

}
