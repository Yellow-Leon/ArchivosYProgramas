Implementa un programa que permita representar los programas instalados en un ordenador y los archivos que van a gestionar. Para ello se debe crear:

    Una jerarquía de clases para representar los distintos tipos de archivos. Todos los archivos tienen un tamaño (int) y un path (String).
         Existen tres tipos de archivos:
            Texto: definen otro campo con el text que contienen
            Imagen: definen la altura y anchura de la imagen (int)
            org.ies.archivosyprogramas.models.archive.Audio: definen la duración del fichero de audio
        Todos los archivos tienen un método open() que muestra la información del org.ies.archivosyprogramas.models.archive en pantalla
            Cada tipo de org.ies.archivosyprogramas.models.archive debe mostrar los datos específicos de su subtipo además de los compartidos
        Además, habrá otro método move(String newPath) que realizará lo siguiente:
            Comprueba que el nuevo path es distinto del actual. 
            Si son iguales saca en pantalla el mensaje "No hay cambios"
            Si son distintos, modifica el path y muestra el mensaje "Se ha movido el fichero a " +newPath
    Una clase para representar programas. La clase Program debe ser genérica en el tipo de ficheros que gestiona (es necesario por un bounded type en el genérico). 
        Cada programa estará definido por:
            Un nombre del programa
            Un array de ficheros que gestiona. Dicho array debe contener archivos del tipo que gestiona el programa
        Define un método método execute(String outputPath)
            Imprime en pantalla el nombre del programa
            Recorre todos sus archivos abriéndolos y moviéndolos al outputPath
    Componentes (crea interfaces para los componentes):
        Un reader por cada tipo de org.ies.archivosyprogramas.models.archive (incluyendo la superclase)
        Un reader de Program<TextFile>
    Main:
        Crea los componentes encesarios para leer un Program<TextFile>
        Lee un Program<TextFile>
        Pide al usuario un path de salida (usando el scanner)
        Ejecútalo program.execute(outputPath)
