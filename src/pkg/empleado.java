package pkg;

public class empleado {
	public enum TipoEmpleado {
		Vendedor, Encargado
	};

	public float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtras) {
		float salarioBase = 0;
		if (tipo == TipoEmpleado.Vendedor) {
			salarioBase = 2000;
			if (ventasMes >= 1000  && ventasMes < 1500) {
				salarioBase += 100;
			} else if (ventasMes >= 1500) {
				salarioBase += 200;
			}
			salarioBase = salarioBase + (30 * horasExtras);
		} else if (tipo == TipoEmpleado.Encargado) {
			salarioBase = 2500;
			if (ventasMes >= 1000 && ventasMes < 1500) {
				salarioBase += 100;
			} else if (ventasMes >= 1500) {
				salarioBase += 200;
			}
			salarioBase = salarioBase + (30 * horasExtras);

		}
		return salarioBase;
	}

	public float calculoNominaNeta(float nominaBruta) {
		if (nominaBruta < 2100) {
			return nominaBruta;
		} else if (nominaBruta >= 2500) {
			return  (nominaBruta * 0.82f);
		} else {
			return  (nominaBruta * 0.85f);
		}
	}
}
