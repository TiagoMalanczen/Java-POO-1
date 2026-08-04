package application;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import exceptions.DomainException;

public class RegistroPronto {

	private String funcionario;
	private Date horaEntrada;
	private Date horaSaida;
	
	public RegistroPronto(String funcionario, Date horaEntrada, Date horaSaida) {
		validar(horaEntrada, horaSaida);
		this.funcionario = funcionario;
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
	}
	
	public void validar(Date entrada, Date saida) {
		
		if(entrada.after(saida)) {
			throw new DomainException("Hora de saida deve ser posterior a entrada");
		}
		
	}
	public double horasTrabalhadas() {
		long diff = this.horaSaida.getTime() - this.horaEntrada.getTime();
		return diff = TimeUnit.HOURS.convert(diff, TimeUnit.MILLISECONDS);
	}

	@Override
	public String toString() {
		return "RegistroPronto [funcionario=" + funcionario + ", horaEntrada=" + horaEntrada + ", horaSaida="
				+ horaSaida + "]";
	}
	
	
}
