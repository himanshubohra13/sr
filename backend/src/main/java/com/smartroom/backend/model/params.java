package com.smartroom.backend.model;

import java.util.LinkedHashMap;

public class params {
    private String sex;

    private Integer age;

    private String address;

    private String famsize;

    private String Pstatus;

    private Integer Medu;

    private Integer Fedu;

    private String Mjob;

    private String Fjob;

    private Integer traveltime;

    private Integer studytime;

    private Integer failures;

    private String schoolsup;

    private String famsup;

    private String paid;

    private String activities;

    private String nursery;

    private String higher;

    private String internet;

    private Integer famrel;

    private Integer freetime;

    private Integer health;

    private Integer absences;

    private Integer G1;

    private Integer G2;

    public params() {
    }

    public params(String sex, Integer age, String address, String famsize, String pstatus, Integer medu, Integer fedu, String mjob, String fjob, Integer traveltime, Integer studytime, Integer failures, String schoolsup, String famsup, String paid, String activities, String nursery, String higher, String internet, Integer famrel, Integer freetime, Integer health, Integer absences, Integer g1, Integer g2) {
        this.sex = sex;
        this.age = age;
        this.address = address;
        this.famsize = famsize;
        Pstatus = pstatus;
        Medu = medu;
        Fedu = fedu;
        Mjob = mjob;
        Fjob = fjob;
        this.traveltime = traveltime;
        this.studytime = studytime;
        this.failures = failures;
        this.schoolsup = schoolsup;
        this.famsup = famsup;
        this.paid = paid;
        this.activities = activities;
        this.nursery = nursery;
        this.higher = higher;
        this.internet = internet;
        this.famrel = famrel;
        this.freetime = freetime;
        this.health = health;
        this.absences = absences;
        G1 = g1;
        G2 = g2;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFamsize() {
        return famsize;
    }

    public void setFamsize(String famsize) {
        this.famsize = famsize;
    }

    public String getPstatus() {
        return Pstatus;
    }

    public void setPstatus(String pstatus) {
        Pstatus = pstatus;
    }

    public Integer getMedu() {
        return Medu;
    }

    public void setMedu(Integer medu) {
        Medu = medu;
    }

    public Integer getFedu() {
        return Fedu;
    }

    public void setFedu(Integer fedu) {
        Fedu = fedu;
    }

    public String getMjob() {
        return Mjob;
    }

    public void setMjob(String mjob) {
        Mjob = mjob;
    }

    public String getFjob() {
        return Fjob;
    }

    public void setFjob(String fjob) {
        Fjob = fjob;
    }

    public Integer getTraveltime() {
        return traveltime;
    }

    public void setTraveltime(Integer traveltime) {
        this.traveltime = traveltime;
    }

    public Integer getStudytime() {
        return studytime;
    }

    public void setStudytime(Integer studytime) {
        this.studytime = studytime;
    }

    public Integer getFailures() {
        return failures;
    }

    public void setFailures(Integer failures) {
        this.failures = failures;
    }

    public String getSchoolsup() {
        return schoolsup;
    }

    public void setSchoolsup(String schoolsup) {
        this.schoolsup = schoolsup;
    }

    public String getFamsup() {
        return famsup;
    }

    public void setFamsup(String famsup) {
        this.famsup = famsup;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }

    public String getNursery() {
        return nursery;
    }

    public void setNursery(String nursery) {
        this.nursery = nursery;
    }

    public String getHigher() {
        return higher;
    }

    public void setHigher(String higher) {
        this.higher = higher;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public Integer getFamrel() {
        return famrel;
    }

    public void setFamrel(Integer famrel) {
        this.famrel = famrel;
    }

    public Integer getFreetime() {
        return freetime;
    }

    public void setFreetime(Integer freetime) {
        this.freetime = freetime;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getAbsences() {
        return absences;
    }

    public void setAbsences(Integer absences) {
        this.absences = absences;
    }

    public Integer getG1() {
        return G1;
    }

    public void setG1(Integer g1) {
        G1 = g1;
    }

    public Integer getG2() {
        return G2;
    }

    public void setG2(Integer g2) {
        G2 = g2;
    }

    @Override
    public String toString() {
        return "params{" +
                "sex='" + sex + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", famsize='" + famsize + '\'' +
                ", Pstatus='" + Pstatus + '\'' +
                ", Medu=" + Medu +
                ", Fedu=" + Fedu +
                ", Mjob='" + Mjob + '\'' +
                ", Fjob='" + Fjob + '\'' +
                ", traveltime=" + traveltime +
                ", studytime=" + studytime +
                ", failures=" + failures +
                ", schoolsup='" + schoolsup + '\'' +
                ", famsup='" + famsup + '\'' +
                ", paid='" + paid + '\'' +
                ", activities='" + activities + '\'' +
                ", nursery='" + nursery + '\'' +
                ", higher='" + higher + '\'' +
                ", internet='" + internet + '\'' +
                ", famrel=" + famrel +
                ", freetime=" + freetime +
                ", health=" + health +
                ", absences=" + absences +
                ", G1=" + G1 +
                ", G2=" + G2 +
                '}';
    }
//    LinkedHashMap<String,Object> hm = new LinkedHashMap<>();
//
//    public params() {
//    }
//
//    public params(LinkedHashMap<String, Object> hm) {
//        this.hm = hm;
//    }
//
//    public LinkedHashMap<String, Object> getHm() {
//        return hm;
//    }
//
//    public void setHm(LinkedHashMap<String, Object> hm) {
//        this.hm = hm;
//    }
//
//    @Override
//    public String toString() {
//        return "params{" +
//                "hm=" + hm +
//                '}';
//    }
}
