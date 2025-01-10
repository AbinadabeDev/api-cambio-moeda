# Conversor de Moedas

Este projeto é uma aplicação simples em **Java** que se conecta a uma API pública para obter taxas de câmbio atuais entre o dólar americano (USD) e outras moedas, com base em uma chave de acesso fornecida pelo usuário. A aplicação usa o **HttpClient** do Java para realizar requisições HTTP e exibir a resposta com as informações de conversão.

## 🛠️ Tecnologias Utilizadas

- **Java 11+** (necessário para usar `HttpClient` nativo)
- **API Exchangerate-API**: Serviço gratuito para consultar taxas de câmbio em tempo real.

## 🚀 Como Usar

### 1. Obter sua chave API
Primeiro, você precisa de uma chave de API válida. Acesse o site da [Exchangerate-API](https://www.exchangerate-api.com/) e registre-se para obter sua chave.

### 2. Clonar o repositório
Clone o repositório para o seu ambiente local:

```bash
git clone https://github.com/seu-usuario/nome-do-repositorio.git
cd nome-do-repositorio
```

### 3. Executar a aplicação

1. Compile o código Java:
   ```bash
   javac Principal.java
   ```

2. Execute o código:
   ```bash
   java Principal
   ```

3. Quando solicitado, insira sua **chave de API** para começar a consulta de taxas de câmbio.
   O programa exibirá as taxas de câmbio em formato JSON, com as informações sobre o valor das moedas em relação ao dólar americano (USD).

### Exemplo de Saída

```
Digite ou cole sua chave key:
8f61a1fdb833c1c2a5c9c3f9b7f7c5d0
{
  "result": "success",
  "documentation": "https://www.exchangerate-api.com/docs",
  "time_last_update_unix": 1609484235,
  "time_last_update_utc": "Thu, 31 Dec 2020 00:57:15 +0000",
  "base_code": "USD",
  "conversion_rates": {
    "AED": 3.673,
    "AFN": 77.97,
    "ALL": 101.8,
    "AMD": 493.0,
    "ANG": 1.79,
    ...
  }
}
```

## 📝 Como Funciona

- **Entrada**: O usuário fornece uma chave de API válida.
- **Processo**: A aplicação faz uma requisição HTTP para a API da Exchangerate-API, passando a chave fornecida.
- **Saída**: O sistema exibe as taxas de câmbio de diversas moedas em relação ao dólar americano.

## ⚙️ Dependências

- Nenhuma dependência externa foi utilizada, além do **HttpClient** do Java 11+.

## 🔧 Como Contribuir

Contribuições são bem-vindas! Sinta-se à vontade para fazer um **fork** do projeto, criar sua branch de funcionalidade e enviar um **pull request**.

### Passos para contribuição:

1. Faça um fork deste repositório.
2. Crie uma branch para a sua funcionalidade (`git checkout -b minha-funcionalidade`).
3. Faça suas alterações.
4. Commit as suas mudanças (`git commit -am 'Adicionando nova funcionalidade'`).
5. Faça push para a sua branch (`git push origin minha-funcionalidade`).
6. Abra um pull request.

## 📄 Licença

Este projeto não tem nenhuma licença específica. Use-o e já me siga.
