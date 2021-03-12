/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Nicol
 */
@Embeddable
public class EmployeesProjectsPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "p_id")
    private int pId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "e_id")
    private int eId;

    public EmployeesProjectsPK() {
    }

    public EmployeesProjectsPK(int pId, int eId) {
        this.pId = pId;
        this.eId = eId;
    }

    public int getPId() {
        return pId;
    }

    public void setPId(int pId) {
        this.pId = pId;
    }

    public int getEId() {
        return eId;
    }

    public void setEId(int eId) {
        this.eId = eId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) pId;
        hash += (int) eId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeesProjectsPK)) {
            return false;
        }
        EmployeesProjectsPK other = (EmployeesProjectsPK) object;
        if (this.pId != other.pId) {
            return false;
        }
        if (this.eId != other.eId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.EmployeesProjectsPK[ pId=" + pId + ", eId=" + eId + " ]";
    }
    
}
