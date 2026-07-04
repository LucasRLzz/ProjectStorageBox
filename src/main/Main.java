package main;

import domain.Project;
import domain.StatusProjeto;

public class Main {
	public static void main(String[] args) {
		
		try {
			Project projectTeste = new Project("ProjetoTeste", "Java", StatusProjeto.NAO_INICIADO);
			Project projectTeste2 = new Project(null, "Java", StatusProjeto.NAO_INICIADO);
			System.out.println(projectTeste.getNome());
			System.out.println(projectTeste.getLinguagem());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("");
		
	}
}