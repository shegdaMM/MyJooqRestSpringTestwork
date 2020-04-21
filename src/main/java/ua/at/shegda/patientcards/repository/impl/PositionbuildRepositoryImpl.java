package ua.at.shegda.patientcards.repository.impl;

import java.util.List;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;

import ua.at.shegda.patientcards.model.Tables;
import ua.at.shegda.patientcards.model.tables.pojos.Positionbuild;
import ua.at.shegda.patientcards.model.tables.records.PositionbuildRecord;
import ua.at.shegda.patientcards.repository.PositionbuildRepository;

public class PositionbuildRepositoryImpl implements PositionbuildRepository {
	@Autowired
	DSLContext dslContext;
	
	@Override
	public List<PositionbuildRecord> findAll() {
		return this.dslContext.selectFrom(Tables.POSITIONBUILD)
		.fetch();
	}

	@Override
	public PositionbuildRecord findOne(Long id) {
		return this.dslContext.selectFrom(Tables.POSITIONBUILD)
				.where(Tables.POSITIONBUILD.POSITIONBUILDCOL_ID.eq(Math.toIntExact(id)))
                .fetchOne();		
	}

	@Override
	public PositionbuildRecord save(Positionbuild entity) {
		PositionbuildRecord record = this.dslContext.newRecord(Tables.POSITIONBUILD, entity);
        record.store();
        return record;
	}

	@Override
	public PositionbuildRecord update(Positionbuild entity) {
		PositionbuildRecord record = this.dslContext.newRecord(Tables.POSITIONBUILD, entity);
        record.update();
        return record;
	}

	@Override
	public void delete(Long id) {
		this.dslContext.deleteFrom(Tables.POSITIONBUILD)
        .where(Tables.POSITIONBUILD.POSITIONBUILDCOL_ID.eq(Math.toIntExact(id)))
        .execute();

	}

	@Override
	public boolean exist(Long id) {
		return this.dslContext.selectCount()
                .from(Tables.POSITIONBUILD)
                .where(Tables.POSITIONBUILD.POSITIONBUILDCOL_ID.eq(Math.toIntExact(id)))
                .fetchOne(0, Integer.class) > 0;
	}

}
