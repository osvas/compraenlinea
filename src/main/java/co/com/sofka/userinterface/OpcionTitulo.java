package co.com.sofka.userinterface;

public enum OpcionTitulo {
    MR("1"),
    MRS("2");

    private String titulo;

    OpcionTitulo(String mes){
        this.titulo = mes;
    }

    public String opcion(){
        return titulo;
    }
}
