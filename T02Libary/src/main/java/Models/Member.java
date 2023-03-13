package T02Libary.src.main.java.Models;

import java.util.Date;

public class Member {

//    # member extends person
//    > memberid int
//    > username string
//    > password string
//    > status int 0 pasif 1 aktif -1 cezali
//    > MerbershipStarting date *
//            > LastLoginAt time *
//


    //fields
    private int membeId;
    private String username;
    private String password;
    private int status;
    private Date MerbershipStarting;

    //constructors

    public Member() {
    }

    public Member(int membeId, String username, String password, int status, Date merbershipStarting) {
        this.membeId = membeId;
        this.username = username;
        this.password = password;
        this.status = status;
        MerbershipStarting = merbershipStarting;
    }


    //getter setter

    public int getMembeId() {
        return membeId;
    }

    public void setMembeId(int membeId) {
        this.membeId = membeId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getMerbershipStarting() {
        return MerbershipStarting;
    }

    public void setMerbershipStarting(Date merbershipStarting) {
        MerbershipStarting = merbershipStarting;
    }


    //toString

    @Override
    public String toString() {
        return "Member{" +
                "membeId=" + membeId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", MerbershipStarting=" + MerbershipStarting +
                '}';
    }
}
