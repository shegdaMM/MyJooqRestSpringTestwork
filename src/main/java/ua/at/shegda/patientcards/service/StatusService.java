package ua.at.shegda.patientcards.service;

import java.util.List;


import ua.at.shegda.patientcards.model.tables.pojos.Status;

public interface StatusService {

	List<Status> getAllStatuss();
	Status addStatus(Status status);
	Status getStatusById(Long statusId);
	Status updateStatus(Long statusId, Status status);
	void removeStatusById(Long statusId);
}
