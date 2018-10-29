package APITest.dao;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TableA1DAO {
    @Id
    private Integer id;
    private String name;
    private String lastName;
}
