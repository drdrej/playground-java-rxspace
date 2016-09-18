package com.touchableheroes.rxspace;

public interface OnChangeEntry<T> {

	public void doAfter( TXOperations ops );
	
	public Integer	onChange(
			final Enum key,
			final T newValue,
			final T olbValue);
}