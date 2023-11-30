Feature: Login Page

  Scenario Outline: Inicio de sesion Fallido por email incorrecto

    Given que el usuario se encuentra en el sitio Automation-Practice
    When  el usuario hace click en My Account
    And   el usuario ingresa  <email>  en el campo Username or email address
    And   el usuario ingresa  <password> en el campo Password
    And   el usuario hace click en el boton LOGIN
    Then  el usuario visualiza un mensaje Error: A user could not be found with this email address.



    Examples:
      |             email          |password               |
      |   joel@gmail.com           | Scarface242424*       |



  Scenario Outline: Inicio de sesion Fallido por email con Mayuscula

    Given que el usuario se encuentra en el sitio Automation-Practice
    When  el usuario hace click en My Account
    And   el usuario ingresa  <email>  en el campo Username or email address
    And   el usuario ingresa  <password> en el campo Password
    And   el usuario hace click en el boton LOGIN
    Then  el usuario visualiza un mensaje Error: A user could not be found with this email address.



    Examples:
      |             email                 |password               |
      |   ESTEBANJOEL@gmail.com           | Scarface242424*       |



  Scenario Outline: Inicio de Sesion

    Given que el usuario se encuentra en el sitio Automation-Practice
    When  el usuario hace click en My Account
    And   el usuario ingresa  <email>  en el campo Username or email address
    And   el usuario ingresa  <password> en el campo Password
    And   el usuario hace click en el boton LOGIN
    And   el usuario hace click en el texto Sign out
    And   el usuario hace click en el icono ubicado en la parte superior izquieda
    Then  el usuario visualiza la pagina principal del sitio



    Examples:
      |             email                 |password               |
      |   estebanjoel@gmail.com           | Scarface242424*       |








