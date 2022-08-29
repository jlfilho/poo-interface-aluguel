package model.services;

import java.time.Duration;

import model.entities.AluguelCarro;
import model.entities.NotaFiscal;

public class ServicoAluguel {
	
	private Double precoPorDia;
	private Double precoPorHora;
	
	
	private ImpostoServicoBrasil impostoServico;


	public ServicoAluguel(Double precoPorDia, Double precoPorHora, ImpostoServicoBrasil impostoServico) {
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.impostoServico = impostoServico;
	}
	
	public void processarNota(AluguelCarro aluguelCarro) {
		double duracao = Duration.between(aluguelCarro.getInicio(), aluguelCarro.getTermino()).getSeconds() / 3600.0;
		double pagamentoBasico;
		if (duracao <= 12.0) {
			pagamentoBasico = Math.ceil(duracao) * precoPorHora;
		}
		else {
			pagamentoBasico = Math.ceil(duracao / 24) * precoPorDia;
		}
		
		double imposto = impostoServico.imposto(pagamentoBasico);
		
		aluguelCarro.setNotaFiscal(new NotaFiscal(pagamentoBasico, imposto));
		
	}
	
	
	

}
