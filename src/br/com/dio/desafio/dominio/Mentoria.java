package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Locale;

public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override

    public double calcularXp() {
        return Xp_PADRAO + 20d;

    }

    public Mentoria() {
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescrição() + '\'' +
                ", data=" + data +
                '}';
    }
}
