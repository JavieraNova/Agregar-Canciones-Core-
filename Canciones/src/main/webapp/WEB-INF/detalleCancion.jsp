<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Detalle de Canción</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
</head>
<body>
    <div class="container detalle-cancion">
        <h1 class="mb-4">Detalle de Canción</h1>
        <p class="detalle-item"><strong>Título:</strong> ${cancion.titulo}</p>
        <p class="detalle-item"><strong>Artista:</strong> ${cancion.artista}</p>
        <p class="detalle-item"><strong>Álbum:</strong> ${cancion.album}</p>
        <p class="detalle-item"><strong>Género:</strong> ${cancion.genero}</p>
        <p class="detalle-item"><strong>Idioma:</strong> ${cancion.idioma}</p>
        <a class="btn btn-secondary volver-lista" href="/canciones">Volver a la Lista</a>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
</body>
</html>