#  Proyecto Refactor

## 📋 Descripción
Se realizo un fork del proyecto original de [Codigo Facilito Refactor](https://github.com/benek/Bootcamp-Java-Avanzado) para refactorizar y mejorar su estructura y calidad de código. El objetivo principal era reparar el codigo y volverlo funcional, asi como tambien mejorar la legibilidad, mantenibilidad y escalabilidad del sistema.


## ✨ Implementaciones Principales

### Refactorización
- Patron Factory y Strategy, para mejorar la escalabilidad y poder utilizar otras fuentes de playlists.
- Patron Builder en los modelos.
- Ajustes en el modelado de datos, se separa el contenido de Song.java en varias clases segun su funcionalidad.
- Se cambia la clase SongProcessor por SpotifySongProcessor.java, se utiliza el patron Strategy para poder utilizar otras fuentes de playlists.
- Se subdivide la funcionalidad de SpotifySongProcessor.java, se separa en distintos metodos para lograr una mejor atomicidad.

### Actualizacion a Java 23
- Se utilizo Pattern Matching en SongProcessorFactory para mejorar la legibilidad del codigo.
- Y se utilizo Text Blocks en Playlist en el metodo printSongs para mejorar la legibilidad tambien.


## 🛠️ Tecnologías Utilizadas
- Java 23


## 🚀 Instalación y Configuración

### Prerrequisitos
- Java JDK 23


### Pasos de Instalación
1. Clonar el repositorio
```
git clone https://github.com/Kdna-dev/Bootcamp-Java-Avanzado.git
```

2. Navegar al directorio del proyecto
```
cd java-refactor
```

3. Compilar el proyecto java
```
mvn clean compile
```
3. Ejecutar la aplicación
```
mvn exec:java
```

Con estos pasos anteriores ya podras ejecutar la aplicacion y ver los resultados de la refactorizacion.

Para visualizar las implementaciones de codigo java moderno debes moverte a la rama refactor-to-java-23 y volver a compilar y ejecutar la aplicacion.

```
git checkout refactor-to-java-23
```

Link de la rama: [Refactor to Java 23](https://github.com/Kdna-dev/Bootcamp-Java-Avanzado/tree/refactor-to-java-23)



## 🤝 Contribuir
1. Fork el proyecto
2. Crea tu rama de características (`git checkout -b feature/AmazingFeature`)
3. Commit tus cambios (`git commit -m 'Add: alguna característica asombrosa'`)
4. Push a la rama (`git push origin feature/AmazingFeature`)
5. Abre un Pull Request


## ✍️ Autor
Santiago Cabrera - [@Kdna-dev](https://github.com/Kdna-dev)


## 🙏 Agradecimientos
- A Codigo Facilito por brindarme la oportunidad de desarrollar este desafiante proyecto
- A la comunidad de Java por su excelente documentación
