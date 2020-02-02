package data;

import java.util.ArrayList;

public class Team {
	private String name;
	private int ranking;
	
	private ArrayList<Goalkeeper> keeper;
	public ArrayList<Goalkeeper> getKeeper() {
		return keeper;
	}

	public void setKeeper(ArrayList<Goalkeeper> keeper) {
		this.keeper = keeper;
	}

	public ArrayList<Forward> getForw() {
		return forw;
	}

	public void setForw(ArrayList<Forward> forw) {
		this.forw = forw;
	}

	public ArrayList<Defender> getDef() {
		return def;
	}

	public void setDef(ArrayList<Defender> def) {
		this.def = def;
	}

	public Coach getC() {
		return c;
	}

	public void setC(Coach c) {
		this.c = c;
	}

	private ArrayList<Forward> forw;
	private ArrayList<Defender> def;
	
	private Coach c;
	
	public Team() {
		name="test";
		ranking=0;
		keeper=null;
		forw=null;
		def=null;
		c=null;
	}
	
	
	public Team(String name,ArrayList<Goalkeeper> keeper,ArrayList<Forward> forw, ArrayList<Defender> def,Coach c) {
		name="test";
		ranking=0;
		this.keeper=keeper;
		this.forw=forw;
		this.def=def;
		this.c=c;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
	public void String() {
		System.out.println( "EquipeProcess [keeper=" + keeper + ", forw=" + forw + ", def=" + def + ", c=" + c + "]");
		System.out.println("nombre gadien équipe"+keeper.size()+"-nombre attaquant équipe"+forw.size()+"--nombre defender équipe-"+def.size()+"---niveau du coach"+c.getSkill());
		int numberPlayer=0;
		for(int i=0;i<def.size();i++) {
			Defender d=def.get(i);
			if(d.isSubstitute()) {
				numberPlayer++;
			}
		
		}
		System.out.println("nombre defenseur non remplacant ="+numberPlayer);
		numberPlayer=0;
		
		for(int i=0;i<keeper.size();i++) {
			Goalkeeper d=keeper.get(i);
			if(d.isSubstitute()) {
				numberPlayer++;
			}
		}
		System.out.println("nombre gardien non remplacant ="+numberPlayer);
		
		numberPlayer=0;
		
		for(int i=0;i<forw.size();i++) {
			Forward d=forw.get(i);
			if(d.isSubstitute()) {
				numberPlayer++;
			}
		}
		System.out.println("nombre attaquant non remplacant ="+numberPlayer);
		
		for(int i=0;i<forw.size();i++) {
			Forward d=forw.get(i);
			System.out.println("nom du joueur :"+d.getName()+"  vitesse  "+d.getSpeed()+"  niveau de tir sp�cial "+ d.getPerfect_shoot()+"  niveau de dribble: "+d.getDrible() );
		}
	}

	
}
