package trabalhopratico;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Agencia.java
//  @ Date : 22/11/2014
//  @ Author : Robson
//
//
public class Agencia {
	private int clientesCadastrados = 0;
        private int vagasClientes = 3000;
        private int vooCadastrados = 0;
        private int vagasVoo = 3000;
        private int aeroportCadastrados = 0;
        private int vagasAeroporto = 3000;
        private int reservaViagemCadastradas = 0;
        private int vagasReservaViagem = 3000;
        private int reservaVooCadastradas = 0;
        private int vagasReservaVoo = 3000;
        private int aviaoCadastrados = 0;
        private int vagasAviao = 3000;
        Voo voos[] = new Voo[vagasVoo];
	Cliente clientes[] = new Cliente[vagasClientes];
        Aeroportos aeroporto[] = new Aeroportos[vagasAeroporto];
        ReservaVoo reservaVoo[] = new ReservaVoo[vagasReservaVoo];
        ReservaViagem reservaViagem[] = new ReservaViagem[vagasReservaViagem];
        DescAviao descAviao[] = new DescAviao[vagasAviao];
        Atendente atendente;
/**
 * Método que permite adicionar uma nova descrição de Avião.
 * @param d
 * @return 
 */        
	public Boolean addDescAviao(DescAviao d) {
	if(aviaoCadastrados>vagasAviao){
       return false;  
     }
           int i=0;
           while(this.descAviao[i]!= null){
               i++;   
           }
           this.descAviao[i]=d;
           aviaoCadastrados++;
           return true;  
    }

/**
 * Método que permite remover uma Descrição de Avião.
 * @param numModelo
 * @return 
 */	
	public Boolean removeDescAviao(Integer numModelo) {
	int i=0;
        while(this.descAviao[i].getNumModelo()!=numModelo){
            i++;
        }
            this.descAviao[i]=null;
            return true;
	}
/**
 * Método que permite editar o Nome do Fabricante de avião.
 * @param nmFabr
 * @param numModelo
 * @return 
 */	
	public Boolean editarFabricante(String nmFabr, Integer numModelo) {
	int i=0;
        while(this.descAviao[i].getNumModelo()!=numModelo){
            i++;
        }
            this.descAviao[i].setNmFabr(nmFabr);
            return true;
	}
/**
 * Método que permite editar o Número do Modelo de um avião.
 * @param numModelo
 * @param novoNumModelo
 * @return 
 */	
	public Boolean editarModelo(Integer numModelo, Integer novoNumModelo) {
	int i=0;
        while(this.descAviao[i].getNumModelo()!=numModelo){
            i++;
        }
            this.descAviao[i].setNumModelo(novoNumModelo);
            return true;
        }
/**
 * Método que permite editar o Número de Assentos de um avião.
 * @param numAssentos
 * @param numModelo
 * @return 
 */	
	public Boolean editarAssentos(Integer numAssentos, Integer numModelo) {
	int i=0;
        while(this.descAviao[i].getNumModelo()!=numModelo){
            i++;
        }
        this.descAviao[i].setNumAssentos(numAssentos);
        return true;
	}
/**
 * Método que permite adicionar um Voo.
 * @param v
 * @return 
 */	
	public Boolean addVoo(Voo v) {
	if(vooCadastrados>vagasVoo){
       return false;  
     }
           int i=0;
           while(this.voos[i]!= null){
               i++;   
           }
           this.voos[i]=v;
           vooCadastrados++;
           return true; 
	}
/**
 * Método que permite remover um Voo.
 * @param numVoo
 * @return 
 */	
	public Boolean removeVoo(Integer numVoo) {
	int i=0;
        while(this.voos[i].getnumVoo()!=numVoo){
            i++;
        }
            this.voos[i]=null;
            return true;
	}
/**
 * Método que permite editar a Data de Partida de um voo.
 * @param dataPartida
 * @param numVoo
 * @return 
 */	
	public Boolean editarDtPart(String dataPartida, Integer numVoo) {
	int i=0;
        while(this.voos[i].getnumVoo()!=numVoo){
            i++;
        }
        this.voos[i].setDataPartida(dataPartida);
        return true;
	}
/**
 * Método que permite editar a Hora de Partida de um voo.
 * @param horaPartida
 * @param numVoo
 * @return 
 */	
	public Boolean editarHrPart(String horaPartida, Integer numVoo) {
	int i=0;
        while(this.voos[i].getnumVoo()!=numVoo){
            i++;
        }
        this.voos[i].setHoraPartida(horaPartida);
        return true;
	}
/**
 * Método que permite editar a hora de chegada de um voo.
 * @param horaChegada
 * @param numVoo
 * @return 
 */	
	public Boolean editarHrCheg(String horaChegada, Integer numVoo) {
	int i=0;
        while(this.voos[i].getnumVoo()!=numVoo){
            i++;
        }
        this.voos[i].setHoraChegada(horaChegada);
        return true;
	}
/**
 * Método que permite editar o Número de um voo.
 * @param numVoo
 * @param novoNumVoo
 * @return 
 */	
	public Boolean editarNumVoo(Integer numVoo, Integer novoNumVoo) {
	int i=0;
        while(this.voos[i].getnumVoo()!=numVoo){
            i++;
        }
        this.voos[i].setnumVoo(novoNumVoo);
        return true;
	}
/**
 * Método que permite editar o Números de Vagas de um voo.
 * @param numVagas
 * @param numVoo
 * @return 
 */	
	public Boolean editarNumVagas(Integer numVagas, Integer numVoo) {
	int i=0;
        while(this.voos[i].getnumVoo()!=numVoo){
            i++;
        }
        this.voos[i].setNumVagas(numVagas);
        return true;
	}
/**
 * Método que permite editar o Aeroporto de Origem de um voo.
 * @param aeroportoOrigem
 * @param numVoo
 * @return 
 */        
        public Boolean editarAeroportOrigem(AeroportOrigem aeroportoOrigem, Integer numVoo) {
	int i=0;
        while(this.voos[i].getnumVoo()!=numVoo){
            i++;
        }
        this.voos[i].setAeroportOrigem(aeroportoOrigem);
        return true;
	}
/**
 * Método que permite editar o Aeroporto de Destino de um voo.
 * @param aeroportoDestino
 * @param numVoo
 * @return 
 */        
        public Boolean editarAeroportDestino(AeroportDestino aeroportoDestino, Integer numVoo) {
	int i=0;
        while(this.voos[i].getnumVoo()!=numVoo){
            i++;
        }
        this.voos[i].setAeroportDestino(aeroportoDestino);
        return true;
	}
        
