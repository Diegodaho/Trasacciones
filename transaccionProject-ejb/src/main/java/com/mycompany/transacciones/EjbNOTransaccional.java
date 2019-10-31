/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.transacciones;

import com.mycompany.entity.Articulo;
import com.mycompany.entity.Proveedor;
import com.mycompany.interfaces.IArticuloFacade;
import com.mycompany.interfaces.IProveedorFacade;
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
public class EjbNOTransaccional {
    
    @EJB
    IArticuloFacade articuloInterface;
    
    @EJB
    IProveedorFacade proveedorInterface;
    
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void crearArticuloProveedorREQUIRED(Articulo articulo, Proveedor proveedor){    
        articuloInterface.create(articulo);
        proveedorInterface.create(proveedor);
    }
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void crearArticuloProveedorREQUIRES_NEW(Articulo articulo, Proveedor proveedor){    
        articuloInterface.create(articulo);
        proveedorInterface.create(proveedor);
    }
    
    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
    public void crearArticuloProveedorSUPPORTS(Articulo articulo, Proveedor proveedor){    
        articuloInterface.create(articulo);
        proveedorInterface.create(proveedor);
    }
    
    @TransactionAttribute(TransactionAttributeType.MANDATORY)
    public void crearArticuloProveedorMANDATORY(Articulo articulo, Proveedor proveedor){    
        articuloInterface.create(articulo);
        proveedorInterface.create(proveedor);
    }
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public void crearArticuloProveedorNOT_SUPPORTED(Articulo articulo, Proveedor proveedor){    
        articuloInterface.create(articulo);
        proveedorInterface.create(proveedor);
    }
    
    @TransactionAttribute(TransactionAttributeType.NEVER)
    public void crearArticuloProveedorNEVER(Articulo articulo, Proveedor proveedor){    
        articuloInterface.create(articulo);
        proveedorInterface.create(proveedor);
    }
    
    
}
