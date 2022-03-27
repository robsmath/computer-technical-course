package trabalhopratico;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : ReservaViagem.java
//  @ Date : 15/11/2014
//  @ Author : Robson
//
//
public class ReservaViagem {
	private ReservaVoo reservaVoo;
	private Integer codReserva;
	private String tipoReserva;
	private Double vlrReserva;
	private String dtaReserva;
/**
 * Método que retorna a Reserva de Voo.
 * @return 
 */	
        public ReservaVoo getReservaVoo() {
	return reservaVoo;
	}
/**
 * Método que permite o acesso de outras classes ao atributo Reserva de Voo.
 * @param reservaVoo 
 */	
	public void setReservaVoo(ReservaVoo reservaVoo) {
	this.reservaVoo = reservaVoo;
	}
/**
 * Método que retorna o Código de Reserva.
 * @return 
 */	
	public Integer getCodReserva() {
	return codReserva;
	}
/**
 * Método que permite o acesso de outras classes ao atributo Código de Reserva.
 * @param codReserva 
 */	
	public void setCodReserva(Integer codReserva) {
	this.codReserva = codReserva;
	}
/**
 * Método que retorna o Tipo de Reserva.
 * @return 
 */	
	public String getTipoReserva() {
	return tipoReserva;
	}
/**
 * Método que permite o acesso de outras classes ao atributo Tipo de Reserva.
 * @param tipoReserva 
 */	
	public void setTipoReserva(String tipoReserva) {
	this.tipoReserva = tipoReserva;
	}
/**
 * Método que retorna o Valor da Reserva.
 * @return 
 */	
	public double getVlrReserva() {
	return vlrReserva;
	}
/**
 * Método que permite o acesso de outras classes ao atributo Valor da Reserva.
 * @param vlrReserva 
 */	
	public void setVlrReserva(double vlrReserva) {
	this.vlrReserva = vlrReserva;
	}
/**
 * Método que retorna a Data da Reserva.
 * @return 
 */	
	public String getDtaReserva() {
	return dtaReserva;
	}
/**
 * Método que permite o acesso de outras classes ao atributo Data da Reserva.
 * @param dtaReserva 
 */	
	public void setDtaReserva(String dtaReserva) {
	this.dtaReserva = dtaReserva;
	}
}
