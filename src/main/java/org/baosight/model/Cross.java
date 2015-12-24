package org.baosight.model;

public class Cross {
    private Integer crossid;

    private Short regionid;

    private Integer subregionid;

    private Short regioncrossid;

    private String relatedcrossid;

    private String crossname;

    private Short maxg;

    private Short ming;

    private Integer hasclosecross;

    private Short iskeycross;

    private Integer cycletype;

    private Short optibaseplanid;

    private Long propparamversion;

    private Short yellowflashtime;

    private Short allredtime;

    private Short controlfunction;

    private Short version;

    public Integer getCrossid() {
        return crossid;
    }

    public void setCrossid(Integer crossid) {
        this.crossid = crossid;
    }

    public Short getRegionid() {
        return regionid;
    }

    public void setRegionid(Short regionid) {
        this.regionid = regionid;
    }

    public Integer getSubregionid() {
        return subregionid;
    }

    public void setSubregionid(Integer subregionid) {
        this.subregionid = subregionid;
    }

    public Short getRegioncrossid() {
        return regioncrossid;
    }

    public void setRegioncrossid(Short regioncrossid) {
        this.regioncrossid = regioncrossid;
    }

    public String getRelatedcrossid() {
        return relatedcrossid;
    }

    public void setRelatedcrossid(String relatedcrossid) {
        this.relatedcrossid = relatedcrossid == null ? null : relatedcrossid.trim();
    }

    public String getCrossname() {
        return crossname;
    }

    public void setCrossname(String crossname) {
        this.crossname = crossname == null ? null : crossname.trim();
    }

    public Short getMaxg() {
        return maxg;
    }

    public void setMaxg(Short maxg) {
        this.maxg = maxg;
    }

    public Short getMing() {
        return ming;
    }

    public void setMing(Short ming) {
        this.ming = ming;
    }

    public Integer getHasclosecross() {
        return hasclosecross;
    }

    public void setHasclosecross(Integer hasclosecross) {
        this.hasclosecross = hasclosecross;
    }

    public Short getIskeycross() {
        return iskeycross;
    }

    public void setIskeycross(Short iskeycross) {
        this.iskeycross = iskeycross;
    }

    public Integer getCycletype() {
        return cycletype;
    }

    public void setCycletype(Integer cycletype) {
        this.cycletype = cycletype;
    }

    public Short getOptibaseplanid() {
        return optibaseplanid;
    }

    public void setOptibaseplanid(Short optibaseplanid) {
        this.optibaseplanid = optibaseplanid;
    }

    public Long getPropparamversion() {
        return propparamversion;
    }

    public void setPropparamversion(Long propparamversion) {
        this.propparamversion = propparamversion;
    }

    public Short getYellowflashtime() {
        return yellowflashtime;
    }

    public void setYellowflashtime(Short yellowflashtime) {
        this.yellowflashtime = yellowflashtime;
    }

    public Short getAllredtime() {
        return allredtime;
    }

    public void setAllredtime(Short allredtime) {
        this.allredtime = allredtime;
    }

    public Short getControlfunction() {
        return controlfunction;
    }

    public void setControlfunction(Short controlfunction) {
        this.controlfunction = controlfunction;
    }

    public Short getVersion() {
        return version;
    }

    public void setVersion(Short version) {
        this.version = version;
    }
}