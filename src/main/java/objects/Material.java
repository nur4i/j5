package objects;

public class Material {

    private String legMaterial;
    private String boardMaterial;

    public Material(String legMaterial, String boardMaterial) {
        this.legMaterial = legMaterial;
        this.boardMaterial = boardMaterial;
    }

    public String getLegMaterial() {
        return legMaterial;
    }

    public void setLegMaterial(String legMaterial) {
        this.legMaterial = legMaterial;
    }

    public String getBoardMaterial() {
        return boardMaterial;
    }

    public void setBoardMaterial(String boardMaterial) {
        this.boardMaterial = boardMaterial;
    }
}
