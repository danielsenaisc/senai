package entidades;
// Generated 11/09/2014 22:22:12 by Hibernate Tools 3.1.0.beta4

import java.math.BigDecimal;
import java.util.Date;


/**
 * Marca generated by hbm2java
 */

public class Marca  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal id;
     private String nome;
     private String descricao;
     private String logomarca;
     private Date dataCriacao;
     private String genero;
     private short idadeInicial;
     private short idadeFinal;
     private String status;


    // Constructors

    /** default constructor */
    public Marca() {
    }

	/** minimal constructor */
    public Marca(BigDecimal id, String nome, Date dataCriacao, String genero, short idadeInicial, short idadeFinal, String status) {
        this.id = id;
        this.nome = nome;
        this.dataCriacao = dataCriacao;
        this.genero = genero;
        this.idadeInicial = idadeInicial;
        this.idadeFinal = idadeFinal;
        this.status = status;
    }
      
    // Property accessors

    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLogomarca() {
        return this.logomarca;
    }
    
    public void setLogomarca(String logomarca) {
        this.logomarca = logomarca;
    }

    public Date getDataCriacao() {
        return this.dataCriacao;
    }
    
    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getGenero() {
        return this.genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public short getIdadeInicial() {
        return this.idadeInicial;
    }
    
    public void setIdadeInicial(short idadeInicial) {
        this.idadeInicial = idadeInicial;
    }

    public short getIdadeFinal() {
        return this.idadeFinal;
    }
    
    public void setIdadeFinal(short idadeFinal) {
        this.idadeFinal = idadeFinal;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

	@Override
	public String toString() {
		return "Marca [id=" + id + ", nome=" + nome + ", descricao="
				+ descricao + ", logomarca=" + logomarca + ", dataCriacao="
				+ dataCriacao + ", genero=" + genero + ", idadeInicial="
				+ idadeInicial + ", idadeFinal=" + idadeFinal + ", status="
				+ status + "]";
	}


}