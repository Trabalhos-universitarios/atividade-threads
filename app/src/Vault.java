public class Vault {

    public void vault(Integer password) {

        if (password == 123456) {
            System.out.println("A senha foi hackeada pela thread: ");
        } else {
            System.out.println("Senha incorreta!");
        }
    }
}
