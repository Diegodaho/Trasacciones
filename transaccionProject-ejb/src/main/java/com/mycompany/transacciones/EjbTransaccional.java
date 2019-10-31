/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.transacciones;

import com.mycompany.entity.Articulo;
import com.mycompany.entity.Proveedor;
import com.mycompany.entity.Vendedor;
import com.mycompany.interfaces.IVendedorFacade;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 *
 * @author DaveHell
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class EjbTransaccional {
    
    @EJB
    IVendedorFacade vendedorInterface;
    
    @EJB
    EjbNOTransaccional noTransaccional;
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void crearArticuloProveedorVenderorREQUIRED(Articulo articulo, Proveedor proveedor, Vendedor vendedor){
        vendedorInterface.create(vendedor);
        try {
            noTransaccional.crearArticuloProveedorREQUIRED(articulo, proveedor);
        } catch (Exception e) {
            System.out.println("Fallo Transaccion");
        }        
    }
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void crearArticuloProveedorVenderorREQUIRES_NEW(Articulo articulo, Proveedor proveedor, Vendedor vendedor){
        vendedorInterface.create(vendedor);        
        try {
            noTransaccional.crearArticuloProveedorREQUIRES_NEW(articulo, proveedor);
        } catch (Exception e) {
            System.out.println("Fallo Transaccion");
        } 
    }
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void crearArticuloProveedorVenderorSUPPORTS(Articulo articulo, Proveedor proveedor, Vendedor vendedor){
        vendedorInterface.create(vendedor);        
        try {
            noTransaccional.crearArticuloProveedorSUPPORTS(articulo, proveedor);
        } catch (Exception e) {
            System.out.println("Fallo Transaccion");
        } 
    }
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void crearArticuloProveedorVenderorMANDATORY(Articulo articulo, Proveedor proveedor, Vendedor vendedor){
        vendedorInterface.create(vendedor);        
        try {
            noTransaccional.crearArticuloProveedorMANDATORY(articulo, proveedor);
        } catch (Exception e) {
            System.out.println("Fallo Transaccion");
        } 
    }
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void crearArticuloProveedorVenderorNOT_SUPPORTED(Articulo articulo, Proveedor proveedor, Vendedor vendedor){
        vendedorInterface.create(vendedor);
        try {
            noTransaccional.crearArticuloProveedorNOT_SUPPORTED(articulo, proveedor);
        } catch (Exception e) {
            System.out.println("Fallo Transaccion");
        } 
    }
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void crearArticuloProveedorVenderorNEVER(Articulo articulo, Proveedor proveedor, Vendedor vendedor){
        vendedorInterface.create(vendedor);        
        try {
            noTransaccional.crearArticuloProveedorNEVER(articulo, proveedor);
        } catch (Exception e) {
            System.out.println("Fallo Transaccion");
        } 
    }
    
}
