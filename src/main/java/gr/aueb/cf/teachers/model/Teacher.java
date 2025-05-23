package gr.aueb.cf.teachers.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "teachers")


public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String uuid;

    @Column(unique = true)
    private String vat;

    private String firstname;
    private String lastname;

    @PrePersist
    public void initializeUUID(){
        if (uuid == null) uui


    }

}
