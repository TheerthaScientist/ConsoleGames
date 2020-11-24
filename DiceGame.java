import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.concurrent.TimeUnit;

class DiceGame {
	public static void delay() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void clrConsole(){
		try {
	    	
	        if (System.getProperty("os.name").contains("Windows"))

	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

	        else

	            Runtime.getRuntime().exec("clear");

	    } catch (IOException | InterruptedException ex) {}
	}

	public static void header(int u_score, int b_score){
		System.out.println("===============================================================================================");
		System.out.println("||                                        DICE GAME                                          ||");
		System.out.println("||                                    -----------------                                      ||");
		System.out.println("||  You                                                                      Opponent : BOT  ||");
		System.out.println("||  your Score : "+u_score+"                                                         BOT Score : "+b_score+"   ||");
		System.out.println("||                                                                                           ||");
	}

	public static void footerPlay() {
		System.out.println("||                                                                                           ||");
		System.out.println("||      -----------                                                                          ||");
		System.out.println("||     (   PLAY    )                                                                         ||");
		System.out.println("||      -----------                                                                          ||");
		System.out.println("===============================================================================================");
	}

	public static void footerRoll() {
		System.out.println("||                                                                                           ||");
		System.out.println("||      -----------                                                                          ||");
		System.out.println("||     (   ROLL    )                                                           QUIT          ||");
		System.out.println("||      -----------                                                                          ||");
		System.out.println("===============================================================================================");
	}
	public static void footerQuit() {
		System.out.println("||                                                                                           ||");
		System.out.println("||                                                                         -----------       ||");
		System.out.println("||         ROLL                                                           (    QUIT   )      ||");
		System.out.println("||                                                                         -----------       ||");
		System.out.println("===============================================================================================");
	}

	public static void rules() {
		System.out.println("===============================================================================================");
		System.out.println("||    Rules                                                                                  ||");
		System.out.println("|| -----------                                                                               ||");
		System.out.println("|| 1.> Use Full Screen for better experience                                                 ||");
		System.out.println("|| 2.> Use keypad for navigation number+enter                       up-8                     ||");
		System.out.println("||                                                                                           ||");
		System.out.println("||                                                       left-4     5-OK     Right-6         ||");
		System.out.println("||                                                                                           ||");
		System.out.println("||                                                                 down-2                    ||");
		System.out.println("|| 3.> Use QUIT button to exit                                                               ||");
		System.out.println("|| 4.> Use (ctrl+c) to terminate program                                                     ||");
		System.out.println("|| 4.> HOW TO PLAY : for every roll of dice, one  who gets less number will subtracted from  ||");
		System.out.println("||     his score                                                                             ||");
		System.out.println("|| 5.> TO WIN : Should not lose all score before Opponent does                               ||");
		System.out.println("===============================================================================================");

	}

	public static void field(int dice1, int dice2){
		System.out.println("===============================================================================================");
		System.out.println("||                                                                                           ||");
		System.out.println("||      ( your Dice )                                                     ( BOT Dice )       ||");
		System.out.println("||     +=========+                                                        +=========+        ||");
		System.out.println("||     |         |                                                        |         |        ||");
		System.out.println("||     |    "+dice1+"    |                                                        |    "+dice2+"    |        ||");
		System.out.println("||     |         |                                                        |         |        ||");
		System.out.println("||     +=========+                                                        +=========+        ||");
		System.out.println("||                                                                                           ||");
		System.out.println("===============================================================================================");
	}

	public static void result(boolean r) {
		if(r) {
			System.out.println("===============================================================================================");
			System.out.println("||                                                                                           ||");
			System.out.println("||                                                                                           ||");
			System.out.println("||                                                                                           ||");
			System.out.println("||                                 Congradulations...!!!!!                                   ||");
			System.out.println("||                               !!...you won the match..!!                                  ||");
			System.out.println("||                                                                                           ||");
			System.out.println("||                                                                                           ||");
			System.out.println("||                                                                                           ||");
			System.out.println("===============================================================================================");
		}
		else {
			System.out.println("===============================================================================================");
			System.out.println("||                                                                                           ||");
			System.out.println("||                                                                                           ||");
			System.out.println("||                                                                                           ||");
			System.out.println("||                                       Regret...!!!!!                                      ||");
			System.out.println("||                               !!...you Lost the match..!!                                 ||");
			System.out.println("||                                                                                           ||");
			System.out.println("||                                                                                           ||");
			System.out.println("||                                                                                           ||");
			System.out.println("===============================================================================================");

		}

	}

	public static void table() {
		System.out.println("||                                                                                           ||");
		System.out.println("||  OK : (5 -> enter)               LEFT : (4 -> enter)             RIGHT : (6 -> enter)     ||");
		System.out.println("||  EXIT : (control+c)                                                                       ||");
		System.out.println("===============================================================================================");
	}
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		clrConsole();
		header(30,30);
		rules();
		footerPlay();
		table();
		int flag=1, dice1=1, dice2=1;
		int u_score=30, b_score=30;
		int choice=0;
		do {
			choice = ip.nextInt();
			switch(choice) {
				case 4: {
					clrConsole();
					header(u_score,b_score);
					rules();
					footerPlay();
					table();
					choice = ip.nextInt();
					if(choice==5) {
						continue;
					}

				} break;
				case 5: {
					dice1 = (int)(Math.random()*(6)+1);
					dice2 = (int)(Math.random()*(6)+1);
					if(dice1<dice2) {
						u_score -= dice1;
						clrConsole();
						header(u_score,b_score);
						field(dice1,dice2);
						footerRoll();
						table();
						if(u_score<=0 || b_score<=0) {
							clrConsole();
							header(u_score,b_score);
							if(b_score<=0)
								result(true);
							else
								result(false);
							footerPlay();
							flag=0;
							break;
						}
					}
					else if(dice2<dice1) {
						b_score -= dice2;
						clrConsole();
						header(u_score,b_score);
						field(dice1,dice2);
						footerRoll();
						table();
						if(u_score<=0 || b_score<=0) {
							clrConsole();
							header(u_score,b_score);
							if(b_score<=0)
								result(true);
							else
								result(false);
							footerPlay();
							flag=0;
							break;
						}
					}

				} break;
				case 6: {
					clrConsole();
					header(u_score,b_score);
					field(dice1,dice2);
					footerQuit();
					table();
					choice = ip.nextInt();
					if(choice==5) {
						flag=0;
						break;
					}

				} break;
//				default:flag=0;
			}
		} while(flag!=0);

		
	}


}