$("#formregis").submit(function(e){

    e.preventDefault();

    $.ajax({
        type: "POST",
        url: "http://192.168.1.88:8000/registro",
        data: JSON.stringify({  nombre:$("#nombre").val(),rut:$("#rut").val(),enfermedad:$("#enfermedad").val() }),
        contentType: 'application/json',
        dataType: 'json',
        cache: false,

        success: function(respuesta){
            console.log(respuesta);
            window.location.href = "/Menu.html";
        },
        error: function(err){
            console.log(err);
        }
    })
});