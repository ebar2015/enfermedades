/**
 * 
 */
package com.viscaya.utilities;

import java.io.Serializable;
import java.security.SecureRandom;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

import org.springframework.stereotype.Component;

/**
 * @author joseviscaya
 *
 */
@Component
public class Utilities implements Serializable {

	private static final long serialVersionUID = -6263078987217947030L;
	
	
	public String CLAIMS_ID 								= "id";
	public String CLAIMS_NOMBRES 							= "nombres";
	public String CLAIMS_TIPO 								= "tipo";
	public String CLAIMS_EXPIRATION 						= "expiration";
	public String CLAIMS_TIME_EXP 							= "timeDuration";
	public String PARAM_EXPITE_TOKEN_ADMIN 					= "ExpireTokenAdmin";
	public String PARAM_EXPITE_TOKEN_MEDICO 				= "ExpireTokenMedico";
	public String PARAM_EXPITE_TOKEN_ASISTENTE 				= "ExpireTokenAsistente";
	public String PARAM_EXPITE_TOKEN_USUARIO 				= "ExpireTokenPaciente";
	public String PARAM_EXPITE_TOKEN_SUPER_ADMIN 			= "ExpireTokenSuperAdmin";
	public String ESTADO_ACTIVO 							= "ACTIVA";
	
	public String ADMIN 									= "Administrador";
	public String MEDICO 									= "Medico";
	public String PACIENTE 									= "Paciente";
	public String ASISTENTE 								= "Asistente";
	public String SUPER_ADMIN 								= "Super Administrador";
	public String JASPER_HISTORIA 							= "JASPER_HISTORIA";
	public String PATH_IMAGENES 							= "PATH_IMAGENES";
	
	public String JASPER_H_TITULO 							= "titulo";
	public String JASPER_H_LOGO 							= "logo";
	public String JASPER_H_PACIENTE 					    = "paciente";
	public String JASPER_H_NUMERO_ID 					    = "nummeroidentificacion";
	public String JASPER_H_EDAD		 					    = "edad";
	public String JASPER_H_MEDICO		 					= "medico";
	public String JASPER_H_RM		 					    = "rm";
	public String JASPER_H_FECHA		 					= "fecha";
	public String JASPER_H_HORA		 					    = "hora";
	public String JASPER_H_CORREO		 					= "correo";
	public String JASPER_H_CELULAR		 					= "celular";
	public String JASPER_H_ID_HISTORIA		 				= "idhistoria";
	public String JASPER_H_GENERO 							= "genero";
	public String JASPER_H_FIRMA 							= "firma";
	public String JASPER_H_LOGO_HABILITACION 				= "logoHabilitacion";
	public String JASPER_H_SELLO 							= "sello";
	public String JASPER_H_PAIS 							= "pais";
	public String JASPER_H_DEPARTAMENTO 					= "departamento";
	public String JASPER_H_CIUDAD 							= "ciudad";
	public String JASPER_H_DIRECCION 						= "direccion";
	public String JASPER_H_CORREO_E 						= "correoe";
	public String JASPER_H_TELEFONO 						= "telefono";
	public String JASPER_H_CODIGO_CIE						= "codigocie";
	
	public String SMTP_HOST  								= "SMTP_HOST";
	public String SMTP_PORT   								= "SMTP_PORT";
	public String SMTP_MAIL_SENDER    						= "SMTP_MAIL_SENDER";
	public String SMTP_MAIL_USER  							= "SMTP_MAIL_USER";
	public String SMTP_SSL_TRUST 		 					= "SMTP_SSL_TRUST";
	public String SMTP_SSL_PROTOCOLS  						= "SMTP_SSL_PROTOCOLS";
	
	
	private final int LONGITUD_CODIGO = 8;
	private final String CARACTERES = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";


	public String ASIGNADA = "ASIGNADA";
	public String FINALIZADA = "FINALIZADA";



	public String FORMATO_FECHA_LARGA = "dd/MM/yyyy HH:mm:ss";

	
	
	public String getEdad(LocalDate fnac) {
		Period edad = Period.between(LocalDate.of(fnac.getYear(), fnac.getMonth(), fnac.getDayOfMonth()), LocalDate.now());
		String data = "Años: "+edad.getYears()+" Meses: "+edad.getMonths()+" Dias: "+edad.getDays();
		return data;
	}
	
	public String getSaludoMedico(String medico, String genero) {
		
		switch(genero){
			case "Femenino":
				return "Dra. "+medico;
			default:
				return "Dr. "+medico;
		}
	}
	
	
	public String generarCodigo() {
	       SecureRandom rnd = new SecureRandom();
	       StringBuilder sb = new StringBuilder(LONGITUD_CODIGO);
	       for (int i = 0; i < LONGITUD_CODIGO; i++) {
	           sb.append(CARACTERES.charAt(rnd.nextInt(CARACTERES.length())));
	       }
	       return sb.toString();
	}
	
	public int getMinutos(LocalDateTime fechaInicial) {
		LocalDateTime fechaFinal = LocalDateTime.now();
        Duration duracion = Duration.between(fechaInicial, fechaFinal);
        return (int) duracion.toMinutes();
	}

}
