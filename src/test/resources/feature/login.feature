Feature: ID:6 MS para mantenimiento de usuarios
  Yo como Docente de la UTP
  Quiero crear un MS en REST
  Para el mantenimiento de Usuarios del Portal de Disponibilidad Horaria

  Scenario: Datos correctos Coordinador
    Given que tengo un MS de mantenimiento de usuarios
    When doy click en el boton de Sign In
    And colocamos los datos correctos del coordinador
    When le doy en el boton de Login

  Scenario: Datos incorrectos Coordinador
    Given que tengo un MS de mantenimiento de usuarios
    When doy click en el boton de Sign In
    And colocamos los datos incorrectos del coordinador
    When le doy en el boton de Login

  Scenario: Datos correctos Docente
    Given que tengo un MS de mantenimiento de usuarios
    When doy click en el boton de Sign In
    And colocamos los datos correctos del docente
    When le doy en el boton de Login

  Scenario: Datos incorrectos Docente
    Given que tengo un MS de mantenimiento de usuarios
    When doy click en el boton de Sign In
    And colocamos los datos incorrectos del docente
    When le doy en el boton de Login
