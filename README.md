# Proyecto_Final
Control de acceso con el entorno grafico de Java y un manejo con Arduino

El proyecto se basa en la union de de las herramientas de Java en la programacion orientada a objetos
para realizar un entorno grafico con JFrame y JButton para manejar y controlar componentes externos 
como leds y buzzer con ayuda del microcontrolador Arduino.
El funcionamiento basico del programa es crear una ventana que que contenga 12 botones, un label y un panel
los botones haran la funcion de los numeros del 1-9, 0, borrar y enter, todos juntos funcionaran como un panel de acesso en los que
el usuario tendra que ingresar un codigo y clickear en enter, si el codigo es correcto emergera una ventana con un 
mensaje diciendo CODIGO CORRECTO, y a su vez con la comunicacion serial de arduino encendera un led VERDE, si el codigo es incorrecto emergera
un mensaje CODIGO INCORRECTO, y a su vez se encendera un led ROJO.
El usuario tiene 3 intentos para ingresar el codigo correcto de no ser asi el sistema se pondra en modo alarma y activara un buzzer que emitira un sonido de alarma y encendera un led con la funcion de parpadear, esto se repetira  hasta que se ingrese el codigo correcto.
Al inicio del programa se encendera un led azul de que el sistema esta activado.

Para que el programa pueda correr de manera adecuada debera descargarse la aplicacion de arduino y contar con los componentes necesario y los conocimientos basicos 
para descargar entrar al siguiente link https://www.arduino.cc/en/main/software. y dependiendo del sistema operativo elegir el correspondiente.
El desarrollador que se utilizo fue netbeans, seguir las mismas instrucciones de la linea anterior con arduino. link: https://netbeans.org/downloads/8.2/rc/ 

Para la comunicacion serial entre arduino y java se utilizo la libreria PanamaHitek descargar y agregar como JAR/folder

La lista de componentes electronicos es:
1 led RGB catodo comun
1 led rojo
4 resistencias 220 ohms
1 modulo buzzer pasivo 
15 jumpers macho-hembra
5 jumpers macho-macho
1 Arduino Uno

Para la conexion de los componentes y Arduino se adjunto en la carpeta de "Proyecto_Final" un esquematico del programa Fritzing, el cual se pueded descargar en https://fritzing.org/download/  
