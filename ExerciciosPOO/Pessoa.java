package ExerciciosPOO;

public class Pessoa implements Idade{

    int aaaa;
    int id;
    
    public Pessoa(int aaaa, int id) {
        this.aaaa = aaaa;
        this.id = id;
    }

    @Override
    public int getId() {
        
        return (2023-aaaa);
    }

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public double getPrint() {
        // TODO Auto-generated method stub
        return 0;
    }

    


}
