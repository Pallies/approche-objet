package fr.diginamic.recensement.utils;

import java.util.function.BinaryOperator;

public class AddHabitants implements BinaryOperator<Long> {

	@Override
	public Long apply(Long v1, Long v2) {
		return v1+v2;
	}

}
