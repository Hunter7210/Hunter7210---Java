package ExercicioPOO3;

public class Elevador {
    //construir o elevador
    //atributos do elevador
    
    int nMaxAndares;
    int nMaxPessoas;
    int andarAtual;
    int capacidadeAtual;
    //construtor
    public Elevador(int nMaxAndares, int nMaxPessoas) {
        this.nMaxAndares = nMaxAndares;
        this.nMaxPessoas = nMaxPessoas;
    }
    
    public int getnMaxAndares() {
        return nMaxAndares;
    }
    public void setnMaxAndares(int nMaxAndares) {
        this.nMaxAndares = nMaxAndares;
    }
    public int getnMaxPessoas() {
        return nMaxPessoas;
    }
    public void setnMaxPessoas(int nMaxPessoas) {
        this.nMaxPessoas = nMaxPessoas;
    }
    public int getAndarAtual() {
        return andarAtual;
    }
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }
    public int getCapacidadeAtual() {
        return capacidadeAtual;
    }
    public void setCapacidadeAtual(int capacidadeAtual) {
        this.capacidadeAtual = capacidadeAtual;
    }
    

}
