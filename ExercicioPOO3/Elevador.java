package ExercicioPOO3;

public class Elevador {
    // construir o elevador
    // atributos do elevador

    int nMaxAndares;
    int nMaxPessoas;
    int andarAtual;
    int capacidadeAtual;

    // construtor
    public Elevador(int nMaxAndares, int nMaxPessoas) {
        this.nMaxAndares = nMaxAndares; // numero fixo
        this.nMaxPessoas = nMaxPessoas;
    }

    // contruir os metodos
    // set and gets
    public int getAndarAtual() {
        return andarAtual; // numero variavel
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

    // metodos adicionais
    // iniciar
    public void name() {
        capacidadeAtual = 0;
        andarAtual = 0;
    }
//entrar
    public void entrar(int pessoas) {
        if ((capacidadeAtual + pessoas) >= nMaxPessoas) {
            System.out.println("Capacidade max atingida");
            System.out.println("Pessoas para fora" + (capacidadeAtual + pessoas - nMaxPessoas));
        }
        else{
            capacidadeAtual+=pessoas;
        }
    }
//sair
public void descer (int pessoas){
    if (pessoas<capacidadeAtual) {
        capacidadeAtual-=pessoas;
    }
    else{
        System.out.println("Informe um numero valido, Quantidade atual: "+capacidadeAtual );
        
    }



    /*DAVA PARA SER FEITO COM WHILE
     while (pessoas>capacidadeAtual) {
        
    } */
        
    }
}

