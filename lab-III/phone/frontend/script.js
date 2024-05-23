var deleteBtn = document.getElementById("delete_col1");
var editBtn = document.getElementById("edit_col1");
var loadBtn = document.getElementById("loadBtn");

editBtn.onclick = function( ) {
    var cel1 = document.getElementById("cel_1");
    var cel2 = document.getElementById("cel_2");
    var cel3 = document.getElementById("cel_3");
    var cel4 = document.getElementById("cel_4");

    cel1.disabled = false;
    cel2.disabled = false;
    cel3.disabled = false;
    cel4.disabled = false;
}

deleteBtn.onclick = function () {
    alert("Apagou tudo!");
}


async function loadItems() {
    try {
        const response = await axios.get('http://localhost:8080/celular/find');  // Substitua pela URL do seu backend
        const data = response.data;
        const tbody = document.getElementById('id_tbody');
        tbody.innerHTML = '';  // Limpa as linhas existentes

        data.forEach(item => {
            const row = document.createElement('tr');
            row.innerHTML = `
                <td>${item.id}</td>
                <td>${item.modelo}</td>
                <td>${item.marca}</td>
                <td>${item.descricao}</td>
            `;
            tbody.appendChild(row);
        });
    } catch (error) {
        console.error('Erro ao buscar dados:', error);
    }
}



async function sendData() {
    const modelo = document.getElementById('entry_modelo');
    const marca = document.getElementById('entry_marca').value;
    const descricao = document.getElementById('entry_descricao');

    const data = {
        modelo: modelo.value,
        marca: marca,
        descricao: descricao.value
    };

    try {
        const response = await axios.post('http://localhost:8080/celular/new', data);  // Substitua pela URL do seu backend
        console.log('Dados enviados com sucesso:', response.data);
        modelo.value = '';
        descricao.value= '';
        fetchData(); // Atualiza a lista após enviar os dados
    } catch (error) {
        console.error('Erro ao enviar dados:', error);
    }
}

async function fetchData() {
    try {
        const response = await axios.get('http://localhost:8080/celular/find');  // Substitua pela URL do seu backend
        const data = response.data;
        const tbody = document.getElementById('id_tbody');
        tbody.innerHTML = '';  // Limpa as linhas existentes
        console.log(data)
        data.forEach((item, index) => {

            const row = document.createElement('tr');
            const idCell = document.createElement('td');
            row.id = 'linha' + data[index].id;
            idCell.textContent = index + 1; // Use index como ID temporário

            row.appendChild(idCell);

            const modeloCell = document.createElement('td');
            const modeloInput = document.createElement('input');
            modeloInput.type = 'text';
            modeloInput.className = 'linha';
            modeloInput.id = `modelo${index}`
            modeloInput.value = item.modelo;
            modeloInput.disabled = true;
            modeloCell.appendChild(modeloInput);
            row.appendChild(modeloCell);

            const marcaCell = document.createElement('td');
            const marcaInput = document.createElement('input');
            marcaInput.type = 'text';
            marcaInput.className = 'linha';
            marcaInput.id = `marca${index}`
            marcaInput.value = (item.marca).charAt(0).toUpperCase() + (item.marca).slice(1).toLowerCase() ;
            marcaInput.disabled = true;
            marcaCell.appendChild(marcaInput);
            row.appendChild(marcaCell);

            const descricaoCell = document.createElement('td');
            const descricaoInput = document.createElement('input');
            descricaoInput.type = 'text';
            descricaoInput.className = 'linha';
            descricaoInput.id = `descricao${index}`
            descricaoInput.value = item.descricao;
            descricaoInput.disabled = true;
            descricaoCell.appendChild(descricaoInput);
            row.appendChild(descricaoCell);

            const actionsCell = document.createElement('td');
            actionsCell.className = "botoes_linha"
            actionsCell.innerHTML = `
                <button class="editBtn" id="${`btnEdit${data[index].id}`}"><i class="fa-solid fa-pencil"></i></button>
                <button class="deleteBtn" id="${`btnDelete${data[index].id}`}"><i class="fa-solid fa-trash"></i></button>
            `;
            row.appendChild(actionsCell);

            tbody.appendChild(row);

            document.getElementById(`btnDelete${data[index].id}`).onclick = function() {
                
                // if(deleteAparelho(data[index].id) == 200){
                //     row.remove()
                // }
                console.log(deleteAparelho(data[index].id))
            }

            document.getElementById(`btnEdit${data[index].id}`).onclick = function() {
                habilitarCampo(index, data[index].id);           

            }
        })
    } catch (error) {
        console.error('Erro ao buscar dados:', error);
    }
}



function habilitarCampo (index, id){

    var modelo = document.getElementById(`modelo${index}`)
    var marca = document.getElementById(`marca${index}`)
    var descricao = document.getElementById(`descricao${index}`)

    if(modelo.disabled){
        modelo.disabled = false
        marca.disabled = false
        descricao.disabled = false
                
    }
    else{ 
        modelo.disabled = true
        marca.disabled = true
        descricao.disabled = true

        console.log(`modelo: ${modelo.value}`)


        var aparelho = {
            id:id,
            modelo:modelo.value,
            marca:(marca.value).toUpperCase(),
            descricao:descricao.value
        }
        console.log((marca.value).toUpperCase());
        atualizarAparelho(aparelho);

    }

}


async function atualizarAparelho (aparelho){
    try{
        var request = await axios.put("http://localhost:8080/celular", aparelho)
        if (request.data == null){
            console.log("ID não existe")
        }

    }
    catch(erro){ 
        console.error("Erro ao tentar atualizar: " + erro)

    }

}

async function deleteAparelho (id){
    try{

        var request = await axios.delete(`http://localhost:8080/celular/${id}`)
        if (request.data == null){
            console.log("ID não existe")
        }
        else{
            console.log("Resposta da requisição: "+ typeof(request.status))
        
            return request.status

    }


    }
    catch(erro){ 
        console.error("Erro ao tentar atualizar: " + erro)

    }

}