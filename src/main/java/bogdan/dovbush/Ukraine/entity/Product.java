package bogdan.dovbush.Ukraine.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    private Long id;

    private String name;

    private Long price;

    private String description;

    public Product() {
    }
}
