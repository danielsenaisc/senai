package entidades;
import java.math.BigDecimal;


/**
 * ModelagemDadosTamanhoId generated by hbm2java
 */

public class ModelagemDadosTamanho {


    // Fields    

     private double valorMedidaInicial;
     private Modelagem modelagem;
     private TamanhoTipoGrade tamanhoTipoGrade;
     private BigDecimal padraoMedidaCodigo;
     private TipoMedida tipoMedida;
     private Double valorMedidaFinal;


    // Constructors

    /** default constructor */
    public ModelagemDadosTamanho() {
    }

	/** minimal constructor */
    public ModelagemDadosTamanho(double valorMedidaInicial, Modelagem modelagem, TamanhoTipoGrade tamanhoTipoGrade, BigDecimal padraoMedidaCodigo, TipoMedida tipoMedida) {
        this.valorMedidaInicial = valorMedidaInicial;
        this.modelagem = modelagem;
        this.tamanhoTipoGrade = tamanhoTipoGrade;
        this.padraoMedidaCodigo = padraoMedidaCodigo;
        this.tipoMedida = tipoMedida;
    }
    
    /** full constructor */
    public ModelagemDadosTamanho(double valorMedidaInicial, Modelagem modelagem, TamanhoTipoGrade tamanhoTipoGrade, BigDecimal padraoMedidaCodigo, TipoMedida tipoMedida, Double valorMedidaFinal) {
        this.valorMedidaInicial = valorMedidaInicial;
        this.modelagem = modelagem;
        this.tamanhoTipoGrade = tamanhoTipoGrade;
        this.padraoMedidaCodigo = padraoMedidaCodigo;
        this.tipoMedida = tipoMedida;
        this.valorMedidaFinal = valorMedidaFinal;
    }
    

   
    // Property accessors

    public double getValorMedidaInicial() {
        return this.valorMedidaInicial;
    }
    
    public void setValorMedidaInicial(double valorMedidaInicial) {
        this.valorMedidaInicial = valorMedidaInicial;
    }

    public Modelagem getModelagem() {
        return this.modelagem;
    }
    
    public void setModelagem(Modelagem modelagem) {
        this.modelagem = modelagem;
    }

    public TamanhoTipoGrade getTamanhoTipoGrade() {
        return this.tamanhoTipoGrade;
    }
    
    public void setTamanhoTipoGrade(TamanhoTipoGrade tamanhoTipoGrade) {
        this.tamanhoTipoGrade = tamanhoTipoGrade;
    }

    public BigDecimal getPadraoMedidaCodigo() {
        return this.padraoMedidaCodigo;
    }
    
    public void setPadraoMedidaCodigo(BigDecimal padraoMedidaCodigo) {
        this.padraoMedidaCodigo = padraoMedidaCodigo;
    }

    public TipoMedida getTipoMedida() {
        return this.tipoMedida;
    }
    
    public void setTipoMedida(TipoMedida tipoMedida) {
        this.tipoMedida = tipoMedida;
    }

    public Double getValorMedidaFinal() {
        return this.valorMedidaFinal;
    }
    
    public void setValorMedidaFinal(Double valorMedidaFinal) {
        this.valorMedidaFinal = valorMedidaFinal;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ModelagemDadosTamanho) ) return false;
		 ModelagemDadosTamanho castOther = ( ModelagemDadosTamanho ) other; 
         
		 return (this.getValorMedidaInicial()==castOther.getValorMedidaInicial())
 && ( (this.getModelagem()==castOther.getModelagem()) || ( this.getModelagem()!=null && castOther.getModelagem()!=null && this.getModelagem().equals(castOther.getModelagem()) ) )
 && ( (this.getTamanhoTipoGrade()==castOther.getTamanhoTipoGrade()) || ( this.getTamanhoTipoGrade()!=null && castOther.getTamanhoTipoGrade()!=null && this.getTamanhoTipoGrade().equals(castOther.getTamanhoTipoGrade()) ) )
 && ( (this.getPadraoMedidaCodigo()==castOther.getPadraoMedidaCodigo()) || ( this.getPadraoMedidaCodigo()!=null && castOther.getPadraoMedidaCodigo()!=null && this.getPadraoMedidaCodigo().equals(castOther.getPadraoMedidaCodigo()) ) )
 && ( (this.getTipoMedida()==castOther.getTipoMedida()) || ( this.getTipoMedida()!=null && castOther.getTipoMedida()!=null && this.getTipoMedida().equals(castOther.getTipoMedida()) ) )
 && ( (this.getValorMedidaFinal()==castOther.getValorMedidaFinal()) || ( this.getValorMedidaFinal()!=null && castOther.getValorMedidaFinal()!=null && this.getValorMedidaFinal().equals(castOther.getValorMedidaFinal()) ) );
   }
  

}
