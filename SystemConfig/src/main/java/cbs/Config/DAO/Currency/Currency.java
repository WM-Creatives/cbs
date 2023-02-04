package cbs.Config.DAO.Currency;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Currency{
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String sn;
	private String entity;
	private Integer numericCode;
	private String currency;
	private String alphabeticCode;
	private Date withdrawalDate;
	private String minorUnit;
}
