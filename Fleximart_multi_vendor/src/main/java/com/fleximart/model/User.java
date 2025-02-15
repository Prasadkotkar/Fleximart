package com.fleximart.model;


import java.util.HashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fleximart.model.enums.USER_ROLE;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String password;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
    private String fullName;
    private String mobile;
    private USER_ROLE role;
    @OneToMany
    private Set<Address> addresses = new HashSet<>();
    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "user_coupons",
//    		 joinColumns = @JoinColumn(name = "user_id"),
    			inverseJoinColumns = @JoinColumn(name = "coupon_id"))
    private Set<Coupon> usedCoupons = new HashSet<>();
}
