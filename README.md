# GestionEstudiantes – Unidad 3: Herencia en Java

Extensión de la aplicación de la Unidad 2. `Estudiante` es la clase base; `EstudiantePresencial` y `EstudianteEnLinea` son clases derivadas.

## Compilar y ejecutar
Desde la carpeta raíz:
```bash
javac -encoding UTF-8 -d out src/*.java
java -cp out Main
```

## Conceptos aplicados
- Herencia con `extends`.
- Reutilización del constructor mediante `super(...)`.
- Reutilización de `calcularPromedio()` y `estaAprobado()`.
- Sobrescritura de `mostrarInformacion()` con `@Override`.
- Métodos exclusivos de cada subclase.

## Publicar en GitHub
Crear un repositorio vacío llamado `GestionEstudiantes-Unidad3` y ejecutar:
```bash
git init
git add .
git commit -m "Extiende GestionEstudiantes con herencia"
git branch -M main
git remote add origin https://github.com/USUARIO/GestionEstudiantes-Unidad3.git
git push -u origin main
```
Sustituye `USUARIO` y la URL por los datos reales. No publiques contraseñas ni tokens.

## Mejoras de la Unidad 3

Se implementó herencia en el proyecto GestionEstudiantes.

Clases derivadas:
- EstudiantePresencial
- EstudianteEnLinea

Se reutilizaron los métodos de la clase base mediante super()
y se sobrescribió mostrarInformacion() utilizando @Override.

Autor: Omar Padilla.
