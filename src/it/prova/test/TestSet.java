package it.prova.test;

import java.util.HashSet;
import java.util.Set;

import it.prova.model.Persona;

public class TestSet {
public static void main(String[] args) {
	

	Set<Persona> personeSet = new HashSet<Persona>();
	
	Set<Persona> personeDaAggiungereAlPrimoSet = new HashSet<Persona>();
	 
	Persona person1 = new Persona("Lucia","Rossi");
	Persona person2 = new Persona("aurora","verdi");
	Persona person3 = new Persona("Jessica","gialli");
	
	personeDaAggiungereAlPrimoSet.add(person1);//aggiunge
	personeDaAggiungereAlPrimoSet.add(person2);
	personeDaAggiungereAlPrimoSet.add(person3);
	
	
	Persona p1 = new Persona("Mario","Rossi");
	Persona p2 = new Persona("anna","verdi");
	Persona p3 = new Persona("luca","gialli");
	
	personeSet.add(p1);
	personeSet.add(p2);
	personeSet.add(p3);
	personeSet.add(p1); //Set non ha duplicati
	
	for (Persona personaItem : personeSet) {
		System.out.println(personaItem.getNome() + "  " + personaItem.getCognome());
	}
	
	personeSet.remove(p1); //rimuove dalla lista
	System.out.println(personeSet.size());//size 
	personeSet.clear();//cancella tutto
	System.out.println(personeSet.size());
	personeSet.addAll(personeDaAggiungereAlPrimoSet);//aggiunge un set
	
	for (Persona personaItem : personeSet) {
		System.out.println(personaItem.getNome() + "  " + personaItem.getCognome());
	}
	
	
}
}