        public Boolean editarDescAviao(DescAviao descAviao, Integer numVoo) {
	int i=0;
        while(this.voos[i].getnumVoo()!=numVoo){
            i++;
        }
        this.voos[i].setDescAviao(descAviao);
        return true;
	}
/**
 * Método que permite adicionar uma Reserva de Voo.
 * @param rv
 * @return 
 */	
	public Boolean addReservaVoo(ReservaVoo rv) {
	if(reservaVooCadastradas>vagasReservaVoo){
       return false;  
     }
           int i=0;
           while(this.reservaVoo[i]!= null){
               i++;   
           }
           this.reservaVoo[i]=rv;
           reservaVooCadastradas++;
           return true; 
	}
/**
 * Método que permite remover uma Reserva de Voo.
 * @param codReservaVoo
 * @return 
 */	
	public Boolean removeReservaVoo(Integer codReservaVoo) {
	int i=0;
        while(this.reservaVoo[i].getcodReservaVoo()!=codReservaVoo){
            i++;
        }
            this.reservaVoo[i]=null;
            return true;
	}
/**
 * Método que permite editar o Código de Reserva de um Voo.
 * @param codReservaVoo
 * @param novoCodReservaVoo
 * @return 
 */	
	public Boolean editarCodReservaVoo(Integer codReservaVoo, Integer novoCodReservaVoo) {
	int i=0;
        while(this.reservaVoo[i].getcodReservaVoo()!=codReservaVoo){
            i++;
        }
        this.reservaVoo[i].setcodReserva(novoCodReservaVoo);
        return true;
	}
/**
 * Método que permite editar o número de Reserva de Voo.
 * @param numReservas
 * @param codReservaVoo
 * @return 
 */	
	public Boolean editarNumReservas(Integer numReservas, Integer codReservaVoo) {
	int i=0;
        while(this.reservaVoo[i].getcodReservaVoo()!=codReservaVoo){
            i++;
        }
        this.reservaVoo[i].setNumReservas(numReservas);
        return true;
	}
/**
 * Método que permite editar o Voo.
 * @param voo
 * @param codReservaVoo
 * @return 
 */        
        public Boolean editarVoo(Voo voo, Integer codReservaVoo) {
	int i=0;
        while(this.reservaVoo[i].getcodReservaVoo()!=codReservaVoo){
            i++;
        }
        this.reservaVoo[i].setVoo(voo);
        return true;
	}
/**
 * Método que permite adicionar uma Reserva de Viagem.
 * @param rv
 * @return 
 */	
	public Boolean addReservaViagem(ReservaViagem rv) {
	if(reservaViagemCadastradas>vagasReservaViagem){
       return false;  
     }
           int i=0;
           while(this.reservaViagem[i]!= null){
               i++;   
           }
           this.reservaViagem[i]=rv;
           reservaViagemCadastradas++;
           return true; 
	}
/**
 * Método que permite remover uma Reserva de Viagem.
 * @param codReserva
 * @return 
 */	
	public Boolean removeReservaViagem(Integer codReserva) {
	int i=0;
        while(this.reservaViagem[i].getCodReserva()!=codReserva){
            i++;
        }
            this.reservaViagem[i]=null;
            return true;
	}
/**
 * Método que permite editar o código de uma Reserva de Viagem.
 * @param codReserva
 * @param novoCodReserva
 * @return 
 */	
	public Boolean editarCodReserva(Integer codReserva, Integer novoCodReserva) {
	int i=0;
        while(this.reservaViagem[i].getCodReserva()!=codReserva){
            i++;
        }
        this.reservaViagem[i].setCodReserva(novoCodReserva);
        return true;
	}
/**
 * Método que permite editar o valor de uma Reserva de Viagem.
 * @param vlrReserva
 * @param codReserva
 * @return 
 */	
	public Boolean editarVlrReserva(Double vlrReserva, Integer codReserva) {
	int i=0;
        while(this.reservaViagem[i].getCodReserva()!=codReserva){
            i++;
        }
        this.reservaViagem[i].setVlrReserva(vlrReserva);
        return true;
	}
/**
 * Método que permite Editar um Tipo de Reserva de Viagem.
 * @param tipoReserva
 * @param codReserva
 * @return 
 */	
	public Boolean editarTipoReserva(String tipoReserva, Integer codReserva) {
	int i=0;
        while(this.reservaViagem[i].getCodReserva()!=codReserva){
            i++;
        }
        this.reservaViagem[i].setTipoReserva(tipoReserva);
        return true;
	}
/**
 * Método que permite editar a data de uma Reserva de Viagem.
 * @param dtaReserva
 * @param codReserva
 * @return 
 */	
	public Boolean editarDtaReserva(String dtaReserva, Integer codReserva) {
	int i=0;
        while(this.reservaViagem[i].getCodReserva()!=codReserva){
            i++;
        }
        this.reservaViagem[i].setDtaReserva(dtaReserva);
        return true;
	}
/**
 * Método que permite editar a Reserva de Voo de uma Reserva de Viagem.
 * @param reservaVoo
 * @param codReserva
 * @return 
 */        
        public Boolean editarReservaVoo(ReservaVoo reservaVoo, Integer codReserva) {
	int i=0;
        while(this.reservaViagem[i].getCodReserva()!=codReserva){
            i++;
        }
        this.reservaViagem[i].setReservaVoo(reservaVoo);
        return true;
	}
/**
 * Método que permite adicionar um Cliente.
 * @param c
 * @return 
 */	
	public Boolean addCliente(Cliente c) {
	if(clientesCadastrados>vagasClientes){
       return false;  
     }
           int i=0;
           while(this.clientes[i]!= null){
               i++;   
           }
           this.clientes[i]=c;
           clientesCadastrados++;
           return true; 
	}
/**
 * Método que permite remover um Cliente.
 * @param cpf
 * @return 
 */	
	public Boolean removeCliente(Integer cpf) {
	int i=0;
        while(this.clientes[i].getCpf()!=cpf){
            i++;
        }
            this.clientes[i]=null;
            return true;
	}
/**
 * Método que permite editar o nome de um Cliente.
 * @param nome
 * @param cpf
 * @return 
 */	
	public Boolean editarNome(String nome, Integer cpf) {
	int i=0;
        while(this.clientes[i].getCpf()!=cpf){
            i++;
        }
        this.clientes[i].setNome(nome);
        return true;
	}
/**
 * Método que permite editar o Cpf de um cliente.
 * @param cpf
 * @param novoCpf
 * @return 
 */	
	public Boolean editarCpf(Integer cpf, Integer novoCpf) {
	int i=0;
        while(this.clientes[i].getCpf()!=cpf){
            i++;
        }
        this.clientes[i].setCpf(novoCpf);
        return true;
	}
/**
 * Método que permite editar o Telefone de um cliente.
 * @param tel
 * @param cpf
 * @return 
 */	
	public Boolean editarTel(Integer tel, Integer cpf) {
	int i=0;
        while(this.clientes[i].getCpf()!=cpf){
            i++;
        }
        this.clientes[i].setTel(tel);
        return true;
	}
/**
 * Método que permite editar o Endereço de um cliente.
 * @param end
 * @param cpf
 * @return 
 */	
	public Boolean editarEnd(String end, Integer cpf) {
	int i=0;
        while(this.clientes[i].getCpf()!=cpf){
            i++;
        }
        this.clientes[i].setEnd(end);
        return true;
	}
/**
 * Método que permite adicionar Aeroportos.
 * @param a
 * @return 
 */	
	public Boolean addAeroportos(Aeroportos a) {
	if(aeroportCadastrados>vagasAeroporto){
       return false;  
     }
           int i=0;
           while(this.aeroporto[i]!= null){
               i++;   
           }
           this.aeroporto[i]=a;
           aeroportCadastrados++;
           return true; 
	}
/**
 * Método que permite remover Aeroportos.
 * @param codAeroport
 * @return 
 */	
	public Boolean removeAeroportos(Integer codAeroport) {
	int i=0;
        while(this.aeroporto[i].getCodAeroport()!=codAeroport){
            i++;
        }
            this.aeroporto[i]=null;
            return true;
	}
/**
 * Método que permite editar o Código de um Aeroporto.
 * @param codAeroport
 * @param novoCodAeroport
 * @return 
 */	
	public Boolean editarCodAeroport(Integer codAeroport, Integer novoCodAeroport) {
	int i=0;
        while(this.aeroporto[i].getCodAeroport()!=codAeroport){
            i++;
        }
        this.aeroporto[i].setCodAeroport(novoCodAeroport);
        return true;
	}
/**
 * Método que permite editar o nome de um Aeroporto.
 * @param nmAeroport
 * @param codAeroport
 * @return 
 */	
	public Boolean editarNmAeroport(String nmAeroport, Integer codAeroport) {
	int i=0;
        while(this.aeroporto[i].getCodAeroport()!=codAeroport){
            i++;
        }
        this.aeroporto[i].setNmAeroport(nmAeroport);
        return true;
	}
/**
 * Método que permite editar o local de um Aeroporto.
 * @param localAeroport
 * @param codAeroport
 * @return 
 */	
	public Boolean editarLocalAeroport(String localAeroport, Integer codAeroport) {
	int i=0;
        while(this.aeroporto[i].getCodAeroport()!=codAeroport){
            i++;
        }
        this.aeroporto[i].setLocalAeroport(localAeroport);
        return true;
	}
/**
 * Método que permite pesquiser um Cliente pelo seu CPF.
 * @param cpf 
 */	
        public void ObterDadosCliente(Integer cpf){
                 int i=0;
                while(this.clientes[i].getCpf()!=cpf){
                    i++;
                 }
                System.out.print("Dados do Cliente: \n");
                System.out.print("Cpf: " + this.clientes[i].getCpf() + "\n");
                System.out.print("Nome: " + this.clientes[i].getNome()+ "\n");
                System.out.print("Endereço: " + this.clientes[i].getEnd()+ "\n");
                System.out.print("Telefone: " + this.clientes[i].getTel()+ "\n");
                System.out.print("Reserva de Viagem: " + this.reservaViagem[i].getCodReserva()+ "\n");
            }
/**
 * Método que permite obter as vagas disponíveis de um voo pelo número do Voo.
 * @param numVoo 
 */        
	public void ObterVagas(Integer numVoo) {
	int i=0;
                while(this.voos[i].getnumVoo()!=numVoo){
                    i++;
                 }
                System.out.print("Número de Vagas: " + this.voos[i].getNumVagas());
	}
/**
 * Método que permite obter os aeroportos de Origem e Destino a partir do número do Voo.
 * @param numVoo 
 */
	public void ObterAeroports(Integer numVoo){
               
              int i=0;
                while(this.voos[i].getnumVoo()!=numVoo){
                    i++;
                 }
                System.out.println("Dados do Aeroporto: ");
                System.out.println("Nome do Aeroporto: "+this.aeroporto[i].getNmAeroport());
                System.out.println("Local do Aeroporto: "+this.aeroporto[i].getLocalAeroport());
                System.out.println("Código do Aeroporto: "+this.aeroporto[i].getCodAeroport());
                
        }
/**
 * Método que permite obter dados do aeroporto a partir do código do Aeroporto.
 * @param codAeroport 
 */
        public void ObterAeroports2(Integer codAeroport){
            int i = 0;
            while(this.aeroporto[i].getCodAeroport()!=codAeroport){
                i++;
            }
            System.out.println("Nome do Aeroporto: " + this.aeroporto[i].getNmAeroport());
            System.out.println("Cidade do Aeroporto: " + this.aeroporto[i].getLocalAeroport());
            System.out.println("Código do Aeroporto: " + this.aeroporto[i].getCodAeroport());
        }
     
/**
 * Método que permite obter os códigos de uma Reserva de Voo a partir do código de uma Reserva de Viagem.
 * @param codReserva 
 */
        public void ObterCodReservaVoo(Integer codReserva){
            int i = 0;
            while(this.reservaViagem[i].getCodReserva()!=codReserva){
                i++;
            }
           System.out.println("Código da Reserva de Voo: " + this.reservaVoo[i].getcodReservaVoo());     
        }
/**
 * Método que permite obter os dados da Reserva de Voo a partir do código de uma Reserva de Voo.
 * @param codReservaVoo 
 */
        public void ObterReservaVoo(Integer codReservaVoo){
            int i = 0;
            while(this.reservaVoo[i].getcodReservaVoo()!=codReservaVoo){
                i++;
            }
            System.out.println("Dados da Reserva de Voo: ");
            System.out.println("Código de Reserva: " + this.reservaVoo[i].getcodReservaVoo());
            System.out.println("Número de Reservas: " + this.reservaVoo[i].getNumReservas());
            System.out.println("Voo cadastrado na Reserva: " + this.voos[i].getnumVoo());            
        }
/**
 * Método que permite obter os dados da reserva de viagem a partir do código da Reserva.
 * @param codReserva 
 */        
        public void ObterReservaViagem(Integer codReserva){
            int i = 0;
            while(this.reservaViagem[i].getCodReserva()!=codReserva){
                i++;
            }
            System.out.println("Dados da Reserva de Viagem: ");
            System.out.println("Código da Reserva: " + this.reservaViagem[i].getCodReserva());
            System.out.println("Valor da Reserva: " + this.reservaViagem[i].getVlrReserva());
            System.out.println("Tipo da Reserva: " + this.reservaViagem[i].getTipoReserva());
            System.out.println("Data da Reserva: " + this.reservaViagem[i].getDtaReserva());
            System.out.println("Reserva de Voo cadastrado na Reserva de Viagem: " + this.reservaVoo[i].getcodReservaVoo());
            
        }
/**
 * Método que permite obter os dados do voo a partir do código de uma Reserva de Voo.
 * @param codReservaVoo 
 */            
        public void ObterDadosVoo(Integer codReservaVoo) {
            int i = 0;
            while(this.reservaVoo[i].getcodReservaVoo()!=codReservaVoo){
                i++;
            }
            System.out.println("Dados do Voo: ");
            System.out.println("Número do Voo: " + this.voos[i].getnumVoo());
            System.out.println("Número de Vagas: " + this.voos[i].getNumVagas());
            System.out.println("Aeroporto de Origem: " + this.voos[i].getAeroportOrigem());
            System.out.println("Aeroporto de Destino: " + this.voos[i].getAeroportDestino());
            System.out.println("Descrição do Avião: " + this.descAviao[i].getNumModelo());
            System.out.println("Data de Partida: " + this.voos[i].getDataPartida());
            System.out.println("Hora de Partida: " + this.voos[i].getHoraPartida());
            System.out.println("Hora de Chegada: " + this.voos[i].getHoraChegada());
            
	}
/**
 * Método que permite obter o código das reservas de viagem a partir do número do CPF de um
cliente;
 * @param cpf 
 */
        public void ObterDadosReserva(Integer cpf) {
            int i = 0;
            while(this.clientes[i].getCpf()!= cpf){
                i++;
            }
            System.out.println("Dados da Reserva: ");
            System.out.println("Código da Reserva: " + this.reservaViagem[i].getCodReserva());
            System.out.println("Reserva de Voo: " + this.reservaVoo[i].getcodReservaVoo());
            System.out.println("Valor da Reserva: " + this.reservaViagem[i].getVlrReserva());
            System.out.println("Tipo da Reserva: " + this.reservaViagem[i].getTipoReserva());
            System.out.println("Data da Reserva: " + this.reservaViagem[i].getDtaReserva());
	}
/**
 * Método que permite obter a data e os horários de partida e chegada a partir do número do Voo.
 * @param numVoo 
 */
        public void ObterDatas(Integer numVoo){
               
              int i=0;
                while(this.voos[i].getnumVoo()!=numVoo){
                    i++;
                 }
                System.out.println("Data da Partida: "+this.voos[i].getDataPartida());
                System.out.println("Hora Partida: "+this.voos[i].getHoraPartida());
                System.out.println("Hora Chegada: "+this.voos[i].getHoraChegada());
            }
/**
 * Método que permite obter os dados de um Avião a partir do número de Voo.
 * @param numVoo 
 */	
	public void ObterDadosAviao(Integer numVoo) {
                int i=0;
                while(this.voos[i].getnumVoo()!=numVoo){
                    i++;
                 }
                System.out.println("Nome do Fabricante: " + this.descAviao[i].getNmFabr());
                System.out.println("Número de Assentos: " + this.descAviao[i].getNumAssentos());
                System.out.println("Número do Modelo: " + this.descAviao[i].getNumModelo());
	}
/**
 * Método que permite obter a Descrição do Avião a partir do número do Modelo.
 * @param numModelo 
 */        
        public void ObterDescAviao(Integer numModelo){
            int i = 0;
            while(this.descAviao[i].getNumModelo()!= numModelo){
                i++;
            }
            System.out.println("Nome do Fabricante: " + this.descAviao[i].getNmFabr());
            System.out.println("Número de Assentos: " + this.descAviao[i].getNumAssentos());
            System.out.println("Número do Modelo: " + this.descAviao[i].getNumModelo());
        }
}