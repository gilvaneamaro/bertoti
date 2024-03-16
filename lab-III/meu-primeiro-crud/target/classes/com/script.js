document.addEventListener("DOMContentLoaded", function() {
    // JSON com as informações dos produtos
    var produtos = [
        {"modelo": "iPhone", "marca": "Apple"},
        {"modelo": "Galaxy", "marca": "Samsung"},
        {"modelo": "Pixel", "marca": "Google"}
    ];

    // Referência do elemento HTML da tabela
    var tableBody = document.getElementById("table-body");

    // Função para exibir os aparelhos na tabela
    function mostrarAparelhos() {
        // Limpa o conteúdo da tabela antes de adicionar os novos aparelhos
        tableBody.innerHTML = "";

        // Loop pelos produtos e adiciona cada um à tabela
        produtos.forEach(function(produto) {
            var row = tableBody.insertRow();
            var cellModelo = row.insertCell(0);
            var cellMarca = row.insertCell(1);

            cellModelo.textContent = produto.modelo;
            cellMarca.textContent = produto.marca;
        });

        // Exibe a tabela
        document.getElementById("table").style.display = "table";
    }

    // Adiciona um evento de clique ao botão "Mostrar Aparelhos"
    document.getElementById("mostrar-aparelhos").addEventListener("click", mostrarAparelhos);
});
