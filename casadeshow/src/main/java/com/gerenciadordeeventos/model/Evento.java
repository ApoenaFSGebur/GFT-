//package com.gerenciadordeeventos.model;
//
//import java.math.BigDecimal;
//import java.sql.Date;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.validation.constraints.DecimalMin;
//import javax.validation.constraints.NotEmpty;
//
//import org.springframework.format.annotation.DateTimeFormat;
//import org.springframework.format.annotation.NumberFormat;
//
//@Entity (name = "casa")
//public class Evento {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	
//	@NotEmpty(message = "Preencha o campo nome")
//	private String name;
//	
//	
//	private BigDecimal capacity;
//	
//
//	@DateTimeFormat(pattern = "dd/MM/yyyy")
//	@Temporal(TemporalType.DATE)
//	private Date dateEvent; 
//	
//	
//	@DecimalMin(value = "0.01", message = "O valor não pode ser menor que 0,01")
//	@NumberFormat(pattern = "#,##0.00")
//	private BigDecimal value;
//	
//	
//	private String foto;
////	
////	@ManyToOne
////	private Casadeshow casa;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public BigDecimal getCapacity() {
//		return capacity;
//	}
//
//	public void setCapacity(BigDecimal capacity) {
//		this.capacity = capacity;
//	}
//
//	public Date getDateEvent() {
//		return dateEvent;
//	}
//
//	public void setDateEvent(Date dateEvent) {
//		this.dateEvent = dateEvent;
//	}
//
//	public BigDecimal getValue() {
//		return value;
//	}
//
//	public void setValue(BigDecimal value) {
//		this.value = value;
//	}
//
//	public String getFoto() {
//		return foto;
//	}
//
//	public void setFoto(String foto) {
//		this.foto = foto;
//	}
//
////	public Casadeshow getCasa() {
////		return casa;
////	}
////
////	public void setCasa(Casadeshow casa) {
////		this.casa = casa;
////	}
//
//	
//	
//}
