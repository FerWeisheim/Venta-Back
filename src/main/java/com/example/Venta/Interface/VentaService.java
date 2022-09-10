/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Venta.Interface;

import java.util.List;
import com.example.Venta.Entity.Venta;
/**
 *
 * @author ferna
 */
public interface VentaService {
        
    public List<Venta> getVentas();
    public void saveVenta (Venta venta);
    public void deleteVenta(Integer id);
    public Venta findVentaId(Integer id);    
}
