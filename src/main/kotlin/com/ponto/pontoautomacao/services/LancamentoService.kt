package com.ponto.pontoautomacao.services

import com.ponto.pontoautomacao.model.document.Lancamento
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest

interface LancamentoService {

    fun buscarPorFuncionarioId(id: String, pageRequest: PageRequest): Page<Lancamento>?
    fun buscarPorId(id: String): Lancamento?
    fun persistir(lancamento: Lancamento): Lancamento
    fun remover(id: String)
}