import java.lang.Math;

public class Phone {

    private boolean screenOn;
    private int screenBrightness;
    private int inchesScreen;
    private int displayWidth;
    private int displayHeight;

    public Phone(boolean screenOn, int screenBrightness, int inchesScreen, int displayWidth, int displayHeight) {
        this.screenOn = screenOn;
        this.screenBrightness = screenBrightness;
        this.inchesScreen = inchesScreen;
        this.displayWidth = displayWidth;
        this.displayHeight = displayHeight;
    }

    // Método que ativada ou desativada a Tela
    public boolean getScreenOn() {
        return screenOn;
    }

    public void setScreenOn(boolean screenOn) {
        this.screenOn = screenOn;
    }

    public void changeScreen(boolean screenOn) {
        setScreenOn(screenOn);
    }

    // Método que modifica o brilho da tela
    public int getScreenBrightness() {
        return screenBrightness;
    }

    public void setScreenBrightness(int screenBrightness) {

        if (screenBrightness >= 0 && screenBrightness < 101) {
            this.screenBrightness = screenBrightness;
        } else {
            System.out.println("Ooops, informe um valor inteiro, positivo entre 0 e 100");
        }

    }

    public void changeScreenBrightness(int screenBrightness) {
        setScreenBrightness(screenBrightness);
    }

    // Método que calcula a densidade de pixels
    public int getInchesScreen() {
        return inchesScreen;
    }

    public void setInchesScreen(int inchesScreen) {

        if (inchesScreen >= 0) {
            this.inchesScreen = inchesScreen;
        } else {
            System.out.println("Ooops, informe um valor inteiro e positivo");
        }

    }

    public int getDisplayWidth() {
        return displayWidth;
    }

    public void setDisplayWidth(int displayWidth) {

        if (displayWidth >= 0) {
            this.displayWidth = displayWidth;
        } else {
            System.out.println("Ooops, informe um valor inteiro e positivo");
        }

    }

    public int getDisplayHeight() {
        return displayHeight;
    }

    public void setDisplayHeight(int displayHeight) {

        if (displayHeight >= 0) {
            this.displayHeight = displayHeight;
        } else {
            System.out.println("Ooops, informe um valor inteiro e positivo");
        }

    }

    public void pixelDensity() {

        int perimeter = (int) Math.pow(this.displayWidth, 2) + (int) Math.pow(this.displayHeight, 2);
        System.out.println("Densidade de pixels: " + (int) Math.sqrt(perimeter)/(this.inchesScreen) + "ddi");

    }

}
