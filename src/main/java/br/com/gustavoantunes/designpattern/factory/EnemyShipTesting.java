package br.com.gustavoantunes.designpattern.factory;

import java.util.Scanner;

public class EnemyShipTesting {

//	Código sem a factory
//	public static void main(String[] args) {
//		
//		EnemyShip theEnemy = null;
//
//		Scanner userInput = new Scanner(System.in);
//
//		String enemyShipOption = "";
//
//		System.out.println("What type of ship? (U / R)");
//
//		if (userInput.hasNextLine()) {
//			enemyShipOption = userInput.nextLine();
//		}
//		
//		if(enemyShipOption.equals("U")) {
//			theEnemy = new UFOEnemyShip();
//		} else if(enemyShipOption.equals("R")) {
//			theEnemy = new RocketEnemyShip();
//		}
//		
//
//		doStuffEnemy(theEnemy);
//
//	}

	// Código utilizando a factory
	public static void main(String[] args) {

		EnemyShipFactory factory = new EnemyShipFactory();

		EnemyShip theEnemy = null;

		System.out.println("What type of ship? (U / R / B)");

		Scanner userInput = new Scanner(System.in);

		if (userInput.hasNextLine()) {
			String enemyShipOption = userInput.nextLine();
			theEnemy = factory.makeEnemyShip(enemyShipOption);
		}

		if (theEnemy != null)
			doStuffEnemy(theEnemy);

	}

	private static void doStuffEnemy(EnemyShip ufoShip) {
		ufoShip.displayEnemyShip();
		ufoShip.followHeroShip();
		ufoShip.enemyShipShoots();
	}

}
