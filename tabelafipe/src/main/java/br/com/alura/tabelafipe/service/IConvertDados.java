package br.com.alura.tabelafipe.service;

import java.util.List; // Não esqueça de importar o List!

public interface IConvertDados {

    <T> T obeterDados(String json, Class<T> classe);


    <T> List<T> obterLista(String json, Class<T> classe);
}