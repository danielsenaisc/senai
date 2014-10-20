package entidades;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Canal generated by hbm2java
 */

public class Colecao{


    // Fields    

     private BigDecimal id;
     private String nome;
     private Date vigenciaInicial;
     private Date vigenciaFinal;
     private String descricao;
     private short idadeInicial;
     private short idadeFinal;
     private String genero;
     private BigDecimal idLivre;
     private BigDecimal marcaId;
     private String status;

    // Constructors

    /** default constructor */
    public Colecao() {
    }


	public Colecao(String nome, Date vigenciaInicial,
			Date vigenciaFinal, String descricao, short idadeInicial,
			short idadeFinal, String genero, BigDecimal idLivre,
			BigDecimal marcaId, String status) {
		this.nome = nome;
		this.vigenciaInicial = vigenciaInicial;
		this.vigenciaFinal = vigenciaFinal;
		this.descricao = descricao;
		this.idadeInicial = idadeInicial;
		this.idadeFinal = idadeFinal;
		this.genero = genero;
		this.idLivre = idLivre;
		this.marcaId = marcaId;
		this.status = status;
	}


	public BigDecimal getId() {
		return id;
	}


	public void setId(BigDecimal id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Date getVigenciaInicial() {
		return vigenciaInicial;
	}


	public void setVigenciaInicial(Date vigenciaInicial) {
		this.vigenciaInicial = vigenciaInicial;
	}


	public Date getVigenciaFinal() {
		return vigenciaFinal;
	}


	public void setVigenciaFinal(Date vigenciaFinal) {
		this.vigenciaFinal = vigenciaFinal;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public short getIdadeInicial() {
		return idadeInicial;
	}


	public void setIdadeInicial(short idadeInicial) {
		this.idadeInicial = idadeInicial;
	}


	public short getIdadeFinal() {
		return idadeFinal;
	}


	public void setIdadeFinal(short idadeFinal) {
		this.idadeFinal = idadeFinal;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public BigDecimal getIdLivre() {
		return idLivre;
	}


	public void setIdLivre(BigDecimal idLivre) {
		this.idLivre = idLivre;
	}


	public BigDecimal getMarcaId() {
		return marcaId;
	}


	public void setMarcaId(BigDecimal marcaId) {
		this.marcaId = marcaId;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Colecao [id=" + id + ", descricao=" + descricao + "]";
	}


}
