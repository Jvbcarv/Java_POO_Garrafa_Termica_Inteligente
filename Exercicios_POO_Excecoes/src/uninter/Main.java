package uninter;

public class Main {

	public static void main(String[] args) {

		// Criando duas garrafas com a mesma marca
        GarrafaTermica g1 = new GarrafaTermica("TermoTech", 75);
        GarrafaTermica g2 = new GarrafaTermica("TermoTech", 85);

        // Comparação com ==
        System.out.println("Comparando com == : " + (g1 == g2)); // false

        // Comparação com equals
        System.out.println("Comparando com equals: " + g1.equals(g2)); // true

        // Imprimindo toString
        System.out.println(g1.toString());

        // Monitorando temperatura
        MonitorDeTemperatura monitor = MonitorDeTemperatura.getInstancia();
        monitor.definirGarrafa(g2); // g2 está com 85°C

        try {
            monitor.verificarTemperatura();
        } catch (TemperaturaMuitoAltaException e) {
            System.out.println("Alerta: " + e.getMessage());
        }

	}

}
