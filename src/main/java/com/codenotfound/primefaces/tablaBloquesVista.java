package com.codenotfound.primefaces;

import FPBasicsDB.FPBasicsDB.modelo.TablaBloques;
import FPBasicsDB.FPBasicsDB.servicio.ServicioBloques;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "tablaBloquesVista")
@ViewScoped
public class tablaBloquesVista implements Serializable {

	private List<TablaBloques> bloques;

	@ManagedProperty("#{ServicioBloques}")
	private ServicioBloques servicioBloques;

	@PostConstruct
	public void init() {
		bloques = servicioBloques.consultarTodosLosRegistrosDeLaTablaBloques();
	}

	public List<TablaBloques> getCars() {
		return bloques;
	}

}
