// Mostar Todo
document.addEventListener("deviceready", function(){
    $.ajax({
        type: "POST",
        url: "http://192.168.1.88:8000/ver1Paciente",
        data: JSON.stringify( { id: window.localStorage.getItem("paciente")} ),
        contentType: "application/json; charset=utf-8",
        dataType: 'json',
        cache: false,
        success: function(respuesta) {    
            $("#paciente").append('                                                     \
            <div id="c" class="card">                                                       \
                <div class="card-body">                                              \
                    <h10 class="card-title"> Id: '+respuesta.id+'</h10>      \
                    <h4 class="card-title"> Nombre: '+respuesta.nombre+'</h4>         \
                    <p class="card-text">Rut: '+ respuesta.rut + '</p>    \
                    <p class="card-text">Enfermedad: '+ respuesta.enfermedad + '</p>    \
                    <a href="/Menu.html"\
                    class="btn btn-primary">Volver</a>                           \
                </div>                                                               \
            </div>                                                                   \
        ');     
            
        },
        error: function() {
            console.log("No se ha podido obtener la información");
        }
    });
  })