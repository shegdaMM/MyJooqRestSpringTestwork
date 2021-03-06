/*
 * This file is generated by jOOQ.
 */
package ua.at.shegda.patientcards.model.tables.records;


import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;

import ua.at.shegda.patientcards.model.tables.Medicalsession;


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
public class MedicalsessionRecord extends UpdatableRecordImpl<MedicalsessionRecord> implements Record13<Integer, Integer, LocalDateTime, LocalDate, String, String, String, Integer, Integer, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = -600093550;

    /**
     * Setter for <code>patientregsys.medicalsession.MedicalSessioncol_ID</code>.
     */
    public void setMedicalsessioncolId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>patientregsys.medicalsession.MedicalSessioncol_ID</code>.
     */
    public Integer getMedicalsessioncolId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>patientregsys.medicalsession.Patient_Patientcol_ID</code>.
     */
    public void setPatientPatientcolId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>patientregsys.medicalsession.Patient_Patientcol_ID</code>.
     */
    public Integer getPatientPatientcolId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>patientregsys.medicalsession.MedicalSessioncol_dateRegistration</code>.
     */
    public void setMedicalsessioncolDateregistration(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>patientregsys.medicalsession.MedicalSessioncol_dateRegistration</code>.
     */
    public LocalDateTime getMedicalsessioncolDateregistration() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>patientregsys.medicalsession.MedicalSessioncol_dateRegistrationDown</code>.
     */
    public void setMedicalsessioncolDateregistrationdown(LocalDate value) {
        set(3, value);
    }

    /**
     * Getter for <code>patientregsys.medicalsession.MedicalSessioncol_dateRegistrationDown</code>.
     */
    public LocalDate getMedicalsessioncolDateregistrationdown() {
        return (LocalDate) get(3);
    }

    /**
     * Setter for <code>patientregsys.medicalsession.MedicalSessioncol_diagnoz</code>.
     */
    public void setMedicalsessioncolDiagnoz(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>patientregsys.medicalsession.MedicalSessioncol_diagnoz</code>.
     */
    public String getMedicalsessioncolDiagnoz() {
        return (String) get(4);
    }

    /**
     * Setter for <code>patientregsys.medicalsession.MedicalSessioncol_medicaments</code>.
     */
    public void setMedicalsessioncolMedicaments(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>patientregsys.medicalsession.MedicalSessioncol_medicaments</code>.
     */
    public String getMedicalsessioncolMedicaments() {
        return (String) get(5);
    }

    /**
     * Setter for <code>patientregsys.medicalsession.MedicalSessioncol_discriptions</code>.
     */
    public void setMedicalsessioncolDiscriptions(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>patientregsys.medicalsession.MedicalSessioncol_discriptions</code>.
     */
    public String getMedicalsessioncolDiscriptions() {
        return (String) get(6);
    }

    /**
     * Setter for <code>patientregsys.medicalsession.MedicalSessioncol_positionfloor</code>.
     */
    public void setMedicalsessioncolPositionfloor(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>patientregsys.medicalsession.MedicalSessioncol_positionfloor</code>.
     */
    public Integer getMedicalsessioncolPositionfloor() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>patientregsys.medicalsession.MedicalSessioncol_possitionward</code>.
     */
    public void setMedicalsessioncolPossitionward(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>patientregsys.medicalsession.MedicalSessioncol_possitionward</code>.
     */
    public Integer getMedicalsessioncolPossitionward() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>patientregsys.medicalsession.MedicalSessioncol__possitionbad</code>.
     */
    public void setMedicalsessioncol_Possitionbad(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>patientregsys.medicalsession.MedicalSessioncol__possitionbad</code>.
     */
    public Integer getMedicalsessioncol_Possitionbad() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>patientregsys.medicalsession.PositionBuild_PositionBuildcol_Id</code>.
     */
    public void setPositionbuildPositionbuildcolId(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>patientregsys.medicalsession.PositionBuild_PositionBuildcol_Id</code>.
     */
    public Integer getPositionbuildPositionbuildcolId() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>patientregsys.medicalsession.Doctor_Doctorcol_ID</code>.
     */
    public void setDoctorDoctorcolId(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>patientregsys.medicalsession.Doctor_Doctorcol_ID</code>.
     */
    public Integer getDoctorDoctorcolId() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>patientregsys.medicalsession.status_statuscol_ID</code>.
     */
    public void setStatusStatuscolId(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>patientregsys.medicalsession.status_statuscol_ID</code>.
     */
    public Integer getStatusStatuscolId() {
        return (Integer) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<Integer, Integer, LocalDateTime, LocalDate, String, String, String, Integer, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<Integer, Integer, LocalDateTime, LocalDate, String, String, String, Integer, Integer, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Medicalsession.MEDICALSESSION.MEDICALSESSIONCOL_ID;
    }

    @Override
    public Field<Integer> field2() {
        return Medicalsession.MEDICALSESSION.PATIENT_PATIENTCOL_ID;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return Medicalsession.MEDICALSESSION.MEDICALSESSIONCOL_DATEREGISTRATION;
    }

    @Override
    public Field<LocalDate> field4() {
        return Medicalsession.MEDICALSESSION.MEDICALSESSIONCOL_DATEREGISTRATIONDOWN;
    }

    @Override
    public Field<String> field5() {
        return Medicalsession.MEDICALSESSION.MEDICALSESSIONCOL_DIAGNOZ;
    }

    @Override
    public Field<String> field6() {
        return Medicalsession.MEDICALSESSION.MEDICALSESSIONCOL_MEDICAMENTS;
    }

    @Override
    public Field<String> field7() {
        return Medicalsession.MEDICALSESSION.MEDICALSESSIONCOL_DISCRIPTIONS;
    }

    @Override
    public Field<Integer> field8() {
        return Medicalsession.MEDICALSESSION.MEDICALSESSIONCOL_POSITIONFLOOR;
    }

    @Override
    public Field<Integer> field9() {
        return Medicalsession.MEDICALSESSION.MEDICALSESSIONCOL_POSSITIONWARD;
    }

    @Override
    public Field<Integer> field10() {
        return Medicalsession.MEDICALSESSION.MEDICALSESSIONCOL__POSSITIONBAD;
    }

    @Override
    public Field<Integer> field11() {
        return Medicalsession.MEDICALSESSION.POSITIONBUILD_POSITIONBUILDCOL_ID;
    }

    @Override
    public Field<Integer> field12() {
        return Medicalsession.MEDICALSESSION.DOCTOR_DOCTORCOL_ID;
    }

    @Override
    public Field<Integer> field13() {
        return Medicalsession.MEDICALSESSION.STATUS_STATUSCOL_ID;
    }

    @Override
    public Integer component1() {
        return getMedicalsessioncolId();
    }

    @Override
    public Integer component2() {
        return getPatientPatientcolId();
    }

    @Override
    public LocalDateTime component3() {
        return getMedicalsessioncolDateregistration();
    }

    @Override
    public LocalDate component4() {
        return getMedicalsessioncolDateregistrationdown();
    }

    @Override
    public String component5() {
        return getMedicalsessioncolDiagnoz();
    }

    @Override
    public String component6() {
        return getMedicalsessioncolMedicaments();
    }

    @Override
    public String component7() {
        return getMedicalsessioncolDiscriptions();
    }

    @Override
    public Integer component8() {
        return getMedicalsessioncolPositionfloor();
    }

    @Override
    public Integer component9() {
        return getMedicalsessioncolPossitionward();
    }

    @Override
    public Integer component10() {
        return getMedicalsessioncol_Possitionbad();
    }

    @Override
    public Integer component11() {
        return getPositionbuildPositionbuildcolId();
    }

    @Override
    public Integer component12() {
        return getDoctorDoctorcolId();
    }

    @Override
    public Integer component13() {
        return getStatusStatuscolId();
    }

    @Override
    public Integer value1() {
        return getMedicalsessioncolId();
    }

    @Override
    public Integer value2() {
        return getPatientPatientcolId();
    }

    @Override
    public LocalDateTime value3() {
        return getMedicalsessioncolDateregistration();
    }

    @Override
    public LocalDate value4() {
        return getMedicalsessioncolDateregistrationdown();
    }

    @Override
    public String value5() {
        return getMedicalsessioncolDiagnoz();
    }

    @Override
    public String value6() {
        return getMedicalsessioncolMedicaments();
    }

    @Override
    public String value7() {
        return getMedicalsessioncolDiscriptions();
    }

    @Override
    public Integer value8() {
        return getMedicalsessioncolPositionfloor();
    }

    @Override
    public Integer value9() {
        return getMedicalsessioncolPossitionward();
    }

    @Override
    public Integer value10() {
        return getMedicalsessioncol_Possitionbad();
    }

    @Override
    public Integer value11() {
        return getPositionbuildPositionbuildcolId();
    }

    @Override
    public Integer value12() {
        return getDoctorDoctorcolId();
    }

    @Override
    public Integer value13() {
        return getStatusStatuscolId();
    }

    @Override
    public MedicalsessionRecord value1(Integer value) {
        setMedicalsessioncolId(value);
        return this;
    }

    @Override
    public MedicalsessionRecord value2(Integer value) {
        setPatientPatientcolId(value);
        return this;
    }

    @Override
    public MedicalsessionRecord value3(LocalDateTime value) {
        setMedicalsessioncolDateregistration(value);
        return this;
    }

    @Override
    public MedicalsessionRecord value4(LocalDate value) {
        setMedicalsessioncolDateregistrationdown(value);
        return this;
    }

    @Override
    public MedicalsessionRecord value5(String value) {
        setMedicalsessioncolDiagnoz(value);
        return this;
    }

    @Override
    public MedicalsessionRecord value6(String value) {
        setMedicalsessioncolMedicaments(value);
        return this;
    }

    @Override
    public MedicalsessionRecord value7(String value) {
        setMedicalsessioncolDiscriptions(value);
        return this;
    }

    @Override
    public MedicalsessionRecord value8(Integer value) {
        setMedicalsessioncolPositionfloor(value);
        return this;
    }

    @Override
    public MedicalsessionRecord value9(Integer value) {
        setMedicalsessioncolPossitionward(value);
        return this;
    }

    @Override
    public MedicalsessionRecord value10(Integer value) {
        setMedicalsessioncol_Possitionbad(value);
        return this;
    }

    @Override
    public MedicalsessionRecord value11(Integer value) {
        setPositionbuildPositionbuildcolId(value);
        return this;
    }

    @Override
    public MedicalsessionRecord value12(Integer value) {
        setDoctorDoctorcolId(value);
        return this;
    }

    @Override
    public MedicalsessionRecord value13(Integer value) {
        setStatusStatuscolId(value);
        return this;
    }

    @Override
    public MedicalsessionRecord values(Integer value1, Integer value2, LocalDateTime value3, LocalDate value4, String value5, String value6, String value7, Integer value8, Integer value9, Integer value10, Integer value11, Integer value12, Integer value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MedicalsessionRecord
     */
    public MedicalsessionRecord() {
        super(Medicalsession.MEDICALSESSION);
    }

    /**
     * Create a detached, initialised MedicalsessionRecord
     */
    public MedicalsessionRecord(Integer medicalsessioncolId, Integer patientPatientcolId, LocalDateTime medicalsessioncolDateregistration, LocalDate medicalsessioncolDateregistrationdown, String medicalsessioncolDiagnoz, String medicalsessioncolMedicaments, String medicalsessioncolDiscriptions, Integer medicalsessioncolPositionfloor, Integer medicalsessioncolPossitionward, Integer medicalsessioncol_Possitionbad, Integer positionbuildPositionbuildcolId, Integer doctorDoctorcolId, Integer statusStatuscolId) {
        super(Medicalsession.MEDICALSESSION);

        set(0, medicalsessioncolId);
        set(1, patientPatientcolId);
        set(2, medicalsessioncolDateregistration);
        set(3, medicalsessioncolDateregistrationdown);
        set(4, medicalsessioncolDiagnoz);
        set(5, medicalsessioncolMedicaments);
        set(6, medicalsessioncolDiscriptions);
        set(7, medicalsessioncolPositionfloor);
        set(8, medicalsessioncolPossitionward);
        set(9, medicalsessioncol_Possitionbad);
        set(10, positionbuildPositionbuildcolId);
        set(11, doctorDoctorcolId);
        set(12, statusStatuscolId);
    }
}
