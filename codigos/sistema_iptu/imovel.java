package sistema_iptu;

public class imovel {
    private Municipio municipio;
    private Double areaM2;
    private Integer vagas;
    
    public Double calcularIptu(){
        return this.areaM2 * this.municipio.getPrecoM2;
    }
}
