package com.apollo.resto.model;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "customer")
public class customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cusID;

    @Column(name = "cusName", nullable = false)
	private String cusName;

    @Column(name = "cusEmail", nullable = false)
    private String cusEmail;  

    public customer(String cusName, String cusEmail){
        this.cusName = cusName;
        this.cusEmail = cusEmail;
    }

}
