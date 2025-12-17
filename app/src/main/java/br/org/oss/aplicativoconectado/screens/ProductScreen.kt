package br.org.oss.aplicativoconectado.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import br.org.oss.aplicativoconectado.viewmodel.ProductViewModel

@Composable
fun ProductsScreen(modifier: Modifier) {
    val viewModel: ProductViewModel = viewModel()

    val products = viewModel.products.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.loadProducts()
    }

    Column(modifier = modifier) {
        ProductsList(
            products = products.value,
        )
    }
}

