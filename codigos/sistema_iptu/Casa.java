package sistema_iptu;

public class Casa {
    private Municipio municipio;
    private Double areaM2;
    private Integer vagas;

    public Double calcularIptu(){
        return this.areaM2 * this.municipio.getmunicipio;
    }
}
