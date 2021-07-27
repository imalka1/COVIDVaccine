package lk.covid.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SubDivision {

    @Id
    private String subDivisionId;
    private String subDivisionName;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private District district;

    public String getSubDivisionId() {
        return subDivisionId;
    }

    public void setSubDivisionId(String subDivisionId) {
        this.subDivisionId = subDivisionId;
    }

    public String getSubDivisionName() {
        return subDivisionName;
    }

    public void setSubDivisionName(String subDivisionName) {
        this.subDivisionName = subDivisionName;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
}