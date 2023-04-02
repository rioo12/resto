package com.apollo.resto.model;
import javax.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "tablepax")

public class tablepax {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tblsID;

    @Column(name = "tblsName", nullable = false)
	private String tblsName;

    public tablepax(String tblsName){
        this.tblsName = tblsName;
    }
}
