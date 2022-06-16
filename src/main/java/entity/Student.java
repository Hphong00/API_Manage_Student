package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
        import java.util.Objects;
@Data
@Entity(name = "student")
@Table(name = "student")
@AllArgsConstructor
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
    private String birthday;
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
    private String averagemark;

    public Student(String fullname, String birthday, String classname, String major, String hometown, String gender, String averagemark) {
        this.fullname = fullname;
        this.birthday = birthday;
        this.classname = classname;
        this.major = major;
        this.hometown = hometown;
        this.gender = gender;
        this.averagemark = averagemark;
    }

    public Student() {

    }
}
