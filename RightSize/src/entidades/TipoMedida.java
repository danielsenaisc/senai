package entidades;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;


/**
 * TipoMedida generated by hbm2java
 */

public class TipoMedida {


    // Fields    

     private BigDecimal codigo;
     private String descricao;
     private String abreviacao;
     private String nome;
     private String figuraFormaMedida;

    // Constructors

    /** default constructor */
    public TipoMedida() {
    }

    
    /** full constructor */
    public TipoMedida(BigDecimal codigo, String descricao, String abreviacao, String nome, String figuraFormaMedida) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.abreviacao = abreviacao;
        this.nome = nome;
        this.figuraFormaMedida = figuraFormaMedida;
    }
    

   
    // Property accessors

    public BigDecimal getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAbreviacao() {
        return this.abreviacao;
    }
    
    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
    }

    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFiguraFormaMedida() {
        return this.figuraFormaMedida;
    }
    
    public void setFiguraFormaMedida(String figuraFormaMedida) {
        this.figuraFormaMedida = figuraFormaMedida;
    }
}
