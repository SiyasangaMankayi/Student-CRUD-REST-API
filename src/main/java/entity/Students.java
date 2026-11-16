package com.example.senddatabase.Entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor

@NoArgsConstructor
@Entity
@Table (name = "Students")

public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "firstname", nullable = false)
    private String firstname;


    @Column (name = "lastname", nullable = false)
    private String lastname;

    @Column (name = "email", nullable = false, unique = true)

    private String email;





}
