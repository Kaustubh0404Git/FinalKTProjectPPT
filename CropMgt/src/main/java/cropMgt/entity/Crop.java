package cropMgt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "crops")
public class Crop {

		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long id;

	    @Column(name = "name")
	    private String name;

	    @Column(name = "description")
	    private String description;

	    @Column(name = "quantity")
	    private String quantity;

		public Crop(String name, String description, String quantity) {
			super();
			this.name = name;
			this.description = description;
			this.quantity = quantity;
		}

		public Crop() {
			// TODO Auto-generated constructor stub
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getQuantity() {
			return quantity;
		}

		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}
	    
	    
}
