package orientacao_objeto;

public class teste {
    public static void main(String[] args) {
        //criando objeto do tipo pessoa
         pessoa jonatas = new pessoa();
        // jonatas.nome = "Jonatas Lima";
        // jonatas.email = "jon@gmail.com";
        // jonatas.telefone = "6898888-9999";
        // System.out.println(jonatas.nome);

        jonatas.setNome("Jonatas Araujo");
        System.out.println(jonatas.getNome());
    }
    
}
