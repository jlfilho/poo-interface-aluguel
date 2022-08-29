package model.entities;

import java.time.LocalDateTime;

public class AluguelCarro {
	
	private LocalDateTime inicio;
	private LocalDateTime termino;
	
	private Veiculo veiculo;
	private NotaFiscal notaFiscal;
	
	public AluguelCarro() {
		
	}

	public AluguelCarro(LocalDateTime inicio, LocalDateTime termino, Veiculo veiculo) {
		this.inicio = inicio;
		this.termino = termino;
		this.veiculo = veiculo;
	}

	public LocalDateTime getInicio() {
		return inicio;
	}

	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}

	public LocalDateTime getTermino() {
		return termino;
	}

	public void setTermino(LocalDateTime termino) {
		this.termino = termino;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public NotaFiscal getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(NotaFiscal notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	
	
	

}
