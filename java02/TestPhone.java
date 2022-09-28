public class TestPhone {

    public static void main(String[] args) {

        String statusScreen;

        Phone cel1 = new Phone(false, 50, 6, 1170, 2532);
        Phone cel2 = new Phone(true, 100, 7, 1440, 3088);

        System.out.println(" Primeiro Objeto: \n");
        if (cel1.getScreenOn()) {
            statusScreen = "Ligada";
        } else {
            statusScreen = "Desligada";
        }

        System.out.println("Estado atual tela: " + statusScreen);
        System.out.println("Brilho atual tela: " + cel1.getScreenBrightness() + "%");
        System.out.println("Polegadas do display: " + cel1.getInchesScreen());
        System.out.println("Largura da display: " + cel1.getDisplayWidth() + "px");
        System.out.println("Altura do display: " + cel1.getDisplayHeight() + "px");

        cel1.changeScreen(true);
        cel1.changeScreenBrightness(100);
        cel1.pixelDensity();

        System.out.println("\n Atualização do Primeiro Objeto: \n");

        System.out.println("Estado atual tela: " + statusScreen);
        System.out.println("Brilho atual tela: " + cel1.getScreenBrightness() + "%");
        System.out.println("Polegadas do display: " + cel1.getInchesScreen());
        System.out.println("Largura da display: " + cel1.getDisplayWidth() + "px");
        System.out.println("Altura do display: " + cel1.getDisplayHeight() + "px");

        cel1.getScreenOn();
        cel1.getScreenBrightness();
        cel1.getInchesScreen();
        cel1.getDisplayWidth();
        cel1.getDisplayHeight();

        System.out.println("\n==================================");
        System.out.println("Segundo Objeto: \n");

        System.out.println(" Primeiro Objeto: \n");
        if (cel2.getScreenOn()) {
            statusScreen = "Ligada";
        } else {
            statusScreen = "Desligada";
        }

        System.out.println("Estado atual tela: " + statusScreen);
        System.out.println("Brilho atual tela: " + cel2.getScreenBrightness() + "%");
        System.out.println("Polegadas do display: " + cel2.getInchesScreen());
        System.out.println("Largura da display: " + cel2.getDisplayWidth() + "px");
        System.out.println("Altura do display: " + cel2.getDisplayHeight() + "px");

        cel2.changeScreen(false);
        cel2.changeScreenBrightness(0);
        cel2.pixelDensity();

        System.out.println("\n Atualização do Segundo Objeto: \n");

        System.out.println("Estado atual tela: " + statusScreen);
        System.out.println("Brilho atual tela: " + cel2.getScreenBrightness() + "%");
        System.out.println("Polegadas do display: " + cel2.getInchesScreen());
        System.out.println("Largura da display: " + cel2.getDisplayWidth() + "px");
        System.out.println("Altura do display: " + cel2.getDisplayHeight() + "px");

    }

}