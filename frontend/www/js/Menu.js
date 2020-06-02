document.addEventListener("deviceready",function(){
    $.ajax({
        type: "GET",
        url: "http://192.168.1.88:8000/verTodos",
        contentType: "application/json; charset=utf-8",
        dataType: 'json',
        cache: false,
        success: function(respuesta) {
            console.log(respuesta);
     
            for (var i = 0; i < respuesta.length; i++) {
                $("#pacientes").append('                                                     \
                <div id="c" class="card">                                                       \
                    <div class="card-body">                                              \
                        <p class="card-text">Rut: '+ respuesta[i].rut + '</p>    \
                        <p class="card-text">Enfermedad: '+ respuesta[i].enfermedad + '</p>    \
                        <a href="/Ver1.html" onclick="setPaciente('+ respuesta[i].id +')"\
                        class="btn btn-primary">Ver detalles</a>                           \
                        <a  onclick="delPaciente('+ respuesta[i].id +')"\
                        class="btn btn-primary">Eliminar</a>                           \
                    </div>                                                               \
                </div>                                                                   \
            ');     
            }            
        },
        error: function() {
            console.log("No se ha podido obtener la información");
        }
    })
});


function setPaciente(paciente) {
    window.localStorage.setItem("paciente", paciente.toString());
}
  
function delPaciente(paciente) {
    $.ajax({
        type: "DELETE",
        url: "http://192.168.1.88:8000/del1Paciente",
        data: JSON.stringify( { id:paciente} ),
        contentType: "application/json; charset=utf-8",
        dataType: 'json',
        cache: false,
        success: function(respuesta) {
            window.location.href = "/Menu.html";
        },
        error: function() {
            console.log("No se ha podido obtener la información");
        }
    });
}