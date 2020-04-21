package ua.at.shegda.patientcards.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.at.shegda.patientcards.model.tables.pojos.Status;
import ua.at.shegda.patientcards.model.tables.records.StatusRecord;
import ua.at.shegda.patientcards.repository.StatusRepository;
import ua.at.shegda.patientcards.service.StatusService;

@Service
@Transactional
public class StatusServiceImpl implements StatusService {
	@Autowired
	StatusRepository statRep;
	
	@Override
	public List<Status> getAllStatuss() {
		 List<Status> statuss = new ArrayList<>();
	        // Get list of customers.
	        List<StatusRecord> statusRecords = this.statRep.findAll();
	        statusRecords.stream()
	                .forEach(statusRecord -> statuss.add(statusRecord.into(Status.class)));
	        return statuss;
	}

	@Override
	public Status addStatus(Status status) {
		  return this.statRep.save(status).into(Status.class);
	}

	@Override
	public Status getStatusById(Long statusId) {
		 StatusRecord record = this.statRep.findOne(statusId);
	        if (record == null) {
	            throw new RuntimeException("Status not found");
	        }
	        return record.into(Status.class);
	}

	@Override
	public Status updateStatus(Long statusId, Status status) {
		 StatusRecord record = this.statRep.findOne(statusId);
	        if (record == null) {
	            throw new RuntimeException("Status not found");
	        }
	        // Add id.
	        status.setStatuscolId(record.getStatuscolId());
	        return this.statRep.update(status).into(Status.class);
	}

	@Override
	public void removeStatusById(Long statusId) {
		 StatusRecord record = this.statRep.findOne(statusId);
	        if (record == null) {
	            throw new RuntimeException("Status not found");
	        }
	        this.statRep.delete(statusId);

	}



}
