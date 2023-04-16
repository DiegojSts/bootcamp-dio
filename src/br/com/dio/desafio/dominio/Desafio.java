package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Desafio extends Conteudo {

    private LocalDate dataInicio = LocalDate.now();
    private LocalDate dataFim = dataInicio.plusDays(5);
    private boolean done;

    private Set<Dev> devsInscritos = new HashSet<>();

    public Desafio(){}

    public Desafio(LocalDate dataInicio, LocalDate dataFim, boolean done, Set<Dev> dev) {

        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.done = done;

    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Desafio desafio = (Desafio) o;
        return done == desafio.done && Objects.equals(dataInicio, desafio.dataInicio) && Objects.equals(dataFim, desafio.dataFim) && Objects.equals(devsInscritos, desafio.devsInscritos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataInicio, dataFim, done, devsInscritos);
    }

    @Override
    public String toString() {
        return "Desafio{" +
                "dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", done=" + done +
                ", devsInscritos=" + devsInscritos +
                '}';
    }
}
