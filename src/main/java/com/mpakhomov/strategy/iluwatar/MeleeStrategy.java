package com.mpakhomov.strategy.iluwatar;

/**
 * 
 * Melee strategy.
 *
 */
public class MeleeStrategy implements DragonSlayingStrategy {

	@Override
	public void execute() {
		System.out.println("With your Excalibur you severe the dragon's head!");
	}

}
