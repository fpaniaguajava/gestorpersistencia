package com.fernandopaniagua.gestorpersistencia;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class GeneradorFicheroConfiguracion {
/*
 	PERSISTENCIA_FICHERO = 1;
	PERSISTENCIA_OBJETOS = 2;
	PERSISTENCIA_MYSQL = 3;
 */
	
	public static void main(String[] args) {
		try {
			Properties properties = new Properties();
			properties.put("persistencia", "1");
			properties.storeToXML(new FileOutputStream("D:\\persistenciaJAVA\\configuracion.xml"), null);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
