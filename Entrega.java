/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantebomgosto;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Angelo
 */
@Entity
@Table(name = "entrega", catalog = "bomgosto", schema = "")
@NamedQueries({
    @NamedQuery(name = "Entrega.findAll", query = "SELECT e FROM Entrega e")
    , @NamedQuery(name = "Entrega.findById", query = "SELECT e FROM Entrega e WHERE e.id = :id")
    , @NamedQuery(name = "Entrega.findByPrato", query = "SELECT e FROM Entrega e WHERE e.prato = :prato")
    , @NamedQuery(name = "Entrega.findByQuantidade", query = "SELECT e FROM Entrega e WHERE e.quantidade = :quantidade")
    , @NamedQuery(name = "Entrega.findByBebida", query = "SELECT e FROM Entrega e WHERE e.bebida = :bebida")
    , @NamedQuery(name = "Entrega.findByNumero", query = "SELECT e FROM Entrega e WHERE e.numero = :numero")
    , @NamedQuery(name = "Entrega.findByEndereco", query = "SELECT e FROM Entrega e WHERE e.endereco = :endereco")
    , @NamedQuery(name = "Entrega.findBySobremesa", query = "SELECT e FROM Entrega e WHERE e.sobremesa = :sobremesa")})
public class Entrega implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "prato")
    private String prato;
    @Basic(optional = false)
    @Column(name = "quantidade")
    private int quantidade;
    @Basic(optional = false)
    @Column(name = "bebida")
    private String bebida;
    @Basic(optional = false)
    @Column(name = "numero")
    private String numero;
    @Basic(optional = false)
    @Column(name = "endereco")
    private String endereco;
    @Basic(optional = false)
    @Column(name = "sobremesa")
    private String sobremesa;

    public Entrega() {
    }

    public Entrega(Integer id) {
        this.id = id;
    }

    public Entrega(Integer id, String prato, int quantidade, String bebida, String numero, String endereco, String sobremesa) {
        this.id = id;
        this.prato = prato;
        this.quantidade = quantidade;
        this.bebida = bebida;
        this.numero = numero;
        this.endereco = endereco;
        this.sobremesa = sobremesa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getPrato() {
        return prato;
    }

    public void setPrato(String prato) {
        String oldPrato = this.prato;
        this.prato = prato;
        changeSupport.firePropertyChange("prato", oldPrato, prato);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        int oldQuantidade = this.quantidade;
        this.quantidade = quantidade;
        changeSupport.firePropertyChange("quantidade", oldQuantidade, quantidade);
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        String oldBebida = this.bebida;
        this.bebida = bebida;
        changeSupport.firePropertyChange("bebida", oldBebida, bebida);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        String oldNumero = this.numero;
        this.numero = numero;
        changeSupport.firePropertyChange("numero", oldNumero, numero);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        changeSupport.firePropertyChange("endereco", oldEndereco, endereco);
    }

    public String getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(String sobremesa) {
        String oldSobremesa = this.sobremesa;
        this.sobremesa = sobremesa;
        changeSupport.firePropertyChange("sobremesa", oldSobremesa, sobremesa);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entrega)) {
            return false;
        }
        Entrega other = (Entrega) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "restaurantebomgosto.Entrega[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
