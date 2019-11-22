/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Clog_10
 */
@Entity
@Table(name = "PROVEEDOR", catalog = "", schema = "CARLOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proveedor.findAll", query = "SELECT p FROM Proveedor p")
    , @NamedQuery(name = "Proveedor.findByIdProveedor", query = "SELECT p FROM Proveedor p WHERE p.idProveedor = :idProveedor")
    , @NamedQuery(name = "Proveedor.findByNombreProveedor", query = "SELECT p FROM Proveedor p WHERE p.nombreProveedor = :nombreProveedor")
    , @NamedQuery(name = "Proveedor.findByDireccionProv", query = "SELECT p FROM Proveedor p WHERE p.direccionProv = :direccionProv")
    , @NamedQuery(name = "Proveedor.findByTelefonoCel", query = "SELECT p FROM Proveedor p WHERE p.telefonoCel = :telefonoCel")
    , @NamedQuery(name = "Proveedor.findByTelefonoCasa", query = "SELECT p FROM Proveedor p WHERE p.telefonoCasa = :telefonoCasa")
    , @NamedQuery(name = "Proveedor.findByCorreoProv", query = "SELECT p FROM Proveedor p WHERE p.correoProv = :correoProv")})
public class Proveedor implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PROVEEDOR")
    private Integer idProveedor;
    @Column(name = "NOMBRE_PROVEEDOR")
    private String nombreProveedor;
    @Column(name = "DIRECCION_PROV")
    private String direccionProv;
    @Column(name = "TELEFONO_CEL")
    private String telefonoCel;
    @Column(name = "TELEFONO_CASA")
    private String telefonoCasa;
    @Column(name = "CORREO_PROV")
    private String correoProv;

    public Proveedor() {
    }

    public Proveedor(Integer idProveedor, String nombreProveedor, String direccionProv, String telefonoCel, String telefonoCasa, String correoProv) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
        this.direccionProv = direccionProv;
        this.telefonoCel = telefonoCel;
        this.telefonoCasa = telefonoCasa;
        this.correoProv = correoProv;
    }
    
    public Proveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        Integer oldIdProveedor = this.idProveedor;
        this.idProveedor = idProveedor;
        changeSupport.firePropertyChange("idProveedor", oldIdProveedor, idProveedor);
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        String oldNombreProveedor = this.nombreProveedor;
        this.nombreProveedor = nombreProveedor;
        changeSupport.firePropertyChange("nombreProveedor", oldNombreProveedor, nombreProveedor);
    }

    public String getDireccionProv() {
        return direccionProv;
    }

    public void setDireccionProv(String direccionProv) {
        String oldDireccionProv = this.direccionProv;
        this.direccionProv = direccionProv;
        changeSupport.firePropertyChange("direccionProv", oldDireccionProv, direccionProv);
    }

    public String getTelefonoCel() {
        return telefonoCel;
    }

    public void setTelefonoCel(String telefonoCel) {
        String oldTelefonoCel = this.telefonoCel;
        this.telefonoCel = telefonoCel;
        changeSupport.firePropertyChange("telefonoCel", oldTelefonoCel, telefonoCel);
    }

    public String getTelefonoCasa() {
        return telefonoCasa;
    }

    public void setTelefonoCasa(String telefonoCasa) {
        String oldTelefonoCasa = this.telefonoCasa;
        this.telefonoCasa = telefonoCasa;
        changeSupport.firePropertyChange("telefonoCasa", oldTelefonoCasa, telefonoCasa);
    }

    public String getCorreoProv() {
        return correoProv;
    }

    public void setCorreoProv(String correoProv) {
        String oldCorreoProv = this.correoProv;
        this.correoProv = correoProv;
        changeSupport.firePropertyChange("correoProv", oldCorreoProv, correoProv);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProveedor != null ? idProveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedor)) {
            return false;
        }
        Proveedor other = (Proveedor) object;
        if ((this.idProveedor == null && other.idProveedor != null) || (this.idProveedor != null && !this.idProveedor.equals(other.idProveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Proveedor[ idProveedor=" + idProveedor + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}


