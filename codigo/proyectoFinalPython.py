"""
    Proyecto Bimestral
    Segundo Bimestre
    
    Problemática:
"""

def crearFacebook():
    """
        //método crearFacebook - (método que devuelve un valor)
        //Facebook (se necesita los siguientes datos: nombre de usuario,
        edad, ciudad, pais, correo electrónico)
    """
    nombreUsuario = input("Usted escogió la opción crear cuenta en " \
                          "Facebook\nIngresar el nombre de Usuario: ")
    edadUsuario = int(input("Ingresar la edad del Usuario: "))
    ciudadUsuario = input("Ingresar la ciudad donde se ubica el Usuario: ")
    paisUsuario = input("Ingresar el país donde se ubica el Usuario: ")
    correoUsuario = ("Ingresar correo del Usuario: ")
    cadena = f'Creando cuenta de Facebook\n' \
             f'Nombre del usuario: {nombreUsuario}\n' \
             f'Edad del usuario: {edadUsuario}\n' \
             f'Ciudad del usuario: {ciudadUsuario}\n' \
             f'País del usuario: {paisUsuario}\n' \
             f'Correo del usuario: {correoUsuario}\n'
    return cadena
    print("Creando cuenta de Facebook")

def crearTwitter():
    """
          //método crearTwitter - (método que no devuelve un valor)
         //Twitter (se necesita los siguientes datos: nombre de usuario,
        nombres, apellidos, edad, ciudad, pais, idioma, correo electrónico)
    """
    nombreUsuario = input("Usted escogió la opción crear cuenta en Twitter" \
                          "\nIngresar el nombre de Usuario: ")
    nombres = input("Ingresar los nombres completos del Usuario: ")
    apellidos = input("Ingresar los apellidos completos del Usuario: ")
    edadUsuario = int(input("Ingresar la edad del Usuario: "))
    ciudadUsuario = input("Ingresar la ciudad donde se ubica el Usuario: ")
    paisUsuario = input("Ingresar el país donde se ubica el Usuario: ")
    idiomaUsuario = input("Ingresar el idioma que habla el Usuario: ")
    correoUsuario = ("Ingresar correo del Usuario: ")
    print(f"Resumen de cuenta creada en Twitter\n" \
          f"Nombre del Usuario: {nombreUsuario}\n" \
          f"Nombres completos del Usuario: {nombres}\n"
          f"Apellidos completos de usuario: {apellidos}\n" \
          f"Edad del usuario: {edadUsuario}\n" \
          f"Ciudad del usuario: {ciudadUsuario}\n" \
          f"País del usuario: {paisUsuario}\n" \
          f"Idioma del usuario: {idiomaUsuario}\n" \
          f"Correo del usuario: {correoUsuario}\n")
    cadena = "%s\n" % ("Creando cuenta de Twitter")
    return cadena
def crearWhatsapp():
    """
        explicación de método
        - método crearWhatsapp - - (método que devuelve un valor)
        - Whatsapp (se necesita los siguientes datos: nombre de usuario,
        número de teléfono, edad, ciudad, pais)
    """
    nombreUsuario = input("Usted escogió la opción crear cuenta en Whatsapp"\
    "\nIngresar el nombre de Usuario: ")
    numeroTelefono = input("Ingresar el número de teléfono del Usuario: ")
    edadUsuario = int(input("Ingresar la edad del Usuario: "))
    ciudadUsuario = input("Ingresar la ciudad donde se ubica el Usuario: ")
    paisUsuario = input("Ingresar el país donde se ubica el Usuario: ")
    cadena = f"Resumen de cuenta creada en Whatsapp\n"\
    f"Nombre del usuario: {nombreUsuario}\n"\
    f"Número del teléfono del usuario: {numeroTelefono}\n"\
    f"Edad del usuario: {edadUsuario}\n"\
    f"Ciudad del usuario: {ciudadUsuario}\n"\
    f"País del usuario: {paisUsuario}\n"
    return cadena

def crearTelegram():
    """
        explicación de método
        - método crearTelegram - (método que no devuelve un valor)
        - Telegram (se necesita los siguientes datos: nombre de usuario,
        número de teléfono, ciudad, pais, área de interés)
    """
    nombreUsuario = input("Usted escogió la opción crear cuenta en Telegram"\
    "\nIngresar el nombre de Usuario: ")
    numeroTelefono = input("Ingresar el número de teléfono del Usuario: ")
    ciudadUsuario = input("Ingresar la ciudad donde se ubica el Usuario: ")
    paisUsuario = input("Ingresar el país donde se ubica el Usuario: ")
    areaInteres = input("Ingresar el área de interés del Usuario: ")
    print(f"Resumen de cuenta creada en Telegram\n"\
    f"Nombre del usuario: {nombreUsuario}\n"\
    f"Número del teléfono del usuario: {numeroTelefono}\n"\
    f"Ciudad del usuario: {ciudadUsuario}\n"\
    f"País del usuario: {paisUsuario}\n"\
    f"Área de interés del usuario: {areaInteres}\n")

