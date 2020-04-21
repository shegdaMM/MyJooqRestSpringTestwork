/*
 * This file is generated by jOOQ.
 */
package ua.at.shegda.patientcards.model.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;

import javax.annotation.Generated;

import ua.at.shegda.patientcards.model.enums.PatientPatientcolSex;


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
public class Patient implements Serializable {

    private static final long serialVersionUID = 1162752830;

    private Integer              patientcolId;
    private String               patientcolName;
    private String               patientcolSurname;
    private String               patientcolOtchestvo;
    private PatientPatientcolSex patientcolSex;
    private LocalDate            patientcolDateofbirth;
    private String               patientcolPost;
    private String               patientcolPasportdata;
    private String               patientcolNumbermedpolis;
    private LocalDate            patientcolDateoutpolis;
    private String               patientcolAddress;
    private String               patientcolPhone;
    private String               patientcolEmail;
    private String               patientcolAlergies;
    private String               patientcolDiscription;

    public Patient() {}

    public Patient(Patient value) {
        this.patientcolId = value.patientcolId;
        this.patientcolName = value.patientcolName;
        this.patientcolSurname = value.patientcolSurname;
        this.patientcolOtchestvo = value.patientcolOtchestvo;
        this.patientcolSex = value.patientcolSex;
        this.patientcolDateofbirth = value.patientcolDateofbirth;
        this.patientcolPost = value.patientcolPost;
        this.patientcolPasportdata = value.patientcolPasportdata;
        this.patientcolNumbermedpolis = value.patientcolNumbermedpolis;
        this.patientcolDateoutpolis = value.patientcolDateoutpolis;
        this.patientcolAddress = value.patientcolAddress;
        this.patientcolPhone = value.patientcolPhone;
        this.patientcolEmail = value.patientcolEmail;
        this.patientcolAlergies = value.patientcolAlergies;
        this.patientcolDiscription = value.patientcolDiscription;
    }

    public Patient(
        Integer              patientcolId,
        String               patientcolName,
        String               patientcolSurname,
        String               patientcolOtchestvo,
        PatientPatientcolSex patientcolSex,
        LocalDate            patientcolDateofbirth,
        String               patientcolPost,
        String               patientcolPasportdata,
        String               patientcolNumbermedpolis,
        LocalDate            patientcolDateoutpolis,
        String               patientcolAddress,
        String               patientcolPhone,
        String               patientcolEmail,
        String               patientcolAlergies,
        String               patientcolDiscription
    ) {
        this.patientcolId = patientcolId;
        this.patientcolName = patientcolName;
        this.patientcolSurname = patientcolSurname;
        this.patientcolOtchestvo = patientcolOtchestvo;
        this.patientcolSex = patientcolSex;
        this.patientcolDateofbirth = patientcolDateofbirth;
        this.patientcolPost = patientcolPost;
        this.patientcolPasportdata = patientcolPasportdata;
        this.patientcolNumbermedpolis = patientcolNumbermedpolis;
        this.patientcolDateoutpolis = patientcolDateoutpolis;
        this.patientcolAddress = patientcolAddress;
        this.patientcolPhone = patientcolPhone;
        this.patientcolEmail = patientcolEmail;
        this.patientcolAlergies = patientcolAlergies;
        this.patientcolDiscription = patientcolDiscription;
    }

    public Integer getPatientcolId() {
        return this.patientcolId;
    }

    public void setPatientcolId(Integer patientcolId) {
        this.patientcolId = patientcolId;
    }

    public String getPatientcolName() {
        return this.patientcolName;
    }

    public void setPatientcolName(String patientcolName) {
        this.patientcolName = patientcolName;
    }

    public String getPatientcolSurname() {
        return this.patientcolSurname;
    }

    public void setPatientcolSurname(String patientcolSurname) {
        this.patientcolSurname = patientcolSurname;
    }

    public String getPatientcolOtchestvo() {
        return this.patientcolOtchestvo;
    }

