package com.plaggeij.dto;

public class SpeceminDTO {

    private int speceminId;
    private String latitute;
    private String longitude;
    private String description;

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public int getSpeceminId() {return speceminId;}
    public void setSpeceminId(int speceminId) {this.speceminId = speceminId;}
    public String getLatitude() {return latitute;}
    public void setLatitude(String latitute) {this.latitute = latitute;}
    public String getLongitude() {return longitude;}
    public void setLongitude(String longitude) {this.longitude = longitude;}
    @Override
    public String toString() {
        return speceminId + " " + latitute + " " + longitude + " " + description;
    }
}
