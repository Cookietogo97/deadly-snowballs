package cookietogo97.deadlysnowballs;

import turniplabs.halplibe.helper.ItemBuilder;

public class DeadlySnowballsItems {

	public static Snowball snowball;

	ItemBuilder itemBuilder = new ItemBuilder("deadlysnowballs");

	public void Initialize() {
		snowball = itemBuilder.build((new Snowball("ammo.snowball.heavy", 20020)));
	}
}
