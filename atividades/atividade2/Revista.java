public class Revista extends Material {

    private String autor;

    public Revista(String titulo, Integer anoPublicacao, String autor){
        super(titulo, anoPublicacao);
        this.autor = autor;
    }
    public String getautor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    @Override
    public void descricao(){
        System.out.println("Revista:");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("AnoPublicacao: " + getAnoPublicacao());
        System.out.println("Autor: " + getautor());
    }

}