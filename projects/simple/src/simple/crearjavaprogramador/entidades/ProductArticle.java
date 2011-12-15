package simple.crearjavaprogramador.entidades;

public class ProductArticle extends Product {
    private int sizeX = 0;
    private int sizeY = 0;
    private int sizeZ = 0;
    public int getSizeX() {
        return sizeX;
    }
    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }
    public int getSizeY() {
        return sizeY;
    }
    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }
    public int getSizeZ() {
        return sizeZ;
    }
    public void setSizeZ(int sizeZ) {
        this.sizeZ = sizeZ;
    }
}
