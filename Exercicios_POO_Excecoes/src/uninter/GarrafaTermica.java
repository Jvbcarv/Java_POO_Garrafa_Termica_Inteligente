package uninter;

public class GarrafaTermica {
	 	private String marca;
	    private double temperaturaAtual;

	    //Construtor
	    public GarrafaTermica(String marca, double temperaturaAtual) {
	        this.marca = marca;
	        this.temperaturaAtual = temperaturaAtual;
	    }
	    
	    //Get e Set
	    public String getMarca() {
	        return marca;
	    }

	    public void setMarca(String marca) {
	        this.marca = marca;
	    }

	    public double getTemperaturaAtual() {
	        return temperaturaAtual;
	    }

	    public void setTemperaturaAtual(double temperaturaAtual) {
	        this.temperaturaAtual = temperaturaAtual;
	    }
	    
	    //toString(): Sobrescreve o método toString() da classe Object, para retornar uma representação legível da garrafa.
	    @Override
	    public String toString() {
	        return String.format("Garrafa da marca %s com temperatura de %.2fgraus", marca, temperaturaAtual);
	    }

	    //equals(): compara duas garrafas. Considera que duas garrafas são iguais se tiverem a mesma marca, mesmo que sejam objetos diferentes.
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        GarrafaTermica outra = (GarrafaTermica) obj;
	        return this.marca.equals(outra.marca);
	    }
}
