# 🚀 Aplicativo Conectado

Um aplicativo Android nativo desenvolvido com Kotlin e Jetpack Compose. Este projeto serve como um exemplo de como construir uma aplicação moderna que consome dados de uma API REST e os exibe em uma interface de usuário declarativa e reativa.

## ✨ Funcionalidades

*   **Consumo de API REST:** Conecta-se à API pública [DummyJSON](https://dummyjson.com/) para buscar uma lista de produtos.
*   **Listagem de Produtos:** Exibe os produtos obtidos da API em uma lista vertical.
*   **Arquitetura Moderna:** Utiliza `ViewModel` para gerenciar o estado da UI de forma consciente ao ciclo de vida dos componentes.
*   **UI Declarativa:** A interface de usuário é construída inteiramente com [Jetpack Compose](https://developer.android.com/jetpack/compose), o moderno toolkit do Android para criar UIs nativas.
*   **Comunicação de Rede Eficiente:** Usa a biblioteca [Retrofit](https://square.github.io/retrofit/) para realizar chamadas de rede de forma segura e padronizada, com o [Gson](https://github.com/google/gson) para a conversão de JSON.

## 🛠️ Tecnologias Utilizadas

Este projeto foi construído utilizando as seguintes tecnologias e bibliotecas do ecossistema Android:

*   **Linguagem:** [Kotlin](https://kotlinlang.org/)
*   **UI Toolkit:** [Jetpack Compose](https://developer.android.com/jetpack/compose)
*   **Arquitetura:**
    *   [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel)
    *   [Lifecycle for Compose](https://developer.android.com/jetpack/compose/libraries#lifecycle)
*   **Rede:**
    *   [Retrofit](https://square.github.io/retrofit/)
    *   [Gson Converter](https://github.com/google/gson)
*   **Componentes de UI:**
    *   [Material 3](https://m3.material.io/)
    *   [Material Icons](https://fonts.google.com/icons)

## ⚙️ Configuração e Execução

Siga os passos abaixo para configurar e executar o projeto em seu ambiente local.

### Pré-requisitos

*   [Android Studio](https://developer.android.com/studio) (versão Iguana ou mais recente recomendada).
*   Um emulador Android ou um dispositivo físico com depuração USB ativada.

### Passos

1.  **Clone o repositório:**
2.  **Abra no Android Studio:**
    *   Inicie o Android Studio.
    *   Selecione **"Open an existing project"** (Abrir um projeto existente).
    *   Navegue até o diretório onde você clonou o projeto e selecione-o.

3.  **Sincronize o projeto:**
    *   Aguarde o Android Studio sincronizar e baixar todas as dependências do Gradle. Isso pode levar alguns minutos.

4.  **Execute a aplicação:**
    *   Selecione um dispositivo (emulador ou físico) na barra de ferramentas superior.
    *   Clique no botão **Run 'app'** (▶️) ou use o atalho `Shift + F10`.
