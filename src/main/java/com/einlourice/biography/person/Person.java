package com.einlourice.biography.person;

import com.einlourice.biography.common.domain.BaseDomain;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;

@Data

public class Person extends BaseDomain {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column
    private String lastName;
    @Column
    private String firstName;
    @Column
    private String nickName;
    @Column
    private LocalDate birthDate;
    @Column
    private String placeOfBirth;

}
