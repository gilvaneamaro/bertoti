
document.addEventListener("DOMContentLoaded", function() {
    fetch('http://localhost:8080/celular', {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json'
        },
        body:null
    })
        .then(response => response.json())
        .then(data => {
            // Aqui você pode acessar o conteúdo do body retornado pelo backend
            console.log(data);

            var produtos = data;
            console.log("Chegou aqui");

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
                    var cellID = row.insertCell(2);

                    cellModelo.textContent = produto.modelo;
                    cellMarca.textContent = produto.marca;
                    cellID.textContent = produto.ID;
                });

                // Exibe a tabela
                document.getElementById("table").style.display = "table";
            }

            // Adiciona um evento de clique ao botão "Mostrar Aparelhos"
            document.getElementById("mostrar-aparelhos").addEventListener("click", mostrarAparelhos);



        })
        .catch(error => {
            console.error('Erro ao enviar JSON:', error);
        });
    // JSON com as informações dos produtos

});

function listarAparelhos(){
    fetch('http://localhost:8080/celular', {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json'
        },
        body:null
    }).then(response => response.json())
        .then(data => {
            // Aqui você pode acessar o conteúdo do body retornado pelo backend
            console.log(data);
        })
        .catch(error => {
                console.error('Erro ao enviar JSON:', error);
        });

}

function enviarJSON() {
    // Obter os valores dos inputs
    var modelo = document.getElementById("modelo").value;
    var marca = document.getElementById("marca").value;
    var id = document.getElementById("id").value;


    // Criar um objeto JSON
    var data = {
        modelo: modelo,
        marca: marca,
        id: id
    };

    // Converter o objeto JSON para uma string
    var jsonData = JSON.stringify(data);

    // Enviar os dados para o backend (aqui simularia a requisição POST)
    fetch('http://localhost:8080/celular/', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: jsonData
    })
        .then(response => {
            if (response.ok) {
                mostrarNotificacao("Aparelho cadastrado com sucesso!");
            } else {
                mostrarNotificacao("Erro ao enviar JSON.");
            }
        })
        .catch(error => {
            console.error('Erro ao enviar JSON:', error);
        });
}

function mostrarNotificacao(mensagem) {
    // Verificar se o navegador suporta notificações
    if (!("Notification" in window)) {
        alert("Este navegador não suporta notificações.");
    } else if (Notification.permission === "granted") {
        // Se as notificações estão permitidas, mostrar notificação
        new Notification(mensagem);
    } else if (Notification.permission !== 'denied') {
        // Se as notificações não estão bloqueadas, solicitar permissão
        Notification.requestPermission().then(function (permission) {
            // Se a permissão for concedida, mostrar notificação
            if (permission === "granted") {
                new Notification(mensagem);
            }
        });
    }
}
