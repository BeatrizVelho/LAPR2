package eventoscientificos.model;

/**
 * Representa uma instância de um utilizador através de um nome, de um email, de
 * um username e de uma password.
 *
 * @author G01
 */
public class Utilizador {

    /**
     * Nome do Utilizador.
     */
    private String nome;

    /**
     * Email do Utilizador.
     */
    private String email;

    /**
     * Username do Utilizador.
     */
    private String username;

    /**
     * Password do Utilizador.
     */
    private String password;

    /**
     * Nome do Utilizador por omissão.
     */
    private static final String NOME_POR_OMISSAO = "Sem nome";

    /**
     * Email do Utilizador por omissão.
     */
    private static final String EMAIL_POR_OMISSAO = "Sem email";

    /**
     * Username do Utilizador por omissão.
     */
    private static final String USERNAME_POR_OMISSAO = "Sem username";

    /**
     * Password do Utilizador por omissão.
     */
    private static final String PASSWORD_POR_OMISSAO = "Sem password";

    /**
     * Constrói uma instância de utilizador recebendo um nome, um email, um
     * username e uma password.
     *
     * @param nome Nome do utilizador.
     * @param email Email do utilizador.
     * @param username Username do utilizador.
     * @param password Password do utilizador.
     */
    public Utilizador(
                        String nome, String email, String username, String password) {
        setNome(nome);
        setEmail(email);
        setUsername(username);
        setPassword(password);
    }

    /**
     * Constrói uma instância de utilizador usando os valores por omissão.
     */
    public Utilizador() {
        this(
                            Utilizador.NOME_POR_OMISSAO,
                            Utilizador.EMAIL_POR_OMISSAO,
                            Utilizador.USERNAME_POR_OMISSAO,
                            Utilizador.PASSWORD_POR_OMISSAO);
    }

    /**
     * Devolve o nome do utilizador.
     *
     * @return Nome do utilizador.
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Devolve o email do utilizador.
     *
     * @return Email do utilizador
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Devolve o username do utilizador.
     *
     * @return Username do utilizador.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Devolve a password do utilizador.
     *
     * @return Password do utilizador.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Modifica o nome de utilizador.
     *
     * @param nome Novo nome do utilizador.
     */
    public void setNome(String nome) {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do utilizador nao pode"
                                + " estar vazio");
        }
        if (nome.contains("[0-9]+")) {

            throw new IllegalArgumentException("Nome do utilizador nao pode "
                                + "conter numeros");
        }
        if (nome.length() < 2) {
            throw new IllegalArgumentException("Nome do utilizador tem de"
                                + " ter pelo menos 2 letras");

        }
        if (nome.contains("[()<>,;:.\\[\\]{}]\\\\\\\\")) {
            throw new IllegalArgumentException("Nome do utilizador nao pode "
                                + "conter caracteres");
        }
        this.nome = nome;
    }

    /**
     * Modifica o email do utilizador.
     *
     * @param email Novo email do utilizador.
     */
    public void setEmail(String email) {
        if (email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email do utilizador não "
                                + "pode estar vazio.");
        }
        if (email.contains("[()<>,;:.\\[\\]{}]\\\\\\\\")) {
            throw new IllegalArgumentException("Email do "
                                + "utilizador não pode conter "
                                + "caracteres.");
        }
        if (!(email.matches(".+@.+\\..{2,}"))) {
            throw new IllegalArgumentException("Email do utilizador"
                                + " tem de obedecer a estrutura");
        }

        this.email = email;
    }

    /**
     * Modifica o username do utilizador.
     *
     * @param username Novo username do utilizador.
     */
    public void setUsername(String username) {
        if (username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username do utilizador não "
                                + "pode estar vazio.");
        }
        if (username.contains("[()<>,;:.\\[\\]{}]\\\\\\\\")) {
            throw new IllegalArgumentException("Username do "
                                + "utilizador não pode conter "
                                + "caracteres.");
        }

        this.username = username;
    }

    /**
     * Modifica a password do utilizador.
     *
     * @param password Nova password do utilizador.
     */
    public void setPassword(String password) {
        if (password.trim().isEmpty()) {
            throw new IllegalArgumentException("Password do utilizador não "
                                + "pode estar vazia.");
        }
        if (password.contains("[()<>,;:.\\[\\]{}]\\\\\\\\")) {
            throw new IllegalArgumentException("Password do "
                                + "utilizador não pode conter "
                                + "caracteres.");
        }
        this.password = password;
    }

    /**
     * Valida a instancia de Utilizador, verificando se todos os seus atributos
     * se encontram devidamente preenchidos.
     *
     * @return Verdadeiro se o objeto for válido e falso caso não seja.
     */
    public boolean validaUtilizador() {
        return (this.nome.equals(NOME_POR_OMISSAO)
                            || this.email.equals(EMAIL_POR_OMISSAO)
                            || this.username.equals(USERNAME_POR_OMISSAO)
                            || this.password.equals(PASSWORD_POR_OMISSAO));
    }

    /**
     * Compara dois objetos entre si. Comparando primariamente a posição de
     * memória, seguida do conteudo e das classes as quais cada um deles
     * pertence, e finalmente os seus atributos email e username.
     *
     * @param outroObjeto Utilizador que vai ser usado na comparação.
     * @return Verdadeiro caso os objetos comparados sejam iguais e falso caso
     * não o sejam.
     */
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }

        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }

        Utilizador outroUtilizador = (Utilizador) outroObjeto;

        return this.getEmail().equals(outroUtilizador.getEmail()) || this.getUsername().equals(outroUtilizador.getUsername());
    }

    /**
     * Devolve a descrição textual do utilizador no formato: O utlizador esta
     * registado com os seguintes dados: nome x, username y, o email w e as
     * password z.
     *
     * @return Características do utilizador.
     */
    @Override
    public String toString() {
        return String.format(""
                            + "O utlizador esta registado com os seguintes "
                            + "dados: nome %s, username %s, o email %s "
                            + "e as password %s", this.nome,
                            this.username, this.email, this.password);
    }

}
