package org.iesch.ad.streams.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {

    private int id;
    private String dni;
    private String nombre;
    private String apellidos;
    private String nombreCurso;
    private double nota;
    private int edad;

}
