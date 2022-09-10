/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Venta.Entity;

import java.sql.Time;
import java.util.Date;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
/**
 *
 * @author ferna
 */
@Entity
@Setter
@Getter
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   
    private Date fecha_operacion;
    
    private String entidad;
    
    private String hora_operacion;
 
    private String lote_cupo;
    
    private int nro_tarjeta;
    
    private Double precio;
    
    private int cuotas;
    
    private int compra;
    
}
