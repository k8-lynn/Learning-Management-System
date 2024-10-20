/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system;

/**
 *
 * @author nisha
 */
public abstract class Lecturer {
    protected String KeyId;
    protected String KeyPass;
    protected String name;
    protected String ic;
    protected String dob;
    protected String gender;
    protected String number;
    protected String email;
    protected String school;
    protected String role;


    public abstract String markGrade(int mark);
    public abstract void Feedback();
}

class ConcreteLecturer extends Lecturer {
    
    
    public ConcreteLecturer(String keyId, String keyPass, String name, String ic, String dob, String gender, String email, String number, String school, String role) {
        this.KeyId = keyId;
        this.KeyPass = keyPass;
        this.name = name;
        this.ic = ic;
        this.number = number;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
        this.school = school;
        this.role = role;
    }
    
    
    public ConcreteLecturer(String keyId, String name,String school, String role) {
        this.KeyId = keyId;
        this.name = name;
        this.school = school;
        this.role = role;   
    }
    
    public String getKeyId() {
        return KeyId;
    }

    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    public String getKeyPass() {
        return KeyPass;
    }

    public void setKeyPass(String KeyPass) {
        this.KeyPass = KeyPass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    
    public Object[] toObjectArray() {
    
        return new Object[]{KeyId, KeyPass, name, ic, dob, gender, email, number, school, role};
    }
    
    public Object[] toObjectArray2() {
    
        return new Object[]{KeyId, name, school, role};
    }

    @Override
    public String toString() {
        return KeyId + "," + KeyPass+ "," + name + "," + ic + "," + dob + "," + gender + "," + email + "," + number + ","  + school + ","  + role  ;
    }
    
    @Override
    public String markGrade(int mark){
        return "";
    }
    
    public void Feedback(){
        System.out.println("None");
    }
    
    
    
}

class Supervisor extends Lecturer{
    
    public int mark;
    public String grade;
    
    @Override
    public String markGrade(int mark){
        if(mark >= 80 && mark <= 100){
            grade = "A";
        }
        else if(mark >= 60 && mark <= 79){
            grade = "B";
        }
        else if(mark >= 50 && mark <= 59){
            grade = "C";
        }
        else if(mark >= 0 && mark <= 49){
            grade = "F";
        }
        return grade;
    }
    public void Feedback(){
        System.out.println("Supervisor feedback");
    }
}

class SecondMarker extends Lecturer{
    public int mark;
    public String grade;
    
    @Override
    public String markGrade(int mark){
        if(mark >= 80 && mark <= 100){
            grade = "A";
        }
        else if(mark >= 60 && mark <= 79){
            grade = "B";
        }
        else if(mark >= 50 && mark <= 59){
            grade = "C";
        }
        else if(mark >= 0 && mark <= 49){
            grade = "F";
        }
        return grade;
    }
    public void Feedback(){
        System.out.println("Second Marker Feedback");
    }
}







