package com.company.Incapsulation;

public class Person {

    private String imya;
    private String prizv;
    private int vik;
    private double zrist;
    private String profesiya;

    String getFullNaame(){
        return imya + " " + prizv;
    }

    String getFullInfo(){
        return getFullNaame() + " (vik: " + vik + ", Zrist: " + zrist + ")";
    }

    public String getImya() {
        return imya;
    }

    public void setImya(String imya) {
        this.imya = imya;
    }

    public String getPrizv() {
        return prizv;
    }

    public void setPrizv(String prizv) {
        this.prizv = prizv;
    }

    public int getVik() {
        return vik;
    }

    public void setVik(int vik) {
        this.vik = vik;
    }

    public double getZrist() {
        return zrist;
    }

    public void setZrist(double zrist) {
        this.zrist = zrist;
    }

    public String getProfesiya() {
        return profesiya;
    }

    public void setProfesiya(String profesiya) {
        this.profesiya = profesiya;
    }
}
