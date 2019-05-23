Feature: Yo como usuario de la tienda Your Logo quiero tener la posibilidad de crear mi cuenta para poder ingresar a la página

#  Scenario: Creación de la cuenta
#    Given Que Oscar quiere crear una cuenta
#    When Creo la cuenta en la página
#      | titulo | nombre | apellido | correoElectronico      | contrasena | diaNacimiento | mesNacimiento | anoNacimiento | compania | direccion            | direccion2 | ciudad   | estado   | codigoPostal | pais          | infoAdicional       | telefono | celular    | segundaDireccion |
#      | Mrs    | Oscar  | Vasquez  | anacristina3@gmail.com | 12345      | 25            | November      | 1999          | Sofka    | Avenida siempre viva | Apto 301   | Medellin | Illinois | 53001        | United States | Escenario de prueba | 5854673  | 3104229735 | Calle 21 #19-83  |
#    Then Verifico que pueda ingresar a ella
#      | nombre | apellido |
#      | Oscar  | Vasquez  |

  Scenario: Validación de correo electrónico ya registrado
    Given Que Oscar quiere crear una cuenta
    When Intento crear una cuenta
      | correoElectronico      |
      | anacristina3@gmail.com |
    Then Verifico que se vea el mensaje de error indicando que el correo ya existe