package Entidade;

public class Conta {
	
	private Integer numero;
	private String usuario;
	private Double saldo, limiteSaque;
	
	public Conta(Integer numero, String usuario, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.usuario = usuario;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}
	
	public void Deposito(double deposito) {
		this.saldo += deposito;
	}
	
	public void Saque(double saque) throws Invalido {
		if(saque > this.limiteSaque) {
			throw new Invalido("Valor acima do permitido. Não sera possível efetuar o saque!!!");
		}
		if(saque > this.saldo) {
			throw new Invalido("Você não possui este valor disponível para saque!!!");
		}
		this.saldo -= saque;
	}	
	
	@Override
	public String toString() {
		return "Número: " + this.numero +
				"\nUsúario: " + this.usuario +
				"\nSaldo: R$" + String.format("%.2f",this.saldo) + 
				"\nLimite de Saque: R$" + String.format("%.2f",this.limiteSaque);
	}

}