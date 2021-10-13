# AREP PARCIAL CALCULADORA
Funciones asignadas
- Tangente (tan(x)))
- Exponencial (e^x)

## Autor
* Javier Esteban López Peña

## Contrucción
* NetBeans - Editor de código y ambiente de desarrollo
* Maven - Gestor de dependencias
* Docker 
* AWS Cloud

## Prerequisites
* Docker - Container Manager
* Java 8 - Development Environment
* Git - Version Control System
* Spark - Micro framework para creación de aplicaciones

## Screenshots

Imagenes en Docker

![](img/imageslocal.png)

Container en Docker 

![](img/containerlocal.png)

Corriendo Docker en el AWS

![](img/dockeraws.png)

Pruebas en Docker local

![](img/dockerexp.png)

![](img/dockertan.png)

Pruebas en Docker en AWS

![](img/pruebaexp.png)

![](img/pruebatan.png)

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

## Docker https://hub.docker.com/repository/docker/javier3005/arep-parcial
## Video https://youtu.be/pLMGWHEBCU8
