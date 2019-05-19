package Password;

public class Score {
	int bonus;int punish;
public int ScoreBonus(int number,int input,int luckynumber){
	if((number==input)&&(input==luckynumber)){
		bonus=bonus+500;
	}
	return bonus;
}
public int ScorePunish(int round){
	if(round%5==0){
		punish=punish-300;
	}
	return punish;
}
}
