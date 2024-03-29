package main;
import java.util.ArrayList;

import model.agregacion.*;
public class Main {

	public static void main(String[] args) {
		// create person, main class
		Persona personaGenial = new Persona("743","Manolo","García", 65);

		// part of person is a birth place -> composition 
		System.out.println(personaGenial.getLugar());
		personaGenial.getLugar().setPais("Puerto Rico");
		System.out.println(personaGenial.getLugar());
		
		// add a pet, person can or cannot have a pet -> aggregation
		ArrayList<Mascota> mascotasPersona = new ArrayList<>();
		Mascota miMascotaNueva = new Mascota();
		mascotasPersona.add(miMascotaNueva);		
		personaGenial.setMascotas(mascotasPersona);
		personaGenial.getMascotas().add(new Mascota());
		personaGenial.getMascotas().size();
		System.out.println(personaGenial.getMascotas());
	}

}
