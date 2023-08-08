package Pack;

public class Aluno {
    private String nome;
    private int ra;
    private int prova1;
    private int prova2;
    private int trab;
    private double media;

    //--------------------------------------------
    //construtor
    public Aluno() {
        this.nome = nome;
        this.ra = ra;
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.trab = trab;
    }

    //--------------------------------------------
    //get e set


    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public void setRa(int ra) {this.ra = ra;}

    public int getRa(){return ra;}

    public int getProva1() {
        return prova1;
    }

    public void setProva1(int prova1) {
        this.prova1 = prova1;
    }

    public int getProva2() {
        return prova2;
    }

    public void setProva2(int prova2) {
        this.prova2 = prova2;
    }

    public int getTrab() {
        return trab;
    }

    public void setTrab(int trab) {
        this.trab = trab;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }



    //--------------------------------------------
    //metodos da classe
   public double calcularMedia(){
       media = ((((getProva1()+getProva2())*0.7)/2)+(trab*0.3));
        return media;
   }

   public String situacaoAluno(){
       if (calcularMedia() >= 7){
          return "APROVADO";
       }else {
           return "EXAME";
       }
   }

    @Override
    public String toString() {
        return ("R.A.: "+getRa()+"| Nome: "+getNome());
    }

    public String retornaResultado() {
        return ("RESULTADO: " + toString() + " | MÉDIA: " + calcularMedia() + " | SITUAÇÃO: " + situacaoAluno());
    }
}
