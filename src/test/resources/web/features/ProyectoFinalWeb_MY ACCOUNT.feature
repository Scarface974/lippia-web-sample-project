Feature: Login Page
  @Scar
  Scenario Outline: Inicio de sesion Fallido por email incorrecto

    Given  que el usuario se encuentra en el sitio Automation-Practice
    When   el usuario hace click en My Account
     And   el usuario ingresa  <email>  en el campo Username or email address
     And   el usuario ingresa  <password> en el campo Password
     And   el usuario hace click en el boton LOGIN
     And   el usuario hace click en Account Details
    Then   el usuario viusaliza los detalles de su cuenta



    Examples:
      |             email                 |password               |
      |   estebanjoel@gmail.com           | Scarface242424*       |



  Scenario Outline: Cierre de Sesion

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








