package ua.at.shegda.patientcards.repository.impl;




import java.util.List;


import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ua.at.shegda.patientcards.model.Tables;
import ua.at.shegda.patientcards.model.tables.pojos.Medicalsession;
import ua.at.shegda.patientcards.model.tables.records.MedicalsessionRecord;

import ua.at.shegda.patientcards.repository.MedicalsessionRepository;


@Repository
public class MedicalsessionRepositoryImpl implements MedicalsessionRepository {

	@Autowired
	DSLContext dslContext;
	
	
	@Override
	public List<MedicalsessionRecord> findAll() {
		return this.dslContext.selectFrom(Tables.MEDICALSESSION)
		.fetch();
	}
	
	@Override
	public List<MedicalsessionRecord> findAll(Boolean isActive) {
		if(isActive) {
		return this.dslContext.selectFrom(Tables.MEDICALSESSION)		
		.where(Tables.MEDICALSESSION.MEDICALSESSIONCOL_DATEREGISTRATIONDOWN.isNull())
		.fetch();
		}
		else return this.findAll();
	}

	@Override
	public MedicalsessionRecord findOne(Long id) {
		return this.dslContext.selectFrom(Tables.MEDICALSESSION)
				.where(Tables.MEDICALSESSION.MEDICALSESSIONCOL_ID.eq(Math.toIntExact(id)))
				.fetchOne();
	}

	@Override
	public MedicalsessionRecord save(Medicalsession entity) {
		 MedicalsessionRecord record = this.dslContext.newRecord(Tables.MEDICALSESSION, entity);
        record.store();
        return record;
	}

	@Override
	public MedicalsessionRecord update(Medicalsession entity) {
		MedicalsessionRecord record = this.dslContext.newRecord(Tables.MEDICALSESSION, entity);
        record.update();
        return record;
	}

	@Override
	public void delete(Long id) {
		this.dslContext.deleteFrom(Tables.MEDICALSESSION)
        .where(Tables.MEDICALSESSION.MEDICALSESSIONCOL_ID.eq(Math.toIntExact(id)))
        .execute();

	}

	@Override
	public boolean exist(Long id) {
		return this.dslContext.selectCount()
				.from(Tables.MEDICALSESSION)
		        .where(Tables.MEDICALSESSION.MEDICALSESSIONCOL_ID.eq(Math.toIntExact(id)))
		        .fetchOne(0, Integer.class) > 0;
	}

	@Override
	public List<MedicalsessionRecord> findByDoctor(Long id) {
		return this.dslContext.selectFrom(Tables.MEDICALSESSION)
				.where(Tables.MEDICALSESSION.DOCTOR_DOCTORCOL_ID.eq(Math.toIntExact(id)))
				.fetch();
	}

	@Override
	public List<MedicalsessionRecord> findByDoctor(Long id, Boolean isActive) {
		if(isActive) {
		return this.dslContext.selectFrom(Tables.MEDICALSESSION)
				.where(Tables.MEDICALSESSION.DOCTOR_DOCTORCOL_ID.eq(Math.toIntExact(id))
				.and(Tables.MEDICALSESSION.MEDICALSESSIONCOL_DATEREGISTRATIONDOWN.isNull()))
				.fetch();
		}
		else return this.findByDoctor(id);
	}

	@Override
	public List<MedicalsessionRecord> findByPatient(Long id) {
		return this.dslContext.selectFrom(Tables.MEDICALSESSION)
				.where(Tables.MEDICALSESSION.PATIENT_PATIENTCOL_ID.eq(Math.toIntExact(id)))
				.fetch();
	}

	@Override
	public List<MedicalsessionRecord> findByPatient(Long id, Boolean isActive) {
		if(isActive) {
		return this.dslContext.selectFrom(Tables.MEDICALSESSION)
				.where(Tables.MEDICALSESSION.PATIENT_PATIENTCOL_ID.eq(Math.toIntExact(id))
				.and(Tables.MEDICALSESSION.MEDICALSESSIONCOL_DATEREGISTRATIONDOWN.isNull()))
				.fetch();
		} else  return this.findByPatient(id);
	}

	@Override
	public List<MedicalsessionRecord> findByBuild(Long id) {
		return this.dslContext.selectFrom(Tables.MEDICALSESSION)
				.where(Tables.MEDICALSESSION.POSITIONBUILD_POSITIONBUILDCOL_ID.eq(Math.toIntExact(id)))
				.fetch();
	}

	@Override
	public List<MedicalsessionRecord> findByBuild(Long id, Boolean isActive) {
		if(isActive) {
		return this.dslContext.selectFrom(Tables.MEDICALSESSION)
				.where(Tables.MEDICALSESSION.POSITIONBUILD_POSITIONBUILDCOL_ID.eq(Math.toIntExact(id))
				.and(Tables.MEDICALSESSION.MEDICALSESSIONCOL_DATEREGISTRATIONDOWN.isNull()))
				.fetch();
		} else return this.findByBuild(id);
	}

	@Override
	public List<MedicalsessionRecord> findByState(Long id) {
		return this.dslContext.selectFrom(Tables.MEDICALSESSION)
				.where(Tables.MEDICALSESSION.STATUS_STATUSCOL_ID.eq(Math.toIntExact(id)))
				.fetch();
	}

	@Override
	public List<MedicalsessionRecord> findByState(Long id, Boolean isActive) {
		if(isActive) {
		return this.dslContext.selectFrom(Tables.MEDICALSESSION)
				.where(Tables.MEDICALSESSION.STATUS_STATUSCOL_ID.eq(Math.toIntExact(id))
				.and(Tables.MEDICALSESSION.MEDICALSESSIONCOL_DATEREGISTRATIONDOWN.isNull()))
				.fetch();
		} else return this.findByState(id);
			
	}

	@Override
	public List<MedicalsessionRecord> findByDiagnoz(String diagnoz) {
		return this.dslContext.selectFrom(Tables.MEDICALSESSION)
				.where(Tables.MEDICALSESSION.MEDICALSESSIONCOL_DIAGNOZ.contains(diagnoz))
				.fetch();
	}

	@Override
	public List<MedicalsessionRecord> findByDiagnoz(String diagnoz, Boolean isActive) {
		if(isActive) {
		return this.dslContext.selectFrom(Tables.MEDICALSESSION)
				.where(Tables.MEDICALSESSION.MEDICALSESSIONCOL_DIAGNOZ.contains(diagnoz)
				.and(Tables.MEDICALSESSION.MEDICALSESSIONCOL_DATEREGISTRATIONDOWN.isNull()))
				.fetch();
		} else return this.findByDiagnoz(diagnoz);
	}

	

}
