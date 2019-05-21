package Password;

import java.util.Random;
import java.util.Scanner;

public class Passwordgame {

	public static void main(String[] args) {
		System.out.println("請選擇遊戲模式");
		System.out.print("1.單人模式"+"\t");
		System.out.print("2.對戰模式"+"\t");
		System.out.println("3.結束");
		
		Rule rule = new Rule();
		Scanner choose = new Scanner(System.in);
		String item;
		item= choose.nextLine();
		int finalchoose = Integer.parseInt(item);
		
		
		if(finalchoose==1){
		System.out.println("請輸入玩家名稱:");
		Scanner name = new Scanner(System.in);
		String player;
		player= name.nextLine();
		Person p = new Person(player);
				
		System.out.println("請輸入你的幸運號碼:");
		Scanner luckynumber = new Scanner(System.in);
		p.luckynumber= luckynumber.nextLine();
		int lucky = Integer.parseInt(p.luckynumber);
		if((lucky<=1)||(lucky>=100)){
			System.out.println("錯誤，請重新開始");
			return;
		}
		System.out.println("你的幸運號碼是:"+lucky);

		Random r = new Random();
		Score s = new Score();
		int upline = 100; int input=1;int downline=1;int round=0;int dnuor=0;
		int number = r.nextInt(100)+1;
		while((number==100)||(number==1)){
			number = r.nextInt(100)+1;
		}
	

		System.out.println("範圍:"+downline+"~"+upline+"\t");
		int[] e= new int[100];
		while(number!=input){
			round=round+1;
			
		System.out.println("請輸入數字:");
		Scanner n = new Scanner(System.in);
		input=Integer.parseInt(n.nextLine());
		
		if((input<=0)||(input<=downline)||(input>=upline)){
			System.out.println("錯誤，得分:-200");
			System.out.println("請重新輸入");
			round=round-1;
			dnuor=dnuor+1;
			continue;
		}
		
		
		 if(input<number){
			 System.out.println("得分:100");
				System.out.println("範圍:"+input+"~"+upline+"\t");
				int tmp = input;
				input=downline;
				 downline=tmp;
				e[round]=tmp;
				}
		else if(input>number){
				System.out.println("得分:100");
				System.out.println("範圍:"+downline+"~"+input+"\t");
				int tmp = input;
				input=upline;
				upline=tmp;
				e[round]=tmp;
			}
		if(round%5==0){
			System.out.println("過了5回合，得分:-300");
		}
		s.bonus = s.ScoreBonus(number, input, lucky);
		s.punish = s.ScorePunish(round);
		}
		System.out.println("Bomb!The game is over.");
		System.out.println("共猜了"+round+"回合");
		System.out.println("你的總分為:"+((round*100)-(dnuor*200)+s.bonus+s.punish)+"分");
		System.out.println("歷史紀錄");
		for(int i=1;i<round;i++){
			System.out.print(e[i]+"\t");
		}
		System.out.print(number);
	}

		if(finalchoose==2){
			Person p1 = new Person();
			Person p2 = new Person();
		System.out.println("請輸入玩家1的名稱:");
		Scanner name1 = new Scanner(System.in);
		p1.name= name1.nextLine();
		
		
		System.out.println("請輸入玩家2的名稱:");
		Scanner name2 = new Scanner(System.in);
		p2.name=name2.nextLine();
		
				
		System.out.print("玩家1的名稱為:"+p1.name+"\t");
		System.out.println("玩家2的名稱為:"+p2.name);
		
		System.out.println("請輸入最大的數字:");
		Scanner number = new Scanner(System.in);
		String max;
		max = number.nextLine();
		int upline = Integer.parseInt(max);
		if(upline<=0){
			System.out.println("錯誤，請重新開始");
			return;
		}
		Random r = new Random();
		int input=1;int downline=1;int round=0;
		int num = r.nextInt(upline)+1;
		while(num==upline){
			num = r.nextInt(upline)+1;
		}
		System.out.println(upline);

		System.out.println("範圍:"+downline+"~"+upline+"\t");
		int[] e= new int[upline];
		while(num!=input){
			round=round+1;
			
		System.out.println("請輸入數字:");
		Scanner n = new Scanner(System.in);
		input=Integer.parseInt(n.nextLine());
		
		if((input<=0)||(input<=downline)||(input>=upline)){
			System.out.println("請重新輸入");
			round=round-1;
			continue;
		}
		
		
		 if(input<num){
				System.out.println("範圍:"+input+"~"+upline+"\t");
				int tmp = input;
				input=downline;
				 downline=tmp;
				e[round]=tmp;
				}
		else if(input>num){
				System.out.println("範圍:"+downline+"~"+input+"\t");
				int tmp = input;
				input=upline;
				upline=tmp;
				e[round]=tmp;
			}

				}
		
		if(round%2==0){
			System.out.println(p1.name+"獲勝");
		}
		else if(round%2==1){
			System.out.println(p2.name+"獲勝");
		}
		
	
	
}
		if(finalchoose==3){
			System.out.println("掰掰囉~");
			return;
		}
	}
	}	
	
