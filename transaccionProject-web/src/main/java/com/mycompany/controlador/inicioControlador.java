/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controlador;

import com.mycompany.entity.Articulo;
import com.mycompany.entity.Proveedor;
import com.mycompany.entity.Vendedor;
import com.mycompany.interfaces.IArticuloFacade;
import com.mycompany.transacciones.EjbNOTransaccional;
import com.mycompany.transacciones.EjbTransaccional;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author DaveHell
 */
@Named(value = "inicioControlador")
@RequestScoped
public class inicioControlador {
    
    @EJB
    EjbNOTransaccional noTransaccional;
    
    @EJB
    EjbTransaccional transaccional;
    
    private String nombreArticulo;
    private int costoArticulo;
    private String nombreProveedor;
    private String descripcionProveedor;
    private String nombreVendedor;

    public inicioControlador(String nombreArticulo, int costoArticulo, String nombreProveedor, String descripcionProveedor, String nombreVendedor) {
        this.nombreArticulo = nombreArticulo;
        this.costoArticulo = costoArticulo;
        this.nombreProveedor = nombreProveedor;
        this.descripcionProveedor = descripcionProveedor;
        this.nombreVendedor = nombreVendedor;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public int getCostoArticulo() {
        return costoArticulo;
    }

    public void setCostoArticulo(int costoArticulo) {
        this.costoArticulo = costoArticulo;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getDescripcionProveedor() {
        return descripcionProveedor;
    }

    public void setDescripcionProveedor(String descripcionProveedor) {
        this.descripcionProveedor = descripcionProveedor;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }
    
    
    /**
     * Creates a new instance of inicioControlador
     */
    public inicioControlador() {
    }
    
    public void notransaccionalREQUIRED(){
        Articulo articulo = new Articulo(getNombreArticulo(), getCostoArticulo());
        Proveedor proveedor = new Proveedor(getNombreProveedor(), getDescripcionProveedor());        
        try {
            noTransaccional.crearArticuloProveedorREQUIRED(articulo, proveedor);
        FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Agregado",
                    "Agregado con Exito!"));
        } catch (Exception e) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error",
                    "Algunas transacciones no se completaton " ));
        }
    }
    public void notransaccionalREQUIRES_NEW(){
        Articulo articulo = new Articulo(getNombreArticulo(), getCostoArticulo());
        Proveedor proveedor = new Proveedor(getNombreProveedor(), getDescripcionProveedor());        
        try {
            noTransaccional.crearArticuloProveedorREQUIRES_NEW(articulo, proveedor);
        FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Agregado",
                    "Agregado con Exito!"));
        } catch (Exception e) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error",
                    "Algunas transacciones no se completaton " ));
        }
    }
    public void notransaccionalSUPPORTS(){
        Articulo articulo = new Articulo(getNombreArticulo(), getCostoArticulo());
        Proveedor proveedor = new Proveedor(getNombreProveedor(), getDescripcionProveedor());        
        try {
            noTransaccional.crearArticuloProveedorSUPPORTS(articulo, proveedor);
        FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Agregado",
                    "Agregado con Exito!"));
        } catch (Exception e) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error",
                    "Algunas transacciones no se completaton " ));
        }
    }
    public void notransaccionalMANDATORY(){
        Articulo articulo = new Articulo(getNombreArticulo(), getCostoArticulo());
        Proveedor proveedor = new Proveedor(getNombreProveedor(), getDescripcionProveedor());        
        try {
            noTransaccional.crearArticuloProveedorMANDATORY(articulo, proveedor);
        FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Agregado",
                    "Agregado con Exito!"));
        } catch (Exception e) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error",
                    "Algunas transacciones no se completaton " ));
        }
    }
    public void notransaccionalNOT_SUPPORTED(){
        Articulo articulo = new Articulo(getNombreArticulo(), getCostoArticulo());
        Proveedor proveedor = new Proveedor(getNombreProveedor(), getDescripcionProveedor());        
        try {
            noTransaccional.crearArticuloProveedorNOT_SUPPORTED(articulo, proveedor);
        FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Agregado",
                    "Agregado con Exito!"));
        } catch (Exception e) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error",
                    "Algunas transacciones no se completaton " ));
        }
    }
    public void notransaccionalNEVER(){
        Articulo articulo = new Articulo(getNombreArticulo(), getCostoArticulo());
        Proveedor proveedor = new Proveedor(getNombreProveedor(), getDescripcionProveedor());        
        try {
            noTransaccional.crearArticuloProveedorNEVER(articulo, proveedor);
        FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Agregado",
                    "Agregado con Exito!"));
        } catch (Exception e) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error",
                    "Algunas transacciones no se completaton " ));
        }
    }
    
    public void transaccionalREQUIRED(){
        Vendedor vendedor = new Vendedor(getNombreVendedor());
        Articulo articulo = new Articulo(getNombreArticulo(), getCostoArticulo());
        Proveedor proveedor = new Proveedor(getNombreProveedor(), getDescripcionProveedor());   
        try {
            transaccional.crearArticuloProveedorVenderorREQUIRED(articulo, proveedor, vendedor);
        FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Agregado",
                    "Agregado con Exito!"));
        } catch (Exception e) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error",
                    "Algunas transacciones no se completaton " ));
        }
    }
    
    public void transaccionalREQUIRES_NEW(){
        Vendedor vendedor = new Vendedor(getNombreVendedor());
        Articulo articulo = new Articulo(getNombreArticulo(), getCostoArticulo());
        Proveedor proveedor = new Proveedor(getNombreProveedor(), getDescripcionProveedor());   
        try {
            transaccional.crearArticuloProveedorVenderorREQUIRES_NEW(articulo, proveedor, vendedor);
        FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Agregado",
                    "Agregado con Exito!"));
        } catch (Exception e) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error",
                    "Algunas transacciones no se completaton " ));
        }
    }
    
    public void transaccionalSUPPORTS(){
        Vendedor vendedor = new Vendedor(getNombreVendedor());
        Articulo articulo = new Articulo(getNombreArticulo(), getCostoArticulo());
        Proveedor proveedor = new Proveedor(getNombreProveedor(), getDescripcionProveedor());   
        try {
            transaccional.crearArticuloProveedorVenderorSUPPORTS(articulo, proveedor, vendedor);
        FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Agregado",
                    "Agregado con Exito!"));
        } catch (Exception e) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error",
                    "Algunas transacciones no se completaton " ));
        }
    }
    
    public void transaccionalMANDATORY(){
        Vendedor vendedor = new Vendedor(getNombreVendedor());
        Articulo articulo = new Articulo(getNombreArticulo(), getCostoArticulo());
        Proveedor proveedor = new Proveedor(getNombreProveedor(), getDescripcionProveedor());   
        try {
            transaccional.crearArticuloProveedorVenderorMANDATORY(articulo, proveedor, vendedor);
        FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Agregado",
                    "Agregado con Exito!"));
        } catch (Exception e) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error",
                    "Algunas transacciones no se completaton " ));
        }
    }
    
    public void transaccionalNOT_SUPPORTED(){
        Vendedor vendedor = new Vendedor(getNombreVendedor());
        Articulo articulo = new Articulo(getNombreArticulo(), getCostoArticulo());
        Proveedor proveedor = new Proveedor(getNombreProveedor(), getDescripcionProveedor());   
        try {
            transaccional.crearArticuloProveedorVenderorNOT_SUPPORTED(articulo, proveedor, vendedor);
        FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Agregado",
                    "Agregado con Exito!"));
        } catch (Exception e) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error",
                    "Algunas transacciones no se completaton " ));
        }
    }
    
    public void transaccionalNEVER(){
        Vendedor vendedor = new Vendedor(getNombreVendedor());
        Articulo articulo = new Articulo(getNombreArticulo(), getCostoArticulo());
        Proveedor proveedor = new Proveedor(getNombreProveedor(), getDescripcionProveedor());   
        try {
            transaccional.crearArticuloProveedorVenderorNEVER(articulo, proveedor, vendedor);
        FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Agregado",
                    "Agregado con Exito!"));
        } catch (Exception e) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error",
                    "Algunas transacciones no se completaton " ));
        }
    }
    
}
