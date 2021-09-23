package entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="data")
public class Data  {
    @Id
    @GeneratedValue()
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(length = 50)
    private String last_name;

    @Column(length = 50, unique = true)
    private String email;


    public Data() {
    }

    public Data(Long id, String last_name, String email) {
        this.id = id;
        this.last_name = last_name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}