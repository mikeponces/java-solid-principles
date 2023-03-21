package com.pluralsight.solid.ocp.good;

import java.lang.reflect.InvocationTargetException;
import java.util.stream.Stream;

public class TaxCalculatorFactory {
	private final static Stream<Class<? extends TaxCalculator>> TAX_CALCULATORS = Stream.of(FullTimeTaxCalculator.class,
			PartTimeTaxCalculator.class);

	public static TaxCalculator findCalculator(String type) throws InvalidEmployeeTypeException {
		return TAX_CALCULATORS.filter(c -> type.equals(c.getAnnotation(CalculatorDetails.class).type())).findFirst()
				.map(match -> {
					try {
						return match.getConstructor().newInstance();
					} catch (InstantiationException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					} catch (NoSuchMethodException e) {
						e.printStackTrace();
					} catch (SecurityException e) {

						e.printStackTrace();
					}
					return null;
				}).orElseThrow(() -> new InvalidEmployeeTypeException());

	}
}
