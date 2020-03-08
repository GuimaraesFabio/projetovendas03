package com.enums;

public enum EstadoPagamento {

	PENDENTE(1), QUITADO(2), CANCELADO(3);

	private int code;

	private EstadoPagamento(int code) {
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}

	public static EstadoPagamento toEnum(int code) {

		for (EstadoPagamento value : EstadoPagamento.values()) {

			if (value.getCode().equals(code)) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid EstadoPagamento code.");
	}
}
