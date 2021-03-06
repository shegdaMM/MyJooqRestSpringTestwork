/*
 * This file is generated by jOOQ.
 */
package ua.at.shegda.patientcards.model.tables.records;


import java.time.LocalDate;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;

import ua.at.shegda.patientcards.model.tables.Doctor;


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
public class DoctorRecord extends UpdatableRecordImpl<DoctorRecord> implements Record13<Integer, String, String, String, LocalDate, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 588708082;

    /**
     * Setter for <code>patientregsys.doctor.Doctorcol_ID</code>.
     */
    public void setDoctorcolId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>patientregsys.doctor.Doctorcol_ID</code>.
     */
    public Integer getDoctorcolId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>patientregsys.doctor.Doctorcol_name</code>.
     */
    public void setDoctorcolName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>patientregsys.doctor.Doctorcol_name</code>.
     */
    public String getDoctorcolName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>patientregsys.doctor.Doctorcol_surname</code>.
     */
    public void setDoctorcolSurname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>patientregsys.doctor.Doctorcol_surname</code>.
     */
    public String getDoctorcolSurname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>patientregsys.doctor.Doctorcol_otchestvo</code>.
     */
    public void setDoctorcolOtchestvo(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>patientregsys.doctor.Doctorcol_otchestvo</code>.
     */
    public String getDoctorcolOtchestvo() {
        return (String) get(3);
    }

    /**
     * Setter for <code>patientregsys.doctor.Doctorcol_dateOfBirth</code>.
     */
    public void setDoctorcolDateofbirth(LocalDate value) {
        set(4, value);
    }

    /**
     * Getter for <code>patientregsys.doctor.Doctorcol_dateOfBirth</code>.
     */
    public LocalDate getDoctorcolDateofbirth() {
        return (LocalDate) get(4);
    }

    /**
     * Setter for <code>patientregsys.doctor.Doctorcol_discription</code>.
     */
    public void setDoctorcolDiscription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>patientregsys.doctor.Doctorcol_discription</code>.
     */
    public String getDoctorcolDiscription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>patientregsys.doctor.Doctorcol_specialnost</code>.
     */
    public void setDoctorcolSpecialnost(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>patientregsys.doctor.Doctorcol_specialnost</code>.
     */
    public String getDoctorcolSpecialnost() {
        return (String) get(6);
    }

    /**
     * Setter for <code>patientregsys.doctor.Doctorcol_university</code>.
     */
    public void setDoctorcolUniversity(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>patientregsys.doctor.Doctorcol_university</code>.
     */
    public String getDoctorcolUniversity() {
        return (String) get(7);
    }

    /**
     * Setter for <code>patientregsys.doctor.Doctorcol_address</code>.
     */
    public void setDoctorcolAddress(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>patientregsys.doctor.Doctorcol_address</code>.
     */
    public String getDoctorcolAddress() {
        return (String) get(8);
    }

    /**
     * Setter for <code>patientregsys.doctor.Doctorcol_phone</code>.
     */
    public void setDoctorcolPhone(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>patientregsys.doctor.Doctorcol_phone</code>.
     */
    public String getDoctorcolPhone() {
        return (String) get(9);
    }

    /**
     * Setter for <code>patientregsys.doctor.login</code>.
     */
    public void setLogin(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>patientregsys.doctor.login</code>.
     */
    public String getLogin() {
        return (String) get(10);
    }

    /**
     * Setter for <code>patientregsys.doctor.password</code>.
     */
    public void setPassword(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>patientregsys.doctor.password</code>.
     */
    public String getPassword() {
        return (String) get(11);
    }

    /**
     * Setter for <code>patientregsys.doctor.type</code>. doctor - for doctors
 admin - for administator of sistem
     */
    public void setType(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>patientregsys.doctor.type</code>. doctor - for doctors
 admin - for administator of sistem
     */
    public String getType() {
        return (String) get(12);
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
    public Row13<Integer, String, String, String, LocalDate, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<Integer, String, String, String, LocalDate, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Doctor.DOCTOR.DOCTORCOL_ID;
    }

    @Override
    public Field<String> field2() {
        return Doctor.DOCTOR.DOCTORCOL_NAME;
    }

    @Override
    public Field<String> field3() {
        return Doctor.DOCTOR.DOCTORCOL_SURNAME;
    }

    @Override
    public Field<String> field4() {
        return Doctor.DOCTOR.DOCTORCOL_OTCHESTVO;
    }

    @Override
    public Field<LocalDate> field5() {
        return Doctor.DOCTOR.DOCTORCOL_DATEOFBIRTH;
    }

    @Override
    public Field<String> field6() {
        return Doctor.DOCTOR.DOCTORCOL_DISCRIPTION;
    }

    @Override
    public Field<String> field7() {
        return Doctor.DOCTOR.DOCTORCOL_SPECIALNOST;
    }

    @Override
    public Field<String> field8() {
        return Doctor.DOCTOR.DOCTORCOL_UNIVERSITY;
    }

    @Override
    public Field<String> field9() {
        return Doctor.DOCTOR.DOCTORCOL_ADDRESS;
    }

    @Override
    public Field<String> field10() {
        return Doctor.DOCTOR.DOCTORCOL_PHONE;
    }

    @Override
    public Field<String> field11() {
        return Doctor.DOCTOR.LOGIN;
    }

    @Override
    public Field<String> field12() {
        return Doctor.DOCTOR.PASSWORD;
    }

    @Override
    public Field<String> field13() {
        return Doctor.DOCTOR.TYPE;
    }

    @Override
    public Integer component1() {
        return getDoctorcolId();
    }

    @Override
    public String component2() {
        return getDoctorcolName();
    }

    @Override
    public String component3() {
        return getDoctorcolSurname();
    }

    @Override
    public String component4() {
        return getDoctorcolOtchestvo();
    }

    @Override
    public LocalDate component5() {
        return getDoctorcolDateofbirth();
    }

    @Override
    public String component6() {
        return getDoctorcolDiscription();
    }

    @Override
    public String component7() {
        return getDoctorcolSpecialnost();
    }

    @Override
    public String component8() {
        return getDoctorcolUniversity();
    }

    @Override
    public String component9() {
        return getDoctorcolAddress();
    }

    @Override
    public String component10() {
        return getDoctorcolPhone();
    }

    @Override
    public String component11() {
        return getLogin();
    }

    @Override
    public String component12() {
        return getPassword();
    }

    @Override
    public String component13() {
        return getType();
    }

    @Override
    public Integer value1() {
        return getDoctorcolId();
    }

    @Override
    public String value2() {
        return getDoctorcolName();
    }

    @Override
    public String value3() {
        return getDoctorcolSurname();
    }

    @Override
    public String value4() {
        return getDoctorcolOtchestvo();
    }

    @Override
    public LocalDate value5() {
        return getDoctorcolDateofbirth();
    }

    @Override
    public String value6() {
        return getDoctorcolDiscription();
    }

    @Override
    public String value7() {
        return getDoctorcolSpecialnost();
    }

    @Override
    public String value8() {
        return getDoctorcolUniversity();
    }

    @Override
    public String value9() {
        return getDoctorcolAddress();
    }

    @Override
    public String value10() {
        return getDoctorcolPhone();
    }

    @Override
    public String value11() {
        return getLogin();
    }

    @Override
    public String value12() {
        return getPassword();
    }

    @Override
    public String value13() {
        return getType();
    }

    @Override
    public DoctorRecord value1(Integer value) {
        setDoctorcolId(value);
        return this;
    }

    @Override
    public DoctorRecord value2(String value) {
        setDoctorcolName(value);
        return this;
    }

    @Override
    public DoctorRecord value3(String value) {
        setDoctorcolSurname(value);
        return this;
    }

    @Override
    public DoctorRecord value4(String value) {
        setDoctorcolOtchestvo(value);
        return this;
    }

    @Override
    public DoctorRecord value5(LocalDate value) {
        setDoctorcolDateofbirth(value);
        return this;
    }

    @Override
    public DoctorRecord value6(String value) {
        setDoctorcolDiscription(value);
        return this;
    }

    @Override
    public DoctorRecord value7(String value) {
        setDoctorcolSpecialnost(value);
        return this;
    }

    @Override
    public DoctorRecord value8(String value) {
        setDoctorcolUniversity(value);
        return this;
    }

    @Override
    public DoctorRecord value9(String value) {
        setDoctorcolAddress(value);
        return this;
    }

    @Override
    public DoctorRecord value10(String value) {
        setDoctorcolPhone(value);
        return this;
    }

    @Override
    public DoctorRecord value11(String value) {
        setLogin(value);
        return this;
    }

    @Override
    public DoctorRecord value12(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public DoctorRecord value13(String value) {
        setType(value);
        return this;
    }

    @Override
    public DoctorRecord values(Integer value1, String value2, String value3, String value4, LocalDate value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13) {
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
     * Create a detached DoctorRecord
     */
    public DoctorRecord() {
        super(Doctor.DOCTOR);
    }

    /**
     * Create a detached, initialised DoctorRecord
     */
    public DoctorRecord(Integer doctorcolId, String doctorcolName, String doctorcolSurname, String doctorcolOtchestvo, LocalDate doctorcolDateofbirth, String doctorcolDiscription, String doctorcolSpecialnost, String doctorcolUniversity, String doctorcolAddress, String doctorcolPhone, String login, String password, String type) {
        super(Doctor.DOCTOR);

        set(0, doctorcolId);
        set(1, doctorcolName);
        set(2, doctorcolSurname);
        set(3, doctorcolOtchestvo);
        set(4, doctorcolDateofbirth);
        set(5, doctorcolDiscription);
        set(6, doctorcolSpecialnost);
        set(7, doctorcolUniversity);
        set(8, doctorcolAddress);
        set(9, doctorcolPhone);
        set(10, login);
        set(11, password);
        set(12, type);
    }
}
