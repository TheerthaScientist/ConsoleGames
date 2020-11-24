import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.concurrent.TimeUnit;

class ConsoleGame {
	public static void blank() {

	}
	public static void q() {
	System.out.println("                                                                                       *****       ");
	System.out.println("                                                                                     **     **     ");
	System.out.println("                                                                                    **       **    ");
	System.out.println("                                                                                   **         **   ");
	System.out.println("                                                                                   **         **   ");
	System.out.println("                                                                                   **   *     **   ");
	System.out.println("                                                                                    **    *  **    ");
	System.out.println("                                                                                     **    **      ");
	System.out.println("                                                                                       ***** *     ");
	System.out.println("                                                                                              *    ");
	} 
	public static void qS() {
	System.out.println("                                                                          *****        *********   ");
	System.out.println("                                                                        **     **     **           ");
	System.out.println("                                                                       **       **    **           ");
	System.out.println("                                                                      **         **   **           ");
	System.out.println("                                                                      **         **    *********   ");
	System.out.println("                                                                      **   *     **            **  ");
	System.out.println("                                                                       **    *  **             **  ");
	System.out.println("                                                                        **    **               **  ");
	System.out.println("                                                                          ***** *      *********   ");
	System.out.println("                                                                                 *                 ");
	} 
	public static void qSp() {
	System.out.println("                                                             *****        *********   ********     ");
	System.out.println("                                                           **     **     **           **      **   ");
	System.out.println("                                                          **       **    **           **       **  ");
	System.out.println("                                                         **         **   **           **      **   ");
	System.out.println("                                                         **         **    *********   ********     ");
	System.out.println("                                                         **   *     **            **  **           ");
	System.out.println("                                                          **    *  **             **  **           ");
	System.out.println("                                                           **    **               **  **           ");
	System.out.println("                                                             ***** *      *********   **           ");
	System.out.println("                                                                    *                              ");
	} 
	public static void qSpi() {
	System.out.println("                                                   *****        *********   ********     ********  ");
	System.out.println("                                                 **     **     **           **      **      **     ");
	System.out.println("                                                **       **    **           **       **     **     ");
	System.out.println("                                               **         **   **           **      **      **     ");
	System.out.println("                                               **         **    *********   ********        **     ");
	System.out.println("                                               **   *     **            **  **              **     ");
	System.out.println("                                                **    *  **             **  **              **     ");
	System.out.println("                                                 **    **               **  **              **     ");
	System.out.println("                                                   ***** *      *********   **           ********  ");
	System.out.println("                                                          *                                        ");
	} 
	public static void qSpid() {
	System.out.println("                                      *****        *********   ********     ********  *******      ");
	System.out.println("                                    **     **     **           **      **      **     **     **    ");
	System.out.println("                                   **       **    **           **       **     **     **      **   ");
	System.out.println("                                  **         **   **           **      **      **     **       **  ");
	System.out.println("                                  **         **    *********   ********        **     **       **  ");
	System.out.println("                                  **   *     **            **  **              **     **       **  ");
	System.out.println("                                   **    *  **             **  **              **     **      **   ");
	System.out.println("                                    **    **               **  **              **     **     **    ");
	System.out.println("                                      ***** *      *********   **           ********  *******      ");
	System.out.println("                                             *                                                     ");
	} 
	public static void qSpide() {
	System.out.println("                           *****        *********   ********     ********  *******      *********  ");
	System.out.println("                         **     **     **           **      **      **     **     **    **         ");
	System.out.println("                        **       **    **           **       **     **     **      **   **         ");
	System.out.println("                       **         **   **           **      **      **     **       **  **         ");
	System.out.println("                       **         **    *********   ********        **     **       **  *********  ");
	System.out.println("                       **   *     **            **  **              **     **       **  **         ");
	System.out.println("                        **    *  **             **  **              **     **      **   **         ");
	System.out.println("                         **    **               **  **              **     **     **    **         ");
	System.out.println("                           ***** *      *********   **           ********  *******      *********  ");
	System.out.println("                                  *                                                                ");
	} 
	public static void qSpider() {
	System.out.println("               *****        *********   ********     ********  *******      *********  *******     ");
	System.out.println("             **     **     **           **      **      **     **     **    **         **     **   ");
	System.out.println("            **       **    **           **       **     **     **      **   **         **      **  ");
	System.out.println("           **         **   **           **      **      **     **       **  **         **     **   ");
	System.out.println("           **         **    *********   ********        **     **       **  *********  *******     ");
	System.out.println("           **   *     **            **  **              **     **       **  **         **   **     ");
	System.out.println("            **    *  **             **  **              **     **      **   **         **    **    ");
	System.out.println("             **    **               **  **              **     **     **    **         **     **   ");
	System.out.println("               ***** *      *********   **           ********  *******      *********  **      **  ");
	System.out.println("                      *                                                                            ");
	} 
	public static void qSpiders() {
	System.out.println("    *****        *********   ********     ********  *******      *********  *******      *******   ");
	System.out.println("  **     **     **           **      **      **     **     **    **         **     **   **         ");
	System.out.println(" **       **    **           **       **     **     **      **   **         **      **  **         ");
	System.out.println("**         **   **           **      **      **     **       **  **         **     **   **         ");
	System.out.println("**         **    *********   ********        **     **       **  *********  *******      *******   ");
	System.out.println("**   *     **            **  **              **     **       **  **         **   **            **  ");
	System.out.println(" **    *  **             **  **              **     **      **   **         **    **           **  ");
	System.out.println("  **    **               **  **              **     **     **    **         **     **          **  ");
	System.out.println("    ***** *      *********   **           ********  *******      *********  **      **   *******   ");
	System.out.println("           *                                                     ");
	} 


	public static void clrscr(){
		try {
	    	
	        if (System.getProperty("os.name").contains("Windows"))

	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

	        else

	            Runtime.getRuntime().exec("clear");

	    } catch (IOException | InterruptedException ex) {}
	}

	public static void main(String [] args) {
		int num = 999999;
		while(true) {
			clrscr(); q(); Delay();clrscr(); qS();Delay();
			clrscr();qSp();Delay();clrscr();qSpi();Delay();
			clrscr();qSpid();Delay();clrscr();qSpide();Delay();
			clrscr();qSpider();Delay();clrscr();qSpiders();Delay();clrscr();Delay();
		}
	}
	public static void Delay() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}