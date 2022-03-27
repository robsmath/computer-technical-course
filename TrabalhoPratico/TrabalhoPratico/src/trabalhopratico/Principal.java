/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalhopratico;

/**
 *
 * @author Matheus
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Instanciando a classe Agencia.
        Agencia ag = new Agencia();
// Atribuindo valores aos atributos da classe DescAviao.        
        DescAviao d = new DescAviao();
        d.setNmFabr("TAM");
        d.setNumAssentos(250);
        d.setNumModelo(1);
//Testando o método Adicionar uma descrição de Avião.               
        ag.addDescAviao(d);
//Atribuindo valores aos atributos da classe Aeroporto de Origem. 
        AeroportOrigem ao = new AeroportOrigem();
        ao.setCodAeroport(1);
        ao.setLocalAeroport("MG");
        ao.setNmAeroport("Aeroporto de Confins");
        
        AeroportOrigem ao1 = new AeroportOrigem();
        ao1.setCodAeroport(3);
        ao1.setLocalAeroport("BA");
        ao1.setNmAeroport("Aeroporto de Salvador");
//Testando o método adicionar um Aeroporto.       
        ag.addAeroportos(ao);
        ag.addAeroportos(ao1);
// Atribuindo valores aos atributos da classe Aeroporto de Destino.       
        AeroportDestino ad = new AeroportDestino();
        ad.setCodAeroport(2);
        ad.setLocalAeroport("SP");
        ad.setNmAeroport("Aeroporto de Guarulhos");
                
        AeroportDestino ad1 = new AeroportDestino();
        ad1.setCodAeroport(4);
        ad1.setLocalAeroport("RJ");
        ad1.setNmAeroport("Aeroporto de RJ");
//Testando o método adicionar um Aeroporto.    
        ag.addAeroportos(ad);
        ag.addAeroportos(ad1);
// Atribuindo valores aos atributos da classe Voo. 
        Voo v = new Voo();
        v.setAeroportOrigem(ao);
        v.setAeroportDestino(ad);
        v.setDataPartida("20/12/2014");
        v.setHoraPartida("18:00");
        v.setHoraChegada("19:30");
        v.setNumVagas(200);
        v.setnumVoo(1);
        v.setDescAviao(d);
// Testando o método adicionar um Voo.    
        ag.addVoo(v);
// Atribuindo valores aos atributos da classe Reserva de Voo.       
        ReservaVoo rv = new ReservaVoo();
        rv.setVoo(v);
        rv.setNumReservas(200);
        rv.setcodReserva(111);
// Testando o método adicionar uma Reserva de Voo.    
        ag.addReservaVoo(rv);
// Atribuindo valores aos atributos da classe Reserva de Viagem.        
        ReservaViagem rva = new ReservaViagem();
        rva.setReservaVoo(rv);
        rva.setCodReserva(101);
        rva.setTipoReserva("Premium");
        rva.setDtaReserva("01/11/2014");
        rva.setVlrReserva(1749.99);
// Testando o método adicionar uma Reserva de Viagem.        
        ag.addReservaViagem(rva);
// Atribuindo valores aos atributos da classe Cliente.        
        Cliente c = new Cliente();
        c.setReservaViagem(rva);
        c.setCpf(043);
        c.setNome("Robson Matheus");
        c.setEnd("Rua Ana Moreira Santo, nº32 - Jaqueline BH/MG");
        c.setTel(34547898);
// Testando o método adicionar um Cliente.    
        ag.addCliente(c);
// Obtendo os dados de um Avião a partir do número de Voo.
        System.out.println("Antes:");
        ag.ObterDadosAviao(1);
// Editando os atributos da classe DescAviao.        
        ag.editarAssentos(200, 1);
        ag.editarFabricante("GOL", 1);
        ag.editarModelo(1, 101);
// Obtendo os dados de um Avião após ter editado os seus atributos.
        System.out.println("\nDepois:");
        ag.ObterDadosAviao(1);
// Obtendo os dados dos aeroportos a partir do número de Voo.
        System.out.println("\nAntes:");
        ag.ObterAeroports(1);
// Obtendo os dados dos aeroportos a partir do código do Aeroporto.
        ag.ObterAeroports2(2);
// Editando os atributos da classe Aeroporto.        
        ag.editarNmAeroport("Aeroporto Internacional de Guarulhos", 2);
        ag.editarLocalAeroport("São Paulo", 2);
        ag.editarCodAeroport(2, 102);
// Obtendo os dados de um Aeroporto após ter editado seus atributos.
        System.out.println("\nDepois:");
        ag.ObterAeroports2(102);
// Obtendo os dados de um Voo a partir do código de Reserva de Voo. 
        System.out.println("\nAntes: ");
        ag.ObterDadosVoo(111);
// Editando os atributos da classe Voo.        
        ag.editarNumVagas(250, 1);
        ag.editarAeroportDestino(ad1, 1);
        ag.editarAeroportOrigem(ao1, 1);
        ag.editarDtPart("02/01/2015", 1);
        ag.editarHrPart("14:30", 1);
        ag.editarHrCheg("15:30", 1);
        ag.editarDescAviao(d, 1);
        ag.editarNumVoo(1, 123);
// Obtendo os dados de um Voo após ter editado seus atributos.   
        System.out.println("\nDepois:");
        ag.ObterDadosVoo(111);
// Obtendo as datas e horas de partida e chegada a partir do número de voo.
        System.out.println("\nObter datas e horas a partir do número de voo: ");
        ag.ObterDatas(123);
// Obtendo os dados de uma Reserva de Voo a partir do Código da Reserva de Voo.
        System.out.println("\nAntes:");
        ag.ObterReservaVoo(111);
// Editando os atributos da classe Reserva de Voo.        
        ag.editarNumReservas(250, 111);
        ag.editarVoo(v, 111);
        ag.editarCodReservaVoo(111, 112);
// Obtendo os dados de uma Reserva de Voo após ter editado seus atributos.
        System.out.println("\nDepois:");
        ag.ObterReservaVoo(112);
// Obtendo os dados de uma Reserva de Viagem a partir do cpf de um cliente.
        System.out.println("\nAntes:");
        ag.ObterDadosReserva(043);
// Editando os atributos da classe Reserva de Viagem.
        ag.editarTipoReserva("Comum", 101);
        ag.editarVlrReserva(1999.99, 101);
        ag.editarDtaReserva("19/07/2015", 101);
        ag.editarReservaVoo(rv, 101);
        ag.editarCodReserva(101, 202);
// Obtendo os dados de uma Reserva de Viagem a partir do código de Reserva. 
        System.out.println("\nDepois:");
        ag.ObterDadosReserva(043);
// Obtendo os dados de um Cliente a partir do número de Cpf. 
        System.out.println("\nAntes:");
        ag.ObterDadosCliente(043);
// Editando os dados de um Cliente.
        ag.editarNome("Matthew", 043);
        ag.editarEnd("New York - USA", 043);
        ag.editarTel(75701469, 043);
        ag.editarCpf(043, 041);
// Obtendo os dados de um Cliente após ter editado seus atributos.
        System.out.println("\nDepois:");
        ag.ObterDadosCliente(041);
// Obtendo o número de vagas de um voo a partir do número desse Voo.
        System.out.println("\nObtendo o número de vagas a partir do número do Voo:");
        ag.ObterVagas(123);
        System.out.println("\n");
        
        
     
        
        
        
/**
        ag.ObterDadosReserva(0401452014);
**/        
       
        
    }
}
 
