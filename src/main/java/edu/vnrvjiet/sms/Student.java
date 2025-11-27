package edu.vnrvjiet.sms;

import lombok.*;
import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;


// this is the Domain object
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "student")
public class Student {
    @Id
    private Integer id;
    private String name;
    private Integer maths;
    private Integer physics;
    private Integer chemistry;
}
