package org.example.entity;



import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@NamedQueries(
        {
                @NamedQuery(name="Employee.findAll", query = "SELECT emp FROM Employee emp ORDER BY emp.email DESC")

        }
)
public class User {
    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private String id;
    private String firstName;
    private String lastName;
    public User(){
        this.id = UUID.randomUUID().toString();

    }
    @OneToMany
    private List<Address> address;

   /* public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }*/






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

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    private String email;

}
