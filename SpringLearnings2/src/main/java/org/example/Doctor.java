package org.example;

import javax.xml.transform.stream.StreamSource;

public class Doctor {
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void assist(){
        System.out.println("This is the assist method in Doctor class");
    }
}
