package bankSystem.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "clients")
public class Client {
    @Id
    private Long id;
    private char[] name;
}