    public void setPatientcolOtchestvo(String patientcolOtchestvo) {
        this.patientcolOtchestvo = patientcolOtchestvo;
    }

    public PatientPatientcolSex getPatientcolSex() {
        return this.patientcolSex;
    }

    public void setPatientcolSex(PatientPatientcolSex patientcolSex) {
        this.patientcolSex = patientcolSex;
    }

    public LocalDate getPatientcolDateofbirth() {
        return this.patientcolDateofbirth;
    }

    public void setPatientcolDateofbirth(LocalDate patientcolDateofbirth) {
        this.patientcolDateofbirth = patientcolDateofbirth;
    }

    public String getPatientcolPost() {
        return this.patientcolPost;
    }

    public void setPatientcolPost(String patientcolPost) {
        this.patientcolPost = patientcolPost;
    }

    public String getPatientcolPasportdata() {
        return this.patientcolPasportdata;
    }

    public void setPatientcolPasportdata(String patientcolPasportdata) {
        this.patientcolPasportdata = patientcolPasportdata;
    }

    public String getPatientcolNumbermedpolis() {
        return this.patientcolNumbermedpolis;
    }

    public void setPatientcolNumbermedpolis(String patientcolNumbermedpolis) {
        this.patientcolNumbermedpolis = patientcolNumbermedpolis;
    }

    public LocalDate getPatientcolDateoutpolis() {
        return this.patientcolDateoutpolis;
    }

    public void setPatientcolDateoutpolis(LocalDate patientcolDateoutpolis) {
        this.patientcolDateoutpolis = patientcolDateoutpolis;
    }

    public String getPatientcolAddress() {
        return this.patientcolAddress;
    }

    public void setPatientcolAddress(String patientcolAddress) {
        this.patientcolAddress = patientcolAddress;
    }

    public String getPatientcolPhone() {
        return this.patientcolPhone;
    }

    public void setPatientcolPhone(String patientcolPhone) {
        this.patientcolPhone = patientcolPhone;
    }

    public String getPatientcolEmail() {
        return this.patientcolEmail;
    }

    public void setPatientcolEmail(String patientcolEmail) {
        this.patientcolEmail = patientcolEmail;
    }

    public String getPatientcolAlergies() {
        return this.patientcolAlergies;
    }

    public void setPatientcolAlergies(String patientcolAlergies) {
        this.patientcolAlergies = patientcolAlergies;
    }

    public String getPatientcolDiscription() {
        return this.patientcolDiscription;
    }

