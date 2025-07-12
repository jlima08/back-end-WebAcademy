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
        jonatas.setEmail("john@gmail");
        jonatas.setTelefone("689999999");
        System.out.println(jonatas.getNome());
        System.out.println(jonatas.getTelefone());
        System.out.println(jonatas.getEmail());
        
        aluno vic = new aluno();
        vic.setMatricula("20172017");
        vic.setMatricula("99999999");
    }
    
}
