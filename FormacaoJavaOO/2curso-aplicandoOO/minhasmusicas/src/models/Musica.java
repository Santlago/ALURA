package models;

public class Musica extends Audio {

    // attributes
    private String album;
    private String cantor;
    private String genero;

    // getters and setters
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getCantor() {
        return cantor;
    }
    public void setCantor(String cantor) {
        this.cantor = cantor;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public int getClassificacao() {
        if(this.getTotalReproducoes() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}
