package tareaTresTrabajador;

public class Empleado {
	private int numTrabajador;
	private String nombres;
	private String paterno;
	private String materno;
	private int hrsExtra;
	private float sueldoBase;
	private int anioIngreso;
	private int antig;
	private float total;
	double hrExtra = 275.5; 

	public Empleado() {
	}

	public Empleado ( int num, String nombres, String paterno, String materno, int hrs, float sueldo, int anio) { 
		this.numTrabajador = num;
		this.nombres = nombres;
		this.paterno = paterno; 
		this.materno = materno; 
		this.hrsExtra = hrs;
		this.sueldoBase = sueldo; 
		this.anioIngreso = anio; 
	}

	public int getNumTrabajador() {
		return numTrabajador;
	}

	public void setNumTrabajador(int numTrabajador) {
		this.numTrabajador = numTrabajador;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public int getHrsExtra() {
		return hrsExtra;
	}

	public void setHrsExtra(int hrsExtra) {
		this.hrsExtra = hrsExtra;
	}

	public float getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(float sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getAnioIngreso() {
		return anioIngreso;
	}

	public void setAnioIngreso(int anioIngreso) {
		this.anioIngreso = anioIngreso;
	}

	@Override
	public String toString() {
		return "Empleado [número de Trabajador=" + numTrabajador + ", nombres=" + nombres + ", Apellido paterno="
				+ paterno + ", apellido materno=" + materno + ", hrs Extra=" + hrsExtra + ", sueldo Base=" + sueldoBase
				+ ", año de ingreso=" + anioIngreso + "]";
	}

	public double calcularSueldo() {
		int ant = 2022 - this.anioIngreso;
		total = (float) (this.sueldoBase + (this.sueldoBase * (ant * 0.03f)) + this.hrsExtra * hrExtra);
		return total; 
	}

}
