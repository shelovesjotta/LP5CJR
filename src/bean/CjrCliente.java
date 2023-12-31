package bean;
// Generated Sep 20, 2023 3:04:46 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CjrCliente generated by hbm2java
 */
@Entity
@Table(name="cjr_cliente"
    ,catalog="db_claudio_elizeche"
)
public class CjrCliente  implements java.io.Serializable {


     private Integer cjrIdCliente;
     private String cjrNome;
     private String cjrEmail;
     private String cjrCpf;
     private String cjrTelefone;
     private Date cjrDataNasc;
     private String cjrSexo;
     private String cjrEndereco;
     private String cjrCidade;
     private String cjrEstado;
     private String cjrCep;
     private String cjrNumeroCasa;
     private Date cjrDataCadastro;
     private double cjrSaldoCarteira;
     private String cjrObservacoes;

    public CjrCliente() {
    }

	
    public CjrCliente(String cjrNome, String cjrEmail, String cjrCpf, String cjrTelefone, String cjrSexo, String cjrEndereco, String cjrCidade, String cjrEstado, String cjrCep, String cjrNumeroCasa) {
        this.cjrNome = cjrNome;
        this.cjrEmail = cjrEmail;
        this.cjrCpf = cjrCpf;
        this.cjrTelefone = cjrTelefone;
        this.cjrSexo = cjrSexo;
        this.cjrEndereco = cjrEndereco;
        this.cjrCidade = cjrCidade;
        this.cjrEstado = cjrEstado;
        this.cjrCep = cjrCep;
        this.cjrNumeroCasa = cjrNumeroCasa;
    }
    
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="cjr_idCliente", unique=true, nullable=false)
    public Integer getCjrIdCliente() {
        return this.cjrIdCliente;
    }
    
    public void setCjrIdCliente(Integer cjrIdCliente) {
        this.cjrIdCliente = cjrIdCliente;
    }

    
    @Column(name="cjr_nome", nullable=false, length=60)
    public String getCjrNome() {
        return this.cjrNome;
    }
    
    public void setCjrNome(String cjrNome) {
        this.cjrNome = cjrNome;
    }

    
    @Column(name="cjr_email", nullable=false, length=60)
    public String getCjrEmail() {
        return this.cjrEmail;
    }
    
    public void setCjrEmail(String cjrEmail) {
        this.cjrEmail = cjrEmail;
    }

    
    @Column(name="cjr_cpf", nullable=false, length=14)
    public String getCjrCpf() {
        return this.cjrCpf;
    }
    
    public void setCjrCpf(String cjrCpf) {
        this.cjrCpf = cjrCpf;
    }

    
    @Column(name="cjr_telefone", nullable=false, length=14)
    public String getCjrTelefone() {
        return this.cjrTelefone;
    }
    
    public void setCjrTelefone(String cjrTelefone) {
        this.cjrTelefone = cjrTelefone;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="cjr_data_nasc", length=10)
    public Date getCjrDataNasc() {
        return this.cjrDataNasc;
    }
    
    public void setCjrDataNasc(Date cjrDataNasc) {
        this.cjrDataNasc = cjrDataNasc;
    }

    
    @Column(name="cjr_sexo", nullable=false, length=1)
    public String getCjrSexo() {
        return this.cjrSexo;
    }
    
    public void setCjrSexo(String cjrSexo) {
        this.cjrSexo = cjrSexo;
    }

    
    @Column(name="cjr_endereco", nullable=false, length=50)
    public String getCjrEndereco() {
        return this.cjrEndereco;
    }
    
    public void setCjrEndereco(String cjrEndereco) {
        this.cjrEndereco = cjrEndereco;
    }

    
    @Column(name="cjr_cidade", nullable=false, length=45)
    public String getCjrCidade() {
        return this.cjrCidade;
    }
    
    public void setCjrCidade(String cjrCidade) {
        this.cjrCidade = cjrCidade;
    }

    
    @Column(name="cjr_estado", nullable=false, length=2)
    public String getCjrEstado() {
        return this.cjrEstado;
    }
    
    public void setCjrEstado(String cjrEstado) {
        this.cjrEstado = cjrEstado;
    }

    
    @Column(name="cjr_cep", nullable=false, length=9)
    public String getCjrCep() {
        return this.cjrCep;
    }
    
    public void setCjrCep(String cjrCep) {
        this.cjrCep = cjrCep;
    }

    
    @Column(name="cjr_numero_casa", nullable=false, length=5)
    public String getCjrNumeroCasa() {
        return this.cjrNumeroCasa;
    }
    
    public void setCjrNumeroCasa(String cjrNumeroCasa) {
        this.cjrNumeroCasa = cjrNumeroCasa;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="cjr_data_cadastro", length=19)
    public Date getCjrDataCadastro() {
        return this.cjrDataCadastro;
    }
    
    public void setCjrDataCadastro(Date cjrDataCadastro) {
        this.cjrDataCadastro = cjrDataCadastro;
    }

    
    @Column(name="cjr_saldo_carteira", precision=9)
    public double getCjrSaldoCarteira() {
        return this.cjrSaldoCarteira;
    }
    
    public void setCjrSaldoCarteira(double cjrSaldoCarteira) {
        this.cjrSaldoCarteira = cjrSaldoCarteira;
    }

    
    @Column(name="cjr_observacoes", length=100)
    public String getCjrObservacoes() {
        return this.cjrObservacoes;
    }
    
    public void setCjrObservacoes(String cjrObservacoes) {
        this.cjrObservacoes = cjrObservacoes;
    }
    
    @Override
    public String toString() {
        return getCjrNome();
    }
    
    public boolean equals(Object object) {
        if (object instanceof  CjrCliente) {
            CjrCliente cjrCliente = (CjrCliente) object;
            if (this.getCjrIdCliente() == cjrCliente.getCjrIdCliente()) {
                return true;
            }
        }
        return false;
    }
}


