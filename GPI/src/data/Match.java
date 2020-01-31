package data;

public class Match {

	private Team team1;
	private Team team2;
	private String result;
	private String stadium;
	private int goal1;
	private int goal2;
	private String date;
	private String time;
	public Match(Team t1,Team t2,String result,String stadium,int goal1,int goal2,String date,String time) {
		result = null;
		goal1 = 0;
		goal2 = 0;
		stadium = this.stadium;
		date = this.stadium;
		time = this.time;
		t1 = this.team1;
		t2 = this.team2;
		
	}
	public Team getTeam1() {
		return team1;
	}
	public void setTeam1(Team team1) {
		this.team1 = team1;
	}
	public Team getTeam2() {
		return team2;
	}
	public void setTeam2(Team team2) {
		this.team2 = team2;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getStadium() {
		return stadium;
	}
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	public int getGoal1() {
		return goal1;
	}
	public void setGoal1(int goal1) {
		this.goal1 = goal1;
	}
	public int getGoal2() {
		return goal2;
	}
	public void setGoal2(int goal2) {
		this.goal2 = goal2;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Match [team1=" + team1 + ", team2=" + team2 + ", result=" + result + ", stadium=" + stadium + ", goal1="
				+ goal1 + ", goal2=" + goal2 + ", date=" + date + ", time=" + time + "]";
	}
	
}
