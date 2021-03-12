/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nicol
 */
@Entity
@Table(name = "employees_projects")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmployeesProjects.findAll", query = "SELECT e FROM EmployeesProjects e"),
    @NamedQuery(name = "EmployeesProjects.findByPId", query = "SELECT e FROM EmployeesProjects e WHERE e.employeesProjectsPK.pId = :pId"),
    @NamedQuery(name = "EmployeesProjects.findByEId", query = "SELECT e FROM EmployeesProjects e WHERE e.employeesProjectsPK.eId = :eId")})
public class EmployeesProjects implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmployeesProjectsPK employeesProjectsPK;

    public EmployeesProjects() {
    }

    public EmployeesProjects(EmployeesProjectsPK employeesProjectsPK) {
        this.employeesProjectsPK = employeesProjectsPK;
    }

    public EmployeesProjects(int pId, int eId) {
        this.employeesProjectsPK = new EmployeesProjectsPK(pId, eId);
    }

    public EmployeesProjectsPK getEmployeesProjectsPK() {
        return employeesProjectsPK;
    }

    public void setEmployeesProjectsPK(EmployeesProjectsPK employeesProjectsPK) {
        this.employeesProjectsPK = employeesProjectsPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeesProjectsPK != null ? employeesProjectsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeesProjects)) {
            return false;
        }
        EmployeesProjects other = (EmployeesProjects) object;
        if ((this.employeesProjectsPK == null && other.employeesProjectsPK != null) || (this.employeesProjectsPK != null && !this.employeesProjectsPK.equals(other.employeesProjectsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.EmployeesProjects[ employeesProjectsPK=" + employeesProjectsPK + " ]";
    }
    
}
