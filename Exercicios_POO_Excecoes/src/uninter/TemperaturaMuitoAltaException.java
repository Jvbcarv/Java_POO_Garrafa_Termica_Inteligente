package uninter;

public class TemperaturaMuitoAltaException extends Exception{
	public TemperaturaMuitoAltaException(String mensagem) {
        super(mensagem);
    }
}
// Cria uma exceção personalizada. Herda da classe Exception.
// Serve para lançar um erro específico quando a temperatura da garrafa estiver acima do limite permitido (80°C).
