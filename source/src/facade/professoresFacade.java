package facade;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.professoresModel;

@Path("/professores")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class professoresFacade {

	static List<professoresModel> listaProfessores = new ArrayList<professoresModel>();

	static {
		listaProfessores.add(new professoresModel(1,"Neri Neitzke","videoaulaneri@gmail.com","54 3329 5400"));
		listaProfessores.add(new professoresModel(2,"Lisiane Neitzke","lisiane@informaticon.com","54 3329 1111"));
	}


	/*		listaProfessores.add(new professoresModel(1,"Neri Neitzke","videoaulaneri@gmail.com","54 3329 5400"));
	listaProfessores.add(new professoresModel(2,"Lisiane Neitzke","lisiane@informaticon.com","54 3329 1111"));
	listaProfessores.add(new professoresModel(3,"Gustavo Neitzke","gustavo@gmail.com","54 3329 6789"));
	listaProfessores.add(new professoresModel(4,"Giulia Neitzke","Giulia@gmail.com","54 6666 6789"));
	 */


	@GET
	public List<professoresModel> GetProfessores()
	{
		return listaProfessores;
	}


}
