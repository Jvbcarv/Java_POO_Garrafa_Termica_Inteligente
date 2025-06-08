package uninter;

public class MonitorDeTemperatura {
	private static MonitorDeTemperatura instancia; //Singleton. A classe monitora a temperatura da garrafa. Usa o padrão Singleton, ou seja, só existe uma instância dessa classe.
    private GarrafaTermica garrafaMonitorada;

    //Construtor privado e método getInstancia()
    //Obs.: O construtor é privado para impedir que outras classes criem objetos diretamente.
    //getInstancia() cria a única instância se ela ainda não existir, ou retorna a já existente.
    private MonitorDeTemperatura() {
    }

    public static MonitorDeTemperatura getInstancia() {
        if (instancia == null) {
            instancia = new MonitorDeTemperatura();
        }
        return instancia;
    }
    
    //Método definirGarrafa(GarrafaTermica g): Define qual garrafa será monitorada.
    public void definirGarrafa(GarrafaTermica garrafa) {
        this.garrafaMonitorada = garrafa;
    }
    
    //Método verificarTemperatura(): Verifica se a temperatura da garrafa é maior que 80°C. Se for, lança a exceção personalizada com uma mensagem informando o problema.
    public void verificarTemperatura() throws TemperaturaMuitoAltaException {
        if (garrafaMonitorada == null) {
            System.out.println("Nenhuma garrafa definida para monitoramento.");
            return;
        }

        if (garrafaMonitorada.getTemperaturaAtual() > 80) {
            throw new TemperaturaMuitoAltaException(
                "Temperatura muito alta na garrafa " + garrafaMonitorada.getMarca() +
                ": " + garrafaMonitorada.getTemperaturaAtual() + "graus"
            );
        } else {
            System.out.println("Temperatura normal: " + garrafaMonitorada.getTemperaturaAtual() + " graus");
        }
    }
}
