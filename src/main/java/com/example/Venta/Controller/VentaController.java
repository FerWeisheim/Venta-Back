/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Venta.Controller;
import com.example.Venta.Entity.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.Venta.Interface.VentaService;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
/**
 *
 * @author ferna
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class VentaController {
    @Autowired
    
   VentaService iventaService;
    
    @GetMapping("/ventas/traer")
    public List<Venta> getVentas(){
        return iventaService.getVentas();
    }
    
    @PostMapping("/venta/crear")
    public void createVenta(@RequestBody Venta venta){
        iventaService.saveVenta(venta);
    }

    
    @DeleteMapping("venta/borrar/id")
    public void deleteVenta(@PathVariable Integer id){
        iventaService.deleteVenta(id);
    }
    
    @PutMapping("/venta/editar/{id}")
    public Venta editVenta (@PathVariable int id,
                            @RequestBody Venta venta){
        
      venta.setId(id);
      iventaService.saveVenta(venta);
      return venta;
    }
    
    @GetMapping("venta/traer/{id}")
    public Venta findVenta(@PathVariable Integer id){
        return iventaService.findVentaId(id);
    }
    
}
