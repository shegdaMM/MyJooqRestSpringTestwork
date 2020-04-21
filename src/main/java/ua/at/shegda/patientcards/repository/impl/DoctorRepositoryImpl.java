package ua.at.shegda.patientcards.repository.impl;

import java.util.List;

import org.jooq.DSLContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ua.at.shegda.patientcards.model.Tables;
import ua.at.shegda.patientcards.model.tables.pojos.Doctor;
import ua.at.shegda.patientcards.model.tables.records.DoctorRecord;
import ua.at.shegda.patientcards.repository.DoctorRepository;

@Repository
public class DoctorRepositoryImpl implements DoctorRepository {
	@Autowired
	DSLContext dslContext;
	
	
	@Override
	public List<DoctorRecord> findAll() {
		 return this.dslContext.selectFrom(Tables.DOCTOR)
         .fetch();
	}

	@Override
	public DoctorRecord findOne(Long id) {
		return this.dslContext.selectFrom(Tables.DOCTOR)
                .where(Tables.DOCTOR.DOCTORCOL_ID.eq(Math.toIntExact(id)))
                .fetchOne();
	}

	@Override
	public DoctorRecord save(Doctor entity) {
		DoctorRecord record = this.dslContext.newRecord(Tables.DOCTOR, entity);
        record.store();
        return record;
	}

	@Override
	public DoctorRecord update(Doctor entity) {
		 DoctorRecord record = this.dslContext.newRecord(Tables.DOCTOR, entity);
	        record.update();
	        return record;
	}

	@Override
	public void delete(Long id) {
		 this.dslContext.deleteFrom(Tables.DOCTOR)
        .where(Tables.DOCTOR.DOCTORCOL_ID.eq(Math.toIntExact(id)))
        .execute();

	}

	@Override
	public boolean exist(Long id) {
		return this.dslContext.selectCount()
                .from(Tables.DOCTOR)
                .where(Tables.DOCTOR.DOCTORCOL_ID.eq(Math.toIntExact(id)))
                .fetchOne(0, Integer.class) > 0;
	}

	@Override
	public List<DoctorRecord> getAdministators() {
		return this.dslContext.selectFrom(Tables.DOCTOR)
                .where(Tables.DOCTOR.TYPE.eq("admin"))
                .fetch();
	}

}
