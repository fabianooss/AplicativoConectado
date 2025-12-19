package br.org.oss.aplicativoconectado.api

import br.org.oss.aplicativoconectado.model.Product

data class ProductResponse (
    val products: List<Product>,
    val total: Int,
    val skip: Int,
    val limit: Int
)
