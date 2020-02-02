package Process;

import java.util.ArrayList;

import data.Defender;
import data.Forward;
import data.Goalkeeper;
import data.*;

public class MatchProcess {
	private static ArrayList<Integer> scoreA  = new ArrayList<Integer>();
	private static ArrayList<Integer> scoreB = new ArrayList<Integer>();
	
	public static Match MatchProcess(Team a, Team b) {
		
		Match m = new Match(a, b, null, null, 0, 0, null, null);
		Score(m);
		
		return m;

	}
	
	public static void Score(Match m) {
		String winner="égalité";
		if(ScoreGoal(m.getTeam1().getKeeper()) > ScoreGoal(m.getTeam2().getKeeper())) {
			scoreA.add(1);
			scoreB.add(0);
		}
		else {
			scoreB.add(1);
			scoreA.add(0);
		}
		if(ScoreForward(m.getTeam1().getForw()) > ScoreForward(m.getTeam2().getForw())) {
			scoreA.add(1);
			scoreB.add(0);
		}
		else {
			scoreB.add(1);
			scoreA.add(0);
		}
		if(ScoreDefender(m.getTeam1().getDef()) > ScoreDefender(m.getTeam2().getDef())) {
			scoreA.add(1);
			scoreB.add(0);
		}
		else {
			scoreB.add(1);
			scoreA.add(0);
		}
		
		for (int i=0; i<scoreA.size(); i++) {
			if (scoreA.get(i)>scoreB.get(i)) {
				m.setGoal1(m.getGoal1() + 1);
			}
			else m.setGoal2(m.getGoal2() + 1);
		}
		if(m.getGoal1()<m.getGoal2()) {
			winner=m.getTeam1().getName();
		}
		else if(m.getGoal1()>m.getGoal2()) {
			winner=m.getTeam2().getName();
		}
		m.setResult("scoreA : "+scoreA+" scoreB "+scoreB+", Winner : "+winner);
	}
	public static int ScoreGoal(ArrayList<Goalkeeper> keeper) {
		int score=0;
		for (int i=0; i<keeper.size(); i++) {
			if(keeper.get(i).isSubstitute()){
				score = score + keeper.get(i).getPlunge();
				score = score + keeper.get(i).getPosition();
			}
		}
		return score;
	}
	public static int ScoreForward(ArrayList<Forward> forw) {
		int score=0;
		for (int i=0; i<forw.size(); i++) {
			if(forw.get(i).isSubstitute()){
				score = score + forw.get(i).getPerfect_shoot();
				score = score + forw.get(i).getDrible();
			}
		}
		return score;
	}
	public static int ScoreDefender(ArrayList<Defender> def) {
		int score=0;
		for (int i=0; i<def.size(); i++) {
			if(def.get(i).isSubstitute()){
				score = score + def.get(i).getPhysique();
				score = score + def.get(i).getTackle();
			}
		}
		return score;
	}
}
