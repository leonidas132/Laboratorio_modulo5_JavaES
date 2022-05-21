package entidades;

public final class Curso {
    private String codigo;
    private String  descripcion;


    public Curso() {
    }

    public Curso(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return
                "codigo: " + codigo + '\'' +
                ", descripcion: " + descripcion;
    }
}
