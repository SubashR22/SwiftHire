package com.example.quickhirebackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "matches")
public class Matches {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "matchid")
    private Integer matchId;

    @Column(name = "matchpercentage")
    private Integer matchPercentage;

    @Column(name = "professionalid", nullable = true) 
    private Integer professionalId;

    @Column(name = "jobid", nullable = true) 
    private Integer jobId;

    @Column(name = "staffid", nullable = true) 
    private Integer staffId;

    public AllTypesEnums.MatchType getStatus() {
        return status;
    }

    public void setStatus(AllTypesEnums.MatchType status) {
        this.status = status;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private AllTypesEnums.MatchType status;

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    @Column(name="notification")
    private String notification;

//    @Enumerated(EnumType.STRING)
//    @Column(name = "matchType")
//    private AllTypesEnums.MatchType matchType;



    public Matches() {
    }

    
    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public Integer getMatchPercentage() {
        return matchPercentage;
    }

    public void setMatchPercentage(Integer matchPercentage) {
        this.matchPercentage = matchPercentage;
    }

    public Integer getProfessionalId() {
        return professionalId;
    }

    public void setProfessionalId(Integer professionalId) {
        this.professionalId = professionalId;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }


}