    public void setPatientcolDiscription(String patientcolDiscription) {
        this.patientcolDiscription = patientcolDiscription;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Patient other = (Patient) obj;
        if (patientcolId == null) {
            if (other.patientcolId != null)
                return false;
        }
        else if (!patientcolId.equals(other.patientcolId))
            return false;
        if (patientcolName == null) {
            if (other.patientcolName != null)
                return false;
        }
        else if (!patientcolName.equals(other.patientcolName))
            return false;
        if (patientcolSurname == null) {
            if (other.patientcolSurname != null)
                return false;
        }
        else if (!patientcolSurname.equals(other.patientcolSurname))
            return false;
        if (patientcolOtchestvo == null) {
            if (other.patientcolOtchestvo != null)
                return false;
        }
        else if (!patientcolOtchestvo.equals(other.patientcolOtchestvo))
            return false;
        if (patientcolSex == null) {
            if (other.patientcolSex != null)
                return false;
        }
        else if (!patientcolSex.equals(other.patientcolSex))
            return false;
        if (patientcolDateofbirth == null) {
            if (other.patientcolDateofbirth != null)
                return false;
        }
        else if (!patientcolDateofbirth.equals(other.patientcolDateofbirth))
            return false;
        if (patientcolPost == null) {
            if (other.patientcolPost != null)
                return false;
        }
        else if (!patientcolPost.equals(other.patientcolPost))
            return false;
        if (patientcolPasportdata == null) {
            if (other.patientcolPasportdata != null)
                return false;
        }
        else if (!patientcolPasportdata.equals(other.patientcolPasportdata))
            return false;
        if (patientcolNumbermedpolis == null) {
            if (other.patientcolNumbermedpolis != null)
                return false;
        }
        else if (!patientcolNumbermedpolis.equals(other.patientcolNumbermedpolis))
            return false;
        if (patientcolDateoutpolis == null) {
            if (other.patientcolDateoutpolis != null)
                return false;
        }
        else if (!patientcolDateoutpolis.equals(other.patientcolDateoutpolis))
            return false;
        if (patientcolAddress == null) {
            if (other.patientcolAddress != null)
                return false;
        }
        else if (!patientcolAddress.equals(other.patientcolAddress))
            return false;
        if (patientcolPhone == null) {
            if (other.patientcolPhone != null)
                return false;
        }
        else if (!patientcolPhone.equals(other.patientcolPhone))
            return false;
        if (patientcolEmail == null) {
            if (other.patientcolEmail != null)
                return false;
        }
        else if (!patientcolEmail.equals(other.patientcolEmail))
            return false;
        if (patientcolAlergies == null) {
            if (other.patientcolAlergies != null)
                return false;
        }
        else if (!patientcolAlergies.equals(other.patientcolAlergies))
            return false;
        if (patientcolDiscription == null) {
            if (other.patientcolDiscription != null)
                return false;
        }
        else if (!patientcolDiscription.equals(other.patientcolDiscription))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.patientcolId == null) ? 0 : this.patientcolId.hashCode());
        result = prime * result + ((this.patientcolName == null) ? 0 : this.patientcolName.hashCode());
        result = prime * result + ((this.patientcolSurname == null) ? 0 : this.patientcolSurname.hashCode());
        result = prime * result + ((this.patientcolOtchestvo == null) ? 0 : this.patientcolOtchestvo.hashCode());
        result = prime * result + ((this.patientcolSex == null) ? 0 : this.patientcolSex.hashCode());
        result = prime * result + ((this.patientcolDateofbirth == null) ? 0 : this.patientcolDateofbirth.hashCode());
        result = prime * result + ((this.patientcolPost == null) ? 0 : this.patientcolPost.hashCode());
        result = prime * result + ((this.patientcolPasportdata == null) ? 0 : this.patientcolPasportdata.hashCode());
        result = prime * result + ((this.patientcolNumbermedpolis == null) ? 0 : this.patientcolNumbermedpolis.hashCode());
        result = prime * result + ((this.patientcolDateoutpolis == null) ? 0 : this.patientcolDateoutpolis.hashCode());
        result = prime * result + ((this.patientcolAddress == null) ? 0 : this.patientcolAddress.hashCode());
        result = prime * result + ((this.patientcolPhone == null) ? 0 : this.patientcolPhone.hashCode());
        result = prime * result + ((this.patientcolEmail == null) ? 0 : this.patientcolEmail.hashCode());
        result = prime * result + ((this.patientcolAlergies == null) ? 0 : this.patientcolAlergies.hashCode());
        result = prime * result + ((this.patientcolDiscription == null) ? 0 : this.patientcolDiscription.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Patient (");

        sb.append(patientcolId);
        sb.append(", ").append(patientcolName);
        sb.append(", ").append(patientcolSurname);
        sb.append(", ").append(patientcolOtchestvo);
        sb.append(", ").append(patientcolSex);
        sb.append(", ").append(patientcolDateofbirth);
        sb.append(", ").append(patientcolPost);
        sb.append(", ").append(patientcolPasportdata);
        sb.append(", ").append(patientcolNumbermedpolis);
        sb.append(", ").append(patientcolDateoutpolis);
        sb.append(", ").append(patientcolAddress);
        sb.append(", ").append(patientcolPhone);
        sb.append(", ").append(patientcolEmail);
        sb.append(", ").append(patientcolAlergies);
        sb.append(", ").append(patientcolDiscription);

        sb.append(")");
        return sb.toString();
    }
}
