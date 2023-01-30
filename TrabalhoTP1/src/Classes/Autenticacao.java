package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Autenticacao {

    private final String username;
    private final char[] password;
    private final String filePath = "src\\Arquivos\\users.txt";

    public Autenticacao(String username, char[] password) {
        this.username = username;
        this.password = password;
    }

    //Fazer o cadastro do usuario e senha
    public void authCadastro(String username, char[] password) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
            writer.write(username + ":" + new String(password));
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.err.println("Erro ao escrever o arquivo de usuários: " + e.getMessage());
        }

    }

    //Verificar se usuario e senha coincidem
    public boolean auth() {
        boolean autenticado = false;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts[0].equals(username) && Arrays.equals(password, parts[1].toCharArray())) {
                    autenticado = true;
                    break;
                }
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo de usuários: " + e.getMessage());
        }

        return autenticado;
    }

}