def crearSignal():
    """
         //método crearSignal- (método que devuelve un valor)
        //Signal (se necesita los siguientes datos: nombre de usuario,
        número de teléfono, ciudad, pais, hobby principal)
    """
    nombreUsuario = input("Usted escogió la opción crear cuenta en Signal\n"\
    "Ingresar el nombre de Usuario: ")
    numeroTelefono = input("Ingresar el número de teléfono del Usuario: ")
    ciudadUsuario = input("Ingresar la ciudad donde se ubica el Usuario: ")
    paisUsuario = input("Ingresar el país donde se ubica el Usuario: ")
    hobbyPri = input("Ingresar el hobby principal: ")
    cadena = f"Resumen de cuenta creada en Signal\n"\
    f"Nombre del usuario: {nombreUsuario}\n"\
    f"Número del teléfono del usuario: {numeroTelefono}\n"\
    f"Ciudad del usuario: {ciudadUsuario}\n"\
    f"País del usuario: {paisUsuario}\n"\
    f"Hobby principal del usuario: {hobbyPri}\n"
    return cadena

def crearInstagram():
    """
         //método crearInstagram - (método que no devuelve un valor)
        //Instagram (se necesita los siguientes datos: nombre de usuario,
        ciudad, edad, correo electrónico)
    """
    nombreUsuario = input("Usted escogió la opción crear cuenta en Instagram"\
    f"\nIngresar el nombre de Usuario: ")
    ciudadUsuario = input("Ingresar la ciudad donde se ubica el Usuario: ")
    edadUsuario = int(input("Ingresar la edad del Usuario: "))
    correoUsuario = input("Ingresar correo del Usuario: ")
    print("Resumen de cuenta creada en Instagram\n"\
    f"Nombre del usuario: {nombreUsuario}\n"\
    f"Ciudad del usuario: {ciudadUsuario}\n"\
    f"Edad del usuario: {edadUsuario}\n"\
    f"Correo del usuario: {correoUsuario}\n")

def crearFlickr():
    """
        explicación de método
        //método crearFlickr - (método que devuelve un valor)
        //Flickr (se necesita los siguientes datos: nombre de usuario,
        correo electrónico)
    """
    nombreUsuario = input("Usted escogió la opción crear cuenta en Flickr\n"\
    "Ingresar el nombre de Usuario: ")
    correoUsuario = input("Ingresar correo del Usuario: ")
    cadena = f"Resumen de cuenta creada en Flickr\n"\
    f"Nombre del usuario: {nombreUsuario}\n"\
    f"Correo del usuario: {correoUsuario}\n"
    return cadena

def obtenerMensaje(cont):
    """
        // Si el número de cuentas creadas está en el rango del 1 a 5 el
        mensaje será: Campaña con poca afluencia
        // Si el número de cuentas creadas está en el rango de 6 a 15 el
        mensaje será: Campaña moderada siga adelante
        // Si el número de cuentas creadas está en el rango de mayores de
        16, el mensaje será: Excelente campaña
    """
    cadena = ""
    mensajeFinal = ["Campaña con poca afluencia",
                    "Campaña moderada siga adelante", "Excelente campaña"]
    if ((cont >= 1) and (cont<= 5)):
        cadena = mensajeFinal[0]
    elif ((cont >= 6) and (cont <= 15)):
        cadena = mensajeFinal[1]
    else:
        if ((cont >= 16)):
            cadena = mensajeFinal[2]
    return cadena
def principal():
    """
        explicación de método
        En la función principal se presenta un ciclo
        repetitivo que presenta un menú de opciones:
        - Si se ingresa 1 se llamará a crearFacebook
        - Si se ingresa 2 se llamará a crearTwitter
        - Si se ingresa 3 se llamará a crearWhatsapp
        - Si se ingresa 4 se llamará a crearTelegram
        - Si se ingresa 5 se llamará a crearSignal
        - Si se ingresa 6 se llamará a crearInstagram
        - Si se ingresa 7 se llamará a crearFlickr
    """

    bandera = True
    contadorCuentas = 1
    while (bandera):
        opcion1 = int(input("Ingresar 1 para crear una cuenta en Facebook\n"\
        f"Ingresar 2 para crear una cuenta de Twitter\n"\
        f"Ingresar 3 para crear una cuenta en Whatsapp\n"\
        f"Ingresar 4 para crear una cuenta en Telegram\n"\
        f"Ingresar 5 para crear una cuenta en Signal\n"\
        f"Ingresar 6 para crear una cuenta en Instagram\n"\
        f"Ingresar 7 para crear una cuenta en Flickr: "))
        if (opcion1 == 1):
            print(crearFacebook())
        elif (opcion1 == 2):
            crearTwitter()
        elif (opcion1 == 3):
            print(crearWhatsapp())
        elif (opcion1 == 4):
            crearTelegram()
        elif (opcion1 == 5):
            print(crearSignal())
        elif (opcion1 == 6):
            crearInstagram()
        elif (opcion1 == 7):
            print(crearFlickr())
        else :
            print("Existe un error: el valor no se encuentra en los parametros establecidos")
            contadorCuentas = contadorCuentas + 1
        # En cada iteración del ciclo; se pregunta al usuario si se
        # desea salir del ciclo.
        opcion2 = input("Escriba SI para crear mas cuentas\n"\
        "Escriba NO para ya no crear mas cuentas: ")
        opcion2 = opcion2.lower()
        if (opcion2 == "no"):
            bandera = False
            print(obtenerMensaje(contadorCuentas))
            """
                Cuando el usuario termina el ciclo repetitivo se debe
                presentar un mensaje con base al número total de cuentas
                creadas. Se debe usar el número total de cuentas como
                argumento (entero) de una función llamada obtenerMensaje
            """
        else:
            contadorCuentas = contadorCuentas + 1


# Aquí empieza el proceso cuando se ejecuta por consola
# el archivo
# python run.py
if __name__ == "__main__":
    principal()
