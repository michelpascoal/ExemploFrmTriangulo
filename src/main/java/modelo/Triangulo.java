package modelo;

/**
 * Classe responsável por representar um triângulo e calcular sua área.
 * Contém atributos base e altura, além de métodos getters, setters e cálculo.
 */
public class Triangulo {
    private double base;
    private double altura;

    /**
     * Construtor padrão.
     */
    public Triangulo() {
        this.base = 0;
        this.altura = 0;
    }

    /**
     * Construtor com parâmetros.
     * 
     * @param base   Base do triângulo.
     * @param altura Altura do triângulo.
     */
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Getters e Setters

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Método que calcula a área do triângulo.
     * 
     * @return Área calculada (base * altura / 2).
     */
    public double getArea() {
        return (base * altura) / 2;
    }
}


