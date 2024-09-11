package com.boo;

public interface GameElementFactory {
	Enemy createEnemy();
    Weapon createWeapon();
    PowerUp createPowerUp();
}
