package h13;

import h10.Chargeable;
import h10.LevelTooHighException;

public class Android extends Human implements Chargeable {

    private int level;

    public Android(int level) {
        setLevel(level);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level > 100) {
            throw new LevelTooHighException("Charge rejected. Energy level too high");
        }
        this.level = level;
    }

    public String greet() {
        return "I'm only half human, but human still... My energy level is " + getLevel() + "%.";
    }

    @Override
    public int charge(int amount) {
        int chargeLevel = getLevel() + amount;
        setLevel(chargeLevel);
        return level;
    }
}
