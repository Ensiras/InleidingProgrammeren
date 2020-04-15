package noelVaes.h20Collections;

public enum Coin {
    FIVE_CENT(0.05f),
    TEN_CENT(0.10f),
    TWENTY_CENT(0.20f),
    FIFTY_CENT(0.50f),
    ONE_EURO(1.00f),
    TWO_EURO(2.00f);

    private float value;

    private Coin(float value) {
        this.value = value;
    }

    public float getValue() {
        return this.value;
    }
}
