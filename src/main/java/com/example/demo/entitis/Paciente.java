package com.example.demo.entitis;

import java.security.Timestamp;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Indexed;

import lombok.Data;

@Table(name=paciente)
@Entity
@Data

public class Paciente {

    @Id
    @SequenceGenerator(name="paciente_id_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="paciente_id_seq")

    private Integer id;
    private String documento;
    private String nombre;
    private String apellido;
    private String email;
    private String genero;
    private Date fechanacimeinto;
    private String telefono;
    private String direccion;
    private boolean peso;
    private boolean estatura; 

}
