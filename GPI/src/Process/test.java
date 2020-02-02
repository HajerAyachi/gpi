package Process;

import data.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		System.out.println("Equipe 1");
		Team ep=EquipeProcess.EquipeProcess("France");		
		ep.String();
		
		
		System.out.println("Equipe 2");
		Team e2=EquipeProcess.EquipeProcess("Belgique");		
		e2.String();
		
		System.out.println("Test �quipe skills");
		
		Match m = MatchProcess.MatchProcess(ep,e2);
		System.out.println(m.toString());
		
	}

}
