public class Animal {
    private double peso;
    private String especie;
    private double altura;
    private double largura;
    private String cor;

    public Animal(double peso, String especie, double altura, double largura, String cor) {
        this.peso = peso;
        this.especie = especie;
        this.altura = altura;
        this.largura = largura;
        this.cor = cor;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    public void setCor(String cor) {
        this.cor = cor;
    } 
    public void setAnimal(double peso, String especie, double altura, double largura, String cor){
        setPeso(peso);
        setEspecie(especie);
        setAltura(altura);
        setLargura(largura);
        setCor(cor);
    }
    @Override
    public boolean equals(Object comparacao){
        if (this == comparacao) return true;
        if (!(comparacao instanceof Animal)) return false;
        Animal bicho = (Animal)comparacao;
        return bicho.peso ==(this.peso)&& bicho.especie == (this.especie)&& bicho.altura == (this.altura) &&bicho.largura == (this.largura) && bicho.cor == (this.cor) ; 
    }
    @Override
    public String toString(){
        
        return "Peso: " + this.peso + "Kg" + "\nEspecie: " + this.especie + "\nAltura: " + this.altura + "cm" + "\nLargura: " + this.largura + "cm" + "\nCor: " + this.cor;  
    }
}