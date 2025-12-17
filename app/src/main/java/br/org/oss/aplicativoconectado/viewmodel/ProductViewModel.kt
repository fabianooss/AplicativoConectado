package br.org.oss.aplicativoconectado.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.org.oss.aplicativoconectado.api.ApiClient
import br.org.oss.aplicativoconectado.model.Product
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ProductViewModel: ViewModel() {

    private val api = ApiClient.productApi

    private val _products = MutableStateFlow<List<Product>>(emptyList())

    val products: StateFlow<List<Product>> = _products.asStateFlow()

    fun loadProducts() {
        viewModelScope.launch {
            val products = api.getProducts()
            _products.value = products.products
        }

    }
}