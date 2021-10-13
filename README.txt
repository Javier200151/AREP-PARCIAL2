# TALLER DE DE MODULARIZACIÓN CON VIRTUALIZACIÓN E INTRODUCCIÓN A DOCKER Y A AWS

El taller es una aplicación web usando Spark java. Esta aplicación se construyo en un container
para docker para la aplicación, se desplegó y se probó en una maquina local. Por ultimo se desplegó
el contenedor que se creo en una maquina virtual en AWS con Docker instalado

## Autor
* Javier Esteban López Peña

## Contrucción
* NetBeans - Editor de código y ambiente de desarrollo
* Maven - Gestor de dependencias
* Docker 
* AWS Cloud

## Docker https://hub.docker.com/repository/docker/javier3005/arep-parcial
## Video https://youtu.be/pLMGWHEBCU8

## Prerequisites
* Docker - Container Manager
* Java 8 - Development Environment
* Git - Version Control System
* Spark - Micro framework para creación de aplicaciones

## Screenshots

Imagenes en Docker

![](img/imageslocal.PNG)

Container en Docker 

![](img/containerlocal.PNG)

Corriendo Docker en el AWS

![](img/dockeraws.PNG)

Pruebas en Docker local

![](img/dockerexp.PNG)

![](img/dockertan.PNG)

Pruebas en Docker en AWS

![](img/pruebaexp.PNG)

![](img/pruebatan.PNG)

## Instrucciones

1. Clonar el repositorio

```
git clone https://github.com/Javier200151/AREP-PARCIAL2
```

2. Compilar/Construir el proyecto

```
mvn clean install
```

3. Construir la imagen Docker

```
docker build --tag dockersparkcalculadora .
```

4. Para ver que quedo usemos

```
docker images
```

5. Corremos el contenedor con la imagen creada

```
docker run -d -p 34000:6000 --name dockercontainer dockersparkcalculadora
```
