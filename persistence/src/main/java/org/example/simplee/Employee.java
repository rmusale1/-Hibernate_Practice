/*package org.example.simplee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import java.util.UUID;

@Entity
@NamedQueries(
        {
          @NamedQuery(name="Employee.findAll", query = "SELECT emp FROM Employee emp ORDER BY emp.email DESC")

        }
)
public class Employee {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    public Employee(){
        this.id = UUID.randomUUID().toString();

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

}*/

