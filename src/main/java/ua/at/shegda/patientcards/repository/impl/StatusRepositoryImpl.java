package ua.at.shegda.patientcards.repository.impl;

import java.util.List;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ua.at.shegda.patientcards.model.Tables;
import ua.at.shegda.patientcards.model.tables.pojos.Status;
import ua.at.shegda.patientcards.model.tables.records.StatusRecord;
import ua.at.shegda.patientcards.repository.StatusRepository;
@Repository
public class StatusRepositoryImpl implements StatusRepository {
	@Autowired
	DSLContext dslContext;
	
	@Override
	public List<StatusRecord> findAll() {
		return this.dslContext.selectFrom(Tables.STATUS)
		         .fetch();
	}

	@Override
	public StatusRecord findOne(Long id) {
		return this.dslContext.selectFrom(Tables.STATUS)
                .where(Tables.STATUS.STATUSCOL_ID.eq(Math.toIntExact(id)))
                .fetchOne();
	}

	@Override
	public StatusRecord save(Status entity) {
		StatusRecord record = this.dslContext.newRecord(Tables.STATUS, entity);
        record.store();
        return record;
	}

	@Override
	public StatusRecord update(Status entity) {
		StatusRecord record = this.dslContext.newRecord(Tables.STATUS, entity);
        record.update();
        return record;
	}

	@Override
	public void delete(Long id) {
//		do not can delete status	
//		this.dslContext.deleteFrom(Tables.STATUS)
//        .where(Tables.STATUS.STATUSCOL_ID.eq(Math.toIntExact(id)))
//        .execute();
       

	}

	@Override
	public boolean exist(Long id) {
		return this.dslContext.selectCount()
                .from(Tables.STATUS)
                .where(Tables.STATUS.STATUSCOL_ID.eq(Math.toIntExact(id)))
                .fetchOne(0, Integer.class) > 0;
	}

}
