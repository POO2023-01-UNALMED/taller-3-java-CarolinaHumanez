package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	private static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.canal = 1;
		this.precio = 500;
		this.estado = estado;
		this.volumen = 1;
		numTV++;
	}

	public int getNumTV() {
		return numTV;
	}
	public void setNumTV(int num){
		this.numTV=num;
	}

	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Control getControl() {
		return control;
	}
	public void setControl(Control control) {
		this.control = control;
	}

	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		if (estado == true) {
			if (volumen >= 0 && volumen <= 7) {
				this.volumen = volumen;
			}
		}
	}

	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if (estado == true) {
			if (canal >= 1 && canal <= 120) {
				this.canal = canal;
			}
		}
	}

	public void turnOn() {
		estado = true;
	}
	public void turnOff() {
		estado = false;
	}
	public boolean getEstado() {
		return estado;
	}

	public void canalUp() {
		if (estado == true) {
			if (canal < 120) {
				canal++;
			}
		}
	}
	public void canalDown() {
		if (estado == true) {
			if (canal > 1) {
				canal--;
			}
		}
	}

	public void volumenUp() {
		if (estado == true) {
			if (volumen < 7) {
			}
			volumen++;
		}
	}
	public void volumenDown() {
		if (estado == true) {
			if (volumen > 0) {
			}
			volumen--;
		}
	}
}
