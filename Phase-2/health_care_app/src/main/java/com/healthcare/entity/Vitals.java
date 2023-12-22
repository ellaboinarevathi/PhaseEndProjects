package com.healthcare.entity;

public class Vitals {
    private int id;
    private String select_patients;
    private int low_bp;
    private int high_bp;
    private float spo2;
    private String Recorded_on;
    private String Phno;
    
    public Vitals() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Vitals(String select_patients, int low_bp, int high_bp, float spo2) {
        super();
        this.select_patients = select_patients;
        this.low_bp = low_bp;
        this.high_bp = high_bp;
        this.spo2 = spo2;
        
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getSelect_patients() {
        return select_patients;
    }
    public void setSelect_patients(String select_patients) {
        this.select_patients = select_patients;
    }
    public int getLow_bp() {
        return low_bp;
    }
    public void setLow_bp(int low_bp) {
        this.low_bp = low_bp;
    }
    public int getHigh_bp() {
        return high_bp;
    }
    public void setHigh_bp(int high_bp) {
        this.high_bp = high_bp;
    }
    public float getSpo2() {
        return spo2;
    }
    public void setSpo2(float spo2) {
        this.spo2 = spo2;
    }
    public String getRecordedon() {
        return Recorded_on;
    }
    public void setRecordedon(String Recorded_on) {
        this.Recorded_on = Recorded_on;
    }
    public String getPhno() {
        return Phno;
    }
    public void setPhno(String Phno) {
        this.Phno = Phno;
    }
    
    @Override
    public String toString() {
        return "Vitals [id=" + id + ", select_patients=" + select_patients + ", low_bp=" + low_bp + ", high_bp="
                + high_bp + ", spo2=" + spo2 + "]";
    }


}
