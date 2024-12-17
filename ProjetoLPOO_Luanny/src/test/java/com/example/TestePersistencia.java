package com.example;

import com.example.dao.PersistenciaJPA;
import com.example.entities.Ave;
import com.example.entities.Habitat;
import com.example.entities.Reptil;
import com.example.entities.Mamifero;
import com.example.entities.Observacao;
import com.example.entities.Pesquisador;

import com.example.entities.Mamifero;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class TestePersistencia {
    PersistenciaJPA jpa = new PersistenciaJPA();

    public TestePersistencia() {
    }

    @Before
    public void setUp() {
        jpa.conexaoAberta();
    }

    @After
    public void tearDown() {
        jpa.fecharConexao();
    }

    @Test
    public void testePersistencia() {

        Habitat habitat1 = new Habitat("Floresta Amazônica", "Floresta", "03°12'S 60°01'W");
        Habitat habitat2 = new Habitat("Pantanal Mato-Grossense", "Pantanal", "16°27'S 56°30'W");

        Reptil jacare = new Reptil("Jacaré", "Caiman crocodilus", "vulnerável", true, 28.0, "ovíparo");

        Ave tucano = new Ave("Tucano", "Ramphastos toco", "menos preocupante", 56.0, "bico grande", true, false);

        Mamifero capivara = new Mamifero("Capivara", "Hydrochoerus hydrochaeris", "menos preocupante", true, 150, "herbívora");

        tucano.setHabitat(habitat1);
        jacare.setHabitat(habitat2);
        capivara.setHabitat(habitat2);

        Pesquisador pesquisador = new Pesquisador("Dr. Carlos Mendes", "Ornitologia");
        Observacao observacao = new Observacao(LocalDate.of(2024, 10, 14), "Observação do tucano", pesquisador);
        Observacao observacao2 = new Observacao((LocalDate.of(2024, 9, 21)), "detalhes", pesquisador);
        try {
            jpa.persist(habitat1);
            jpa.persist(habitat2);
            jpa.persist(jacare);
            jpa.persist(tucano);
            jpa.persist(capivara);
            jpa.persist(pesquisador);
            jpa.persist(observacao);
            jpa.persist(observacao2);

            System.out.println("Dados persistidos com sucesso.");
        } catch (Exception e) {
            System.err.println("Erro ao persistir dados.");
        }

    }
}