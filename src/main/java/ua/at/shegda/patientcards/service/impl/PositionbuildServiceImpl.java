package ua.at.shegda.patientcards.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.at.shegda.patientcards.model.tables.pojos.Positionbuild;
import ua.at.shegda.patientcards.model.tables.records.PositionbuildRecord;
import ua.at.shegda.patientcards.repository.PositionbuildRepository;
import ua.at.shegda.patientcards.service.PositionbuildService;



@Service
@Transactional
public class PositionbuildServiceImpl implements PositionbuildService {
	@Autowired
	PositionbuildRepository posRep;
	
	@Override
	public List<Positionbuild> getAllPositionbuilds() {
		 List<Positionbuild> positionbuilds = new ArrayList<>();
	        // Get list of customers.
	        List<PositionbuildRecord> positionbuildRecords = this.posRep.findAll();
	        positionbuildRecords.stream()
	                .forEach(positionbuildRecord -> positionbuilds.add(positionbuildRecord.into(Positionbuild.class)));
	        return positionbuilds;
	}

	@Override
	public Positionbuild addPositionbuild(Positionbuild positionbuild) {
		  return this.posRep.save(positionbuild).into(Positionbuild.class);
	}

	@Override
	public Positionbuild getPositionbuildById(Long positionbuildId) {
		 PositionbuildRecord record = this.posRep.findOne(positionbuildId);
	        if (record == null) {
	            throw new RuntimeException("Positionbuild not found");
	        }
	        return record.into(Positionbuild.class);
	}

	@Override
	public Positionbuild updatePositionbuild(Long positionbuildId, Positionbuild positionbuild) {
		 PositionbuildRecord record = this.posRep.findOne(positionbuildId);
	        if (record == null) {
	            throw new RuntimeException("Positionbuild not found");
	        }
	        // Add id.
	        positionbuild.setPositionbuildcolId(record.getPositionbuildcolId());
	        return this.posRep.update(positionbuild).into(Positionbuild.class);
	}

	@Override
	public void removePositionbuildById(Long positionbuildId) {
		 PositionbuildRecord record = this.posRep.findOne(positionbuildId);
	        if (record == null) {
	            throw new RuntimeException("Positionbuild not found");
	        }
	        this.posRep.delete(positionbuildId);

	}

}
