package trabalhopratico;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Agência Aerea
//  @ File Name : Voo.java
//  @ Date : 15/11/2014
//  @ Author : Robson
//
//
public class Voo {
	private DescAviao descAviao;
	private String dataPartida;
	private String horaPartida;
	private String horaChegada;
	private Integer numVoo;
	private Integer numVagas;
        private AeroportDestino aeroportoDestino;
        private AeroportOrigem aeroportoOrigem;
/**
 * Método que retorna a Descrição do Avião.
 * @return 
 */	
        public DescAviao getDescAviao() {
	return descAviao;
	}
/**
 * Método que permite o acesso de outras classes ao atributo Descrição do Avião.
 * @param descAviao 
 */	
	public void setDescAviao(DescAviao descAviao) {
	this.descAviao = descAviao;
	}
/**
 * Método que retorna a Data de Partida.
 * @return 
 */	
	public String getDataPartida() {
	return dataPartida;
	}
/**
 * Método que permite o acesso de outras classes ao atributo Data de Partida.
 * @param dataPartida 
 */	
	public void setDataPartida(String dataPartida) {
	this.dataPartida = dataPartida;
	}
/**
 * Método que retorna a Hora de Partida.
 * @return 
 */	
	public String getHoraPartida() {
	return horaPartida;
	}
/**
 * Método que permite o acesso de outras classes ao atributo Hora de Partida.
 * @param horaPartida 
 */	
	public void setHoraPartida(String horaPartida) {
	this.horaPartida = horaPartida;
        }
/**
 * Método que retorna a Hora de Chegada.
 * @return 
 */	
	public String getHoraChegada() {
	return horaChegada;
	}
/**
 * Método que permite o acesso de outras classes ao atributo Hora de Chegada.
 * @param horaChegada 
 */	
	public void setHoraChegada(String horaChegada) {
	this.horaChegada = horaChegada;
	}
/**
 * Método que retorna o número de Voo.
 * @return 
 */	
	public Integer getnumVoo() {
	return numVoo;
	}
/**
 * Método que permite o acesso de outras classes ao atributo Número de Voo.
 * @param numVoo 
 */	
	public void setnumVoo(Integer numVoo) {
	this.numVoo = numVoo;
	}
/**
 * Método que retorna o Número de Vagas.
 * @return 
 */	
	public Integer getNumVagas() {
	return numVagas;
	}
/**
 * Método que permite o acesso de outras classes ao atributo Número de Vagas.
 * @param numVagas 
 */	
	public void setNumVagas(Integer numVagas) {
	this.numVagas = numVagas;
	}
/**
 * Método que retorna o Aeroporto de Destino de um voo.
 * @return 
 */        
        public AeroportDestino getAeroportDestino(){
            return aeroportoDestino;
        }
/**
 * Método que permite o acesso de outras classes ao atributo Aeroporto de Destino.
 * @param aeroportoDestino 
 */
        public void setAeroportDestino(AeroportDestino aeroportoDestino){
             this.aeroportoDestino = aeroportoDestino;
        }
/**
 * Método que retorna o Aeroporto de Origem de um voo.
 * @return 
 */
        public AeroportOrigem getAeroportOrigem(){
            return aeroportoOrigem;
        }
/**
 * Método que permite o acesso de outras classes ao atributo Aeroporto de Origem.
 * @param aeroportoOrigem 
 */
        public void setAeroportOrigem(AeroportOrigem aeroportoOrigem){
             this.aeroportoOrigem = aeroportoOrigem;
        }
}
