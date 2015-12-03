import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Funcionario {

    private static int CODIGO_ATUAL = 0;
    private String nome;
    private String sobrenome;
    private String RG;
    private String CIC;
    private double salario;
    private String endereco;
    private char sexo;
    private String formacao_profissional;
    private int codigo_funcionario;

    public Funcionario(
            String nome, String sobrenome, String RG, String CIC,
            double salario,
            String endereco,
            char sexo,
            String formacao_profissional
                      ) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.RG = RG;
        this.CIC = CIC;
        this.salario = salario;
        this.endereco = endereco;
        this.sexo = sexo;
        this.formacao_profissional = formacao_profissional;
        this.codigo_funcionario = ++CODIGO_ATUAL;
    }

    public void alterarDados(HashMap dados) {

        Iterator it = dados.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            mudarCampo(entry.getKey(), entry.getValue());
            it.remove();
        }

    }

    private void mudarCampo(Object key, Object value) {
        try {
            Field f = this.getClass().getDeclaredField((String) key);
            f.set(this, value);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCIC() {
        return CIC;
    }

    public void setCIC(String CIC) {
        this.CIC = CIC;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getFormacao_profissional() {
        return formacao_profissional;
    }

    public void setFormacao_profissional(String formacao_profissional) {
        this.formacao_profissional = formacao_profissional;
    }

    public int getCodigo_funcionario() {
        return codigo_funcionario;
    }
}

