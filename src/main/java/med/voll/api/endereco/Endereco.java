package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.medico.DadosEnderecos;
import med.voll.api.paciente.DadosEndereco;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEnderecos endereco) {
        this.logradouro = endereco.logradouro();
        this.bairro = endereco.bairro();
        this.cep = endereco.cep();
        this.numero = endereco.numero();
        this.complemento = endereco.complemento();
        this.cidade = endereco.cidade();
        this.uf = endereco.uf();
    }


    public Endereco(DadosEndereco enderecoPaciente) {
        this.logradouro = enderecoPaciente.logradouro();
        this.bairro = enderecoPaciente.bairro();
        this.cep = enderecoPaciente.cep();
        this.numero = enderecoPaciente.numero();
        this.complemento = enderecoPaciente.complemento();
        this.cidade = enderecoPaciente.cidade();
        this.uf = enderecoPaciente.uf();
    }
}