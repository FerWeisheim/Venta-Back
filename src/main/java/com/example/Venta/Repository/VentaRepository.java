/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Venta.Repository;
import com.example.Venta.Entity.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author ferna
 */
public interface VentaRepository extends JpaRepository<Venta, Integer>{
    
}
