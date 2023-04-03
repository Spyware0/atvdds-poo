package lab04.tarefa02;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private String descricao;

    public Livro(String titulo, String autor, String isbn, String descricao){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.descricao = descricao;
    }

    public Livro(String titulo, String autor, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public String getIsbn(){
        return this.isbn;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public String toString(){
        return "Título: " + getTitulo() + "\nAutor: " + getAutor() + "\nIsbn: " + getIsbn() + "\nDescrição: " + getDescricao();
    }
}
