/*
 * This file is generated by jOOQ.
 */
package ua.at.shegda.patientcards.model.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class Status implements Serializable {

    private static final long serialVersionUID = 1948103689;

    private Integer statuscolId;
    private String  statuscolName;
    private String  statuscolDescription;

    public Status() {}

    public Status(Status value) {
        this.statuscolId = value.statuscolId;
        this.statuscolName = value.statuscolName;
        this.statuscolDescription = value.statuscolDescription;
    }

    public Status(
        Integer statuscolId,
        String  statuscolName,
        String  statuscolDescription
    ) {
        this.statuscolId = statuscolId;
        this.statuscolName = statuscolName;
        this.statuscolDescription = statuscolDescription;
    }

    public Integer getStatuscolId() {
        return this.statuscolId;
    }

    public void setStatuscolId(Integer statuscolId) {
        this.statuscolId = statuscolId;
    }

    public String getStatuscolName() {
        return this.statuscolName;
    }

    public void setStatuscolName(String statuscolName) {
        this.statuscolName = statuscolName;
    }

    public String getStatuscolDescription() {
        return this.statuscolDescription;
    }

    public void setStatuscolDescription(String statuscolDescription) {
        this.statuscolDescription = statuscolDescription;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Status other = (Status) obj;
        if (statuscolId == null) {
            if (other.statuscolId != null)
                return false;
        }
        else if (!statuscolId.equals(other.statuscolId))
            return false;
        if (statuscolName == null) {
            if (other.statuscolName != null)
                return false;
        }
        else if (!statuscolName.equals(other.statuscolName))
            return false;
        if (statuscolDescription == null) {
            if (other.statuscolDescription != null)
                return false;
        }
        else if (!statuscolDescription.equals(other.statuscolDescription))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.statuscolId == null) ? 0 : this.statuscolId.hashCode());
        result = prime * result + ((this.statuscolName == null) ? 0 : this.statuscolName.hashCode());
        result = prime * result + ((this.statuscolDescription == null) ? 0 : this.statuscolDescription.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Status (");

        sb.append(statuscolId);
        sb.append(", ").append(statuscolName);
        sb.append(", ").append(statuscolDescription);

        sb.append(")");
        return sb.toString();
    }
}
