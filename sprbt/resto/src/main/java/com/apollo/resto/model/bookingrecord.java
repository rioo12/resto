package com.apollo.resto.model;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
@Table(name = "bookingrecord")

public class bookingrecord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bkngID;

    @Column(name = "bkngDate", nullable = false)
	private LocalDate bkngDate;
    
    @Column(name = "bkngTime", nullable = false)
    private LocalDateTime bkngTime;  
    
    private Long cusID;
    private Long tblsID;

    public bookingrecord(LocalDate bkngDate, LocalDateTime bkngTime){
        this.bkngDate = bkngDate;
        this.bkngTime = bkngTime;
    }
}
 