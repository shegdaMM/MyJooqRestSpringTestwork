package ua.at.shegda.patientcards.repository;


import ua.at.shegda.patientcards.model.tables.pojos.Status;
import ua.at.shegda.patientcards.model.tables.records.StatusRecord;

public interface StatusRepository extends JooqRepository<StatusRecord, Status, Long> {

}
