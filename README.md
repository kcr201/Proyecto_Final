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
