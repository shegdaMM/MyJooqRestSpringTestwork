/*
 * This file is generated by jOOQ.
 */
package ua.at.shegda.patientcards.model.tables.daos;


import java.time.LocalDate;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import ua.at.shegda.patientcards.model.enums.PatientPatientcolSex;
import ua.at.shegda.patientcards.model.tables.Patient;
import ua.at.shegda.patientcards.model.tables.records.PatientRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PatientDao extends DAOImpl<PatientRecord, ua.at.shegda.patientcards.model.tables.pojos.Patient, Integer> {

    /**
     * Create a new PatientDao without any configuration
     */
    public PatientDao() {
        super(Patient.PATIENT, ua.at.shegda.patientcards.model.tables.pojos.Patient.class);
    }

    /**
     * Create a new PatientDao with an attached configuration
     */
    public PatientDao(Configuration configuration) {
        super(Patient.PATIENT, ua.at.shegda.patientcards.model.tables.pojos.Patient.class, configuration);
    }

    @Override
    public Integer getId(ua.at.shegda.patientcards.model.tables.pojos.Patient object) {
        return object.getPatientcolId();
    }

    /**
     * Fetch records that have <code>Patientcol_ID BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchRangeOfPatientcolId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Patient.PATIENT.PATIENTCOL_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>Patientcol_ID IN (values)</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchByPatientcolId(Integer... values) {
        return fetch(Patient.PATIENT.PATIENTCOL_ID, values);
    }

    /**
     * Fetch a unique record that has <code>Patientcol_ID = value</code>
     */
    public ua.at.shegda.patientcards.model.tables.pojos.Patient fetchOneByPatientcolId(Integer value) {
        return fetchOne(Patient.PATIENT.PATIENTCOL_ID, value);
    }

    /**
     * Fetch records that have <code>Patientcol_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchRangeOfPatientcolName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Patient.PATIENT.PATIENTCOL_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>Patientcol_name IN (values)</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchByPatientcolName(String... values) {
        return fetch(Patient.PATIENT.PATIENTCOL_NAME, values);
    }

    /**
     * Fetch records that have <code>Patientcol_surname BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchRangeOfPatientcolSurname(String lowerInclusive, String upperInclusive) {
        return fetchRange(Patient.PATIENT.PATIENTCOL_SURNAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>Patientcol_surname IN (values)</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchByPatientcolSurname(String... values) {
        return fetch(Patient.PATIENT.PATIENTCOL_SURNAME, values);
    }

    /**
     * Fetch records that have <code>Patientcol_otchestvo BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchRangeOfPatientcolOtchestvo(String lowerInclusive, String upperInclusive) {
        return fetchRange(Patient.PATIENT.PATIENTCOL_OTCHESTVO, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>Patientcol_otchestvo IN (values)</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchByPatientcolOtchestvo(String... values) {
        return fetch(Patient.PATIENT.PATIENTCOL_OTCHESTVO, values);
    }

    /**
     * Fetch records that have <code>Patientcol_sex BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchRangeOfPatientcolSex(PatientPatientcolSex lowerInclusive, PatientPatientcolSex upperInclusive) {
        return fetchRange(Patient.PATIENT.PATIENTCOL_SEX, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>Patientcol_sex IN (values)</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchByPatientcolSex(PatientPatientcolSex... values) {
        return fetch(Patient.PATIENT.PATIENTCOL_SEX, values);
    }

    /**
     * Fetch records that have <code>Patientcol_dateOfBirth BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchRangeOfPatientcolDateofbirth(LocalDate lowerInclusive, LocalDate upperInclusive) {
        return fetchRange(Patient.PATIENT.PATIENTCOL_DATEOFBIRTH, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>Patientcol_dateOfBirth IN (values)</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchByPatientcolDateofbirth(LocalDate... values) {
        return fetch(Patient.PATIENT.PATIENTCOL_DATEOFBIRTH, values);
    }

    /**
     * Fetch records that have <code>Patientcol_post BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchRangeOfPatientcolPost(String lowerInclusive, String upperInclusive) {
        return fetchRange(Patient.PATIENT.PATIENTCOL_POST, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>Patientcol_post IN (values)</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchByPatientcolPost(String... values) {
        return fetch(Patient.PATIENT.PATIENTCOL_POST, values);
    }

    /**
     * Fetch records that have <code>Patientcol_pasportData BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchRangeOfPatientcolPasportdata(String lowerInclusive, String upperInclusive) {
        return fetchRange(Patient.PATIENT.PATIENTCOL_PASPORTDATA, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>Patientcol_pasportData IN (values)</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchByPatientcolPasportdata(String... values) {
        return fetch(Patient.PATIENT.PATIENTCOL_PASPORTDATA, values);
    }

    /**
     * Fetch records that have <code>Patientcol_numberMedPolis BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchRangeOfPatientcolNumbermedpolis(String lowerInclusive, String upperInclusive) {
        return fetchRange(Patient.PATIENT.PATIENTCOL_NUMBERMEDPOLIS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>Patientcol_numberMedPolis IN (values)</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchByPatientcolNumbermedpolis(String... values) {
        return fetch(Patient.PATIENT.PATIENTCOL_NUMBERMEDPOLIS, values);
    }

    /**
     * Fetch records that have <code>Patientcol_dateOutPolis BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchRangeOfPatientcolDateoutpolis(LocalDate lowerInclusive, LocalDate upperInclusive) {
        return fetchRange(Patient.PATIENT.PATIENTCOL_DATEOUTPOLIS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>Patientcol_dateOutPolis IN (values)</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchByPatientcolDateoutpolis(LocalDate... values) {
        return fetch(Patient.PATIENT.PATIENTCOL_DATEOUTPOLIS, values);
    }

    /**
     * Fetch records that have <code>Patientcol_address BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchRangeOfPatientcolAddress(String lowerInclusive, String upperInclusive) {
        return fetchRange(Patient.PATIENT.PATIENTCOL_ADDRESS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>Patientcol_address IN (values)</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchByPatientcolAddress(String... values) {
        return fetch(Patient.PATIENT.PATIENTCOL_ADDRESS, values);
    }

    /**
     * Fetch records that have <code>Patientcol_phone BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchRangeOfPatientcolPhone(String lowerInclusive, String upperInclusive) {
        return fetchRange(Patient.PATIENT.PATIENTCOL_PHONE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>Patientcol_phone IN (values)</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchByPatientcolPhone(String... values) {
        return fetch(Patient.PATIENT.PATIENTCOL_PHONE, values);
    }

    /**
     * Fetch records that have <code>Patientcol_email BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchRangeOfPatientcolEmail(String lowerInclusive, String upperInclusive) {
        return fetchRange(Patient.PATIENT.PATIENTCOL_EMAIL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>Patientcol_email IN (values)</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchByPatientcolEmail(String... values) {
        return fetch(Patient.PATIENT.PATIENTCOL_EMAIL, values);
    }

    /**
     * Fetch records that have <code>Patientcol_alergies BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchRangeOfPatientcolAlergies(String lowerInclusive, String upperInclusive) {
        return fetchRange(Patient.PATIENT.PATIENTCOL_ALERGIES, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>Patientcol_alergies IN (values)</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchByPatientcolAlergies(String... values) {
        return fetch(Patient.PATIENT.PATIENTCOL_ALERGIES, values);
    }

    /**
     * Fetch records that have <code>Patientcol_discription BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchRangeOfPatientcolDiscription(String lowerInclusive, String upperInclusive) {
        return fetchRange(Patient.PATIENT.PATIENTCOL_DISCRIPTION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>Patientcol_discription IN (values)</code>
     */
    public List<ua.at.shegda.patientcards.model.tables.pojos.Patient> fetchByPatientcolDiscription(String... values) {
        return fetch(Patient.PATIENT.PATIENTCOL_DISCRIPTION, values);
    }
}
