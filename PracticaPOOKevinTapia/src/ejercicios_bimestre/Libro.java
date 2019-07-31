/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_bimestre;

/**
 *
 * @author its
 */
public class Libro {

    private int ISBN;
    private String titulo;
    private String autor;
    private int numPagi;

    public Libro(int iSBN, String titulo, String autor, int numPagi) {
        ISBN = iSBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPagi = numPagi;
    }

//regresa a ISBM
    public int getISBN() {
        return ISBN;
    }
// se establece el ISBM

    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }

//regresa titulo
    public String getTitulo() {
        return titulo;
    }

//se establece titulo
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

//regresa al autor
    public String getAutor() {
        return autor;
    }

//se establece autor
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPagi() {
        return numPagi;
    }

    //para establecer numero de pagina
    public void setNumPagi(int numPagi) {
        this.numPagi = numPagi;
    }

//to strin es para mostrar mensaje 
    @Override
    public String toString() {
        return "El libro ISBN " + ISBN + ", titulo " + titulo + ", creado por el autor " + autor + ",tiene " + numPagi + " paginas";
    }

    public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

        Libro l1 = new Libro(66273737, "Las aventuras de Sherlock Holmes", " Arthur Conan Doyle", 600);
        Libro l2 = new Libro(58585858, "A Study in Scarlet", "Arthur Conan Doyle", 450);

        System.out.println(l1.toString());
        System.out.println(l2.toString());

        if (l1.getNumPagi() > l2.getNumPagi()) {
            System.out.println("El libro " + l1.getTitulo() + " tiene mas numeros de paginas que el libro " + l2.getTitulo());
        } else {
            System.out.println("El libro " + l2.getTitulo() + " tiene mas numeros de paginas que el libro " + l1.getTitulo());
        }

    }
}
