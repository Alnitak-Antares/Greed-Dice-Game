package greed_game;

public class PlayerManager {
	private int turnscore;
	public void Start() {
		
		
	}
	public void getRollScore() {
		int now_roll_number=dices.getNumber();
		int[] rollscore=new int[now_roll_number];
		rollscore=new Dices.GetPoint();
		int[7] roll;
		for(int score=1;score<=6;score++) roll[score]=0;
		int nowscore=0,decroll=0;
		if (roll[1]==6) {
			roll[1]-=6;
			nowscore+=3000;
			decroll+=6;
		}
		if (roll[1]>=3) {
			roll[1]-=3;
			nowscore+=1000;
			decroll+=3;
		}
		for(int score=2;score<=6;score++) {
			if (roll[score]>=3) {
				roll[score]-=3;
				nowscore+=score*100;
				decroll+=3;
			}
			if (roll[score]>=3) {
				roll[score]-=3;
				nowscore+=score*100;
				decroll+=3;
			}
		}
		while (roll[1]>0) {
			roll[1]--;
			nowscore+=100;
			decroll++;
		}
		while (roll[5]>0) {
			roll[5]--;
			nowscore+=50;
			decroll++;
		}
		
	}
	
	public void scoreToPlayer(int nowplayer) {
		players[nowplayer].SetHandScore();
		
	}
	public void ScoreToView() {
		players[]
		
		
	}
	public void SetDices() {
		
		
	}
	
}
