package edu.dws.ejemploWebClase.Web.Controladores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import edu.dws.ejemploWebClase.Clases.Persona;

@Controller
public class ControladorSegunda {
	protected final Log logger = LogFactory.getLog(getClass());

	/*
	 * @RequestMapping(value="/index") public ModelAndView gestionSolicitud() {
	 * 
	 * logger.info("Navegamos a la vista segunda");
	 * 
	 * //Map<String, Object> miModelo = new HashMap<String, Object>();
	 * //miModelo.put("mensaje", "Todo Ok"); // return new
	 * ModelAndView("segunda","miModelo", miModelo);
	 * 
	 * Map<String , Persona> arrayPersona = new HashMap<String , Persona>();
	 * arrayPersona.put("mensaje", new Persona("Victor","Fernandez",23));
	 * arrayPersona.put("mensaje", new Persona("Pablo","Conde",27));
	 * 
	 * return new ModelAndView("segunda","arrayPersona", arrayPersona); return new
	 * ModelAndView("index"); }
	 */

	@RequestMapping(value = "/segunda")
	public ModelAndView vista(@RequestParam("fraseuno") String nombre,@RequestParam("frasdos") String apellidos
			) {
		
		return new ModelAndView("segunda");
	}

}
