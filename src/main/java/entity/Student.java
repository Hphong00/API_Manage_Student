package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigInteger;
@Data
@Entity
@XmlRootElement
@Table(name = "student")
public class Student implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID",nullable = false)
    private int id;
    @Basic
    @Column(name = "FULLNAME",nullable = false)
    private String fullname;
    @Basic
    @Column(name = "BIRTHDAY",nullable = false)
    private String birthday;
    @Basic
    @Column(name = "CLASSNAME",nullable = false)
    private String classname;
    @Basic
    @Column(name = "MAJOR",nullable = false)
    private String major;
    @Basic
    @Column(name = "HOMETOWN",nullable = false)
    private String hometown;
    @Basic
    @Column(name = "GENDER",nullable = false)
    private String gender;
    @Basic
    @Column(name = "AVERAGEMARK",nullable = false)
    private String averagemark;
}
