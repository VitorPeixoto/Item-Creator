package itemcreator;

import java.awt.Image;
import java.io.*;
import javax.swing.ImageIcon;

public class Item {
    protected int id;
    protected int Quantidade;
    protected int Preço;
    protected Image Imagem;
    protected ImageIcon Ícone;
    protected String Definição;
    protected String Nome;
    protected String Tipo;
    protected String Raridade;
    protected boolean Dropable;
    protected boolean Sellable;

    
    protected FileReader FR;
    protected BufferedReader BR;
    protected File F;
    
    public Item(File itemLocation) throws FileNotFoundException, IOException {
        F = itemLocation;
        id = Integer.parseInt(itemLocation.getName().replaceAll(".itinfo", ""));
        FR = new FileReader(F);
        BR = new BufferedReader(FR);
        try {
            Imagem = (new ImageIcon(getClass().getResource((new StringBuilder()).append("/Itens/").append(id).append("/").append(id).append(".png").toString()))).getImage();
        } catch (NullPointerException np) {
            try {
                Imagem = (new ImageIcon(getClass().getResource((new StringBuilder()).append("/Itens/").append(id).append("/").append(id).append(".jpg").toString()))).getImage();
            } catch (NullPointerException np2) {
                Imagem = (new ImageIcon(getClass().getResource((new StringBuilder()).append("/Itens/").append(id).append("/").append(id).append(".jpeg").toString()))).getImage();
            }
        }
        try {
            Ícone = new ImageIcon(getClass().getResource((new StringBuilder()).append("/Itens/").append(id).append("/").append(id).append("ICO.png").toString()));
        } catch (NullPointerException np) {
            try {
                Ícone = new ImageIcon(getClass().getResource((new StringBuilder()).append("/Itens/").append(id).append("/").append(id).append("ICO.jpg").toString()));
            } catch (NullPointerException np2) {
                Ícone = new ImageIcon(getClass().getResource((new StringBuilder()).append("/Itens/").append(id).append("/").append(id).append("ICO.jpeg").toString()));
            }
        }
        Nome = BR.readLine().replace("Nome: ", "");
        Tipo = BR.readLine().replace("Tipo: ", "");
        Quantidade = Integer.valueOf(BR.readLine().replace("Quantidade: ", "")).intValue();
        Raridade = BR.readLine().replace("Raridade: ", "");
        Preço = Integer.valueOf(BR.readLine().replace("Preço: ", "")).intValue();
        Definição = BR.readLine().replace("Definição: ", "");
        Sellable = Boolean.parseBoolean(BR.readLine().replace("Vendável: ", ""));
        Dropable = Boolean.parseBoolean(BR.readLine().replace("Dropável: ", ""));        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public int getPreço() {
        return Preço;
    }

    public void setPreço(int Preço) {
        this.Preço = Preço;
    }

    public Image getImagem() {
        return Imagem;
    }

    public void setImagem(Image Imagem) {
        this.Imagem = Imagem;
    }

    public ImageIcon getÍcone() {
        return Ícone;
    }

    public void setÍcone(ImageIcon Ícone) {
        this.Ícone = Ícone;
    }

    public String getDefinição() {
        return Definição;
    }

    public void setDefinição(String Definição) {
        this.Definição = Definição;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public boolean isDropable() {
        return Dropable;
    }

    public void setDropable(boolean Dropable) {
        this.Dropable = Dropable;
    }

    public boolean isSellable() {
        return Sellable;
    }

    public void setSellable(boolean Sellable) {
        this.Sellable = Sellable;
    }

    public String getRaridade() {
        return Raridade;
    }

    public void setRaridade(String Raridade) {
        this.Raridade = Raridade;
    }

    public String getInfo() {
        return "";
    }

    public void getItem() {
    }

}

