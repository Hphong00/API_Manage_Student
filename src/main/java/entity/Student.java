package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;
import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
@Entity(name = "student")
public class Student implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;
    @Basic
    @Column(name = "FULLNAME")
    private String fullname;
    @Basic
    @Column(name = "BIRTHDAY")
    private Date birthday;
    @Basic
    @Column(name = "CLASSNAME")
    private String classname;
    @Basic
    @Column(name = "MAJOR")
    private String major;
    @Basic
    @Column(name = "HOMETOWN")
    private String hometown;
    @Basic
    @Column(name = "GENDER")
    private String gender;
    @Basic
    @Column(name = "AVERAGEMARK")
    private short averagemark;

    public Student(String fullname, Date birthday, String classname, String major, String hometown, String gender, short averagemark) {
        this.fullname = fullname;
        this.birthday = birthday;
        this.classname = classname;
        this.major = major;
        this.hometown = hometown;
        this.gender = gender;
        this.averagemark = averagemark;
    }
}
