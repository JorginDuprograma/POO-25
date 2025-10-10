public class Livro extends Material {

    private String edicao;

    public Livro(String titulo, Integer anoPublicacao, String edicao){
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }
    public String getedicao(){
        return edicao;
    }
    public void setEdicao(String edicao){
        this.edicao = edicao;
    }
    @Override
    public void descricao(){
        System.out.println("Livro:");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("AnoPublicacao: " + getAnoPublicacao());
        System.out.println("Edicao: " + getedicao());
    }

}