package patentes;

public class Dominio2 {

    private String pedidoCapturaDom2;
    private String pedidoDetencionDom2;
    private String registroProfesionalDom2;
    private String estadoMultasDom2;
    
    public Dominio2(){
        
        pedidoCapturaDom2 = "Afirmativo";
        pedidoDetencionDom2 = "Afirmativo";
        registroProfesionalDom2 = "Si";
        estadoMultasDom2 = "Tiene deudas";
    }
    
    public String obtPedidoCapturaDom2(){
        return "PEDIDO DE CAPTURA " + pedidoCapturaDom2;
    }
    public void darPedidoCapturaDom2(){
        this.pedidoCapturaDom2 = pedidoCapturaDom2;
    }
    public String obtPedidoDetencionDom2(){
        return "PEDIDO DE DETENCION " + pedidoDetencionDom2;
    }
    public void darPedidoDetencionDom2(){
        this.pedidoDetencionDom2 = pedidoDetencionDom2;
    }
    public String obtRegistroProfesionalDom2(){
        return "REGISTRO PROFESIONAL " + registroProfesionalDom2;
    }
    public void darRegistroProfesionalDom2(){
        this.registroProfesionalDom2 = registroProfesionalDom2;
    }
    public String obtEstadoMultasDom2(){
        return "ESTADO DE MULTAS " + estadoMultasDom2;
    }
    public void darEstadoMultasDom2(){
        this.estadoMultasDom2 = estadoMultasDom2;
    }
}