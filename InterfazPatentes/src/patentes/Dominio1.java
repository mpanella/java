package patentes;

public class Dominio1 {
    
    private String pedidoCapturaDom1;
    private String pedidoDetencionDom1;
    private String registroProfesionalDom1;
    private String estadoMultasDom1;
    
    public Dominio1(){
        
        pedidoCapturaDom1 = "Negativo";
        pedidoDetencionDom1 = "Negativo";
        registroProfesionalDom1 = "Si";
        estadoMultasDom1 = "No tiene deudas";
    }
    
    public String obtPedidoCapturaDom1(){
        return "PEDIDO DE CAPTURA " + pedidoCapturaDom1;
    }
    public void darPedidoCapturaDom1(){
        this.pedidoCapturaDom1 = pedidoCapturaDom1;
    }
    public String obtPedidoDetencionDom1(){
        return "PEDIDO DE DETENCION " + pedidoDetencionDom1;
    }
    public void darPedidoDetencionDom1(){
        this.pedidoDetencionDom1 = pedidoDetencionDom1;
    }
    public String obtRegistroProfesionalDom1(){
        return "REGISTRO PROFESIONAL " + registroProfesionalDom1;
    }
    public void darRegistroProfesionalDom1(){
        this.registroProfesionalDom1 = registroProfesionalDom1;
    }
    public String obtEstadoMultasDom1(){
        return "ESTADO DE MULTAS " + estadoMultasDom1;
    }
    public void darEstadoMultasDom1(){
        this.estadoMultasDom1 = estadoMultasDom1;
    }
}
