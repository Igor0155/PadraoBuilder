package builder;

import java.util.Date;

public class PacienteBuilder {

    private Paciente paciente;

    public PacienteBuilder() {
        paciente = new Paciente();
    }

    public Paciente build() {
        if (paciente.getNumeroProntuario() == 0) {
            throw new IllegalArgumentException("Número de prontuário inválido");
        }
        if (paciente.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return paciente;
    }

    public PacienteBuilder setNumeroProntuario(int numeroProntuario) {
        paciente.setNumeroProntuario(numeroProntuario);
        return this;
    }

    public PacienteBuilder setNome(String nome) {
        paciente.setNome(nome);
        return this;
    }

    public PacienteBuilder setDataNascimento(Date dataNascimento) {
        paciente.setDataNascimento(dataNascimento);
        return this;
    }

    public PacienteBuilder setCpf(String cpf) {
        paciente.setCpf(cpf);
        return this;
    }

    public PacienteBuilder setNomeMae(String nomeMae) {
        paciente.setNomeMae(nomeMae);
        return this;
    }

    public PacienteBuilder setTipoSanguineo(String tipoSanguineo) {
        paciente.setTipoSanguineo(tipoSanguineo);
        return this;
    }

    public PacienteBuilder setAlergias(String alergias) {
        paciente.setAlergias(alergias);
        return this;
    }

    public PacienteBuilder setMedicacoesUsoContinuo(String medicacoes) {
        paciente.setMedicacoesUsoContinuo(medicacoes);
        return this;
    }

    public PacienteBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        paciente.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public PacienteBuilder setEnderecoNumero(int enderecoNumero) {
        paciente.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public PacienteBuilder setEnderecoBairro(String enderecoBairro) {
        paciente.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public PacienteBuilder setEnderecoCidade(String enderecoCidade) {
        paciente.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public PacienteBuilder setEnderecoUF(String enderecoUF) {
        paciente.setEnderecoUF(enderecoUF);
        return this;
    }

    public PacienteBuilder setTelefoneContato(String telefoneContato) {
        paciente.setTelefoneContato(telefoneContato);
        return this;
    }

    public PacienteBuilder setContatoEmergencia(String contatoEmergencia) {
        paciente.setContatoEmergencia(contatoEmergencia);
        return this;
    }

    public PacienteBuilder setConvenioMedico(String convenioMedico) {
        paciente.setConvenioMedico(convenioMedico);
        return this;
    }

    public PacienteBuilder setNumeroCarteirinha(String numeroCarteirinha) {
        paciente.setNumeroCarteirinha(numeroCarteirinha);
        return this;
    }
}