package com.example.demo.tacos.web.api;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

@Data
@Entity
public class Taco {
	public Taco() {}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NonNull
//	@Size(min = 5, message = "Name must be at least 5 characters long")
	private String name;
	private Date createdAt;
	@ManyToMany(targetEntity = Ingredient.class)
//	@Size(min = 1, message = "You must choose at least 1 ingredient")
	private List<Ingredient> ingredients;

	@PrePersist
	void createdAt() {
		this.createdAt = new Date();
	}
}
//import lombok.Data;
//
//import javax.persistence.Column;
////import javax.persistence.Entity;
//import javax.persistence.Id;
//import java.util.Date;
//import java.util.List;
//
//@Data
//public class Taco {
//    @Id
//    @Column(name = "id", nullable = false)
//    private Long id;
//
//    private String name;
//    private Date createdAt;
//    private List<Ingredient> ingredients;
//    
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//}