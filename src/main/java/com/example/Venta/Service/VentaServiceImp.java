/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Venta.Service;
import com.example.Venta.Entity.Venta;
import com.example.Venta.Interface.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Venta.Repository.VentaRepository;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;


/**
 *
 * @author ferna
 */
@Service
@CrossOrigin(origins = "http://localhost:4200")
public class VentaServiceImp implements VentaService{
    @Autowired
     VentaRepository iventaRepository;
    
    @Override
    public List<Venta> getVentas(){
       List<Venta> venta = iventaRepository.findAll();
               return venta;
    }
    
    @Override
    public void saveVenta(Venta venta){
        iventaRepository.save(venta);
    }
    
    @Override
    public void deleteVenta(Integer id){
        iventaRepository.deleteById(id);
    }
    
    @Override
    public Venta findVentaId(Integer id){
        Venta venta = iventaRepository.findById(id).orElse(null);
        return venta;
    }

    
}
