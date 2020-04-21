package ua.at.shegda.patientcards.service;

import java.util.List;

import ua.at.shegda.patientcards.model.tables.pojos.Positionbuild;

public interface PositionbuildService {

	
	List<Positionbuild> getAllPositionbuilds();
	Positionbuild addPositionbuild(Positionbuild positionbuild);
	Positionbuild getPositionbuildById(Long positionbuildId);
	Positionbuild updatePositionbuild(Long positionbuildId, Positionbuild positionbuild);
	void removePositionbuildById(Long positionbuildId);
	
}
