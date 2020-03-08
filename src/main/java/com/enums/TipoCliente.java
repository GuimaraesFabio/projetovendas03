package com.enums;

public enum TipoCliente {

	PESSOA_FISICA(1), PESSOA_JURIDICA(2);

	private int code;

	private TipoCliente(int code) {
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}

	public static TipoCliente toEnum(int code) {

		for (TipoCliente value : TipoCliente.values()) {
			if (value.getCode().equals(code)) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid TipoCliente code.");
	}
}
