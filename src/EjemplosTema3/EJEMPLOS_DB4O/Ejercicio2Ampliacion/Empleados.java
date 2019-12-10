package EjemplosTema3.EJEMPLOS_DB4O.Ejercicio2Ampliacion;

import java.util.Date;
public class Empleados implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private int empNo;
	private Departamentos departamentos;
	private String apellido;
	private String oficio;
	private int dir;
	private Date fechaAlt;
	private Float salario;
	private Float comision;

	public Empleados() {}
	public Empleados(int empNo, Departamentos departamentos) {
		this.empNo = empNo;
		this.departamentos = departamentos;
	}
	public Empleados(int i, Departamentos departamentos, String apellido,
			String oficio, int j, Date fechaAlt, Float salario,
			Float comision) {
		this.empNo = i;
		this.departamentos = departamentos;
		this.apellido = apellido;
		this.oficio = oficio;
		this.dir = j;
		this.fechaAlt = fechaAlt;
		this.salario = salario;
		this.comision = comision;
	}
	public int getEmpNo() {return this.empNo;}
	public void setEmpNo(int empNo) {this.empNo = empNo;}
	public Departamentos getDepartamentos() {return this.departamentos;}
	public void setDepartamentos(Departamentos departamentos) {
		this.departamentos = departamentos;
	}
	public String getApellido() {return this.apellido;}
	public void setApellido(String apellido) {this.apellido = apellido;}
	public String getOficio() {return this.oficio;}
	public void setOficio(String oficio) {this.oficio = oficio;}
	public int getDir() {return this.dir;}
	public void setDir(int dir) {this.dir = dir;}
	public Date getFechaAlt() {return this.fechaAlt;}
	public void setFechaAlt(Date fechaAlt) {this.fechaAlt = fechaAlt;}
	public Float getSalario() {return this.salario;}
	public void setSalario(Float salario) {this.salario = salario;}
	public Float getComision() {return this.comision;}
	public void setComision(Float comision) {this.comision = comision;}
}//..
