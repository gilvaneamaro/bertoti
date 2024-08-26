public class Strategy {

    public interface ValidarDocumento {
        void validar(Pessoa pessoa);
    }

    public static class ValidarPessoaFisica implements ValidarDocumento {
        @Override
        public void validar(Pessoa pessoa) {
            if(pessoa.getDocumento().length() != 11)
                throw new IllegalArgumentException("CPF inválido.");
        }
    }

    public static class ValidarPessoaJuridica implements ValidarDocumento {
        @Override
        public void validar(Pessoa pessoa) {
            if(pessoa.getDocumento().length() != 14)
                throw new IllegalArgumentException("CNPJ inválido.");
        }
    }

    public static void validarPessoa(Pessoa pessoa, ValidarDocumento validador) {
        validador.validar(pessoa);
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Gilvane Amaro", "12345678911");
        Pessoa pessoa2 = new Pessoa("Jeniffer Bing", "12345678901234");
        validarPessoa(pessoa, new ValidarPessoaFisica());
        validarPessoa(pessoa2, new ValidarPessoaJuridica());

    }
}
