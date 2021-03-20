/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dtos.EmployeeDTO;
import dtos.EmployeesDTO;
import entities.Employees;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

/**
 *
 * @author Nicol
 */
public class EmlpoyeeFacade {
     private static EntityManagerFactory emf;
    private static EmlpoyeeFacade instance;

    private EmlpoyeeFacade() {
    }

    /**
     *
     * @param _emf
     * @return the instance of this facade.
     */
    public static EmlpoyeeFacade getEmlpoyeeFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new EmlpoyeeFacade();
        }
        return instance;
    }
    
    public List<EmployeeDTO> getEmployees(){
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<Employees> q = em.createQuery("SELECT e FROM Employees e", Employees.class);
            
            return new EmployeesDTO(q.getResultList()).getEmployeeDTOs();
        } finally {
            em.close();
        }
        
    }
}
