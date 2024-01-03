package Models;

import java.time.LocalDate;
import java.util.Date;

public class Person {

    private String fullname;
    private String email;
    private String phone; // with country code included it
    // looks like this +12312313
    private String address;
    private LocalDate dob;

    public Person(String fullname, String email, String phone, String address, LocalDate dob) {
        setFullname(fullname);
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.dob = dob;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        fullname = fullname.trim();
        String name [] = fullname.split(" ");
        for (String x : name) x= (x.charAt(0)+"").toUpperCase()+x.substring(1);
        this.fullname = name[0]+" "+name[1];
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public static void formatinfo(){
        System.out.println("street + no + extra appt info ends with postcode ");
        System.out.println("phone number should enter like this : \"+country phone number \"");
    }
}
