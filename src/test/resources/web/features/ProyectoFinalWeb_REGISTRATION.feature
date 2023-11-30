Feature: Registro Page


  Scenario Outline: Registro Fallido por falta de contraseña

    Given que el usuario se encuentra en el sitio Automation-Practice
    When  el usuario hace click en la seccion My Account
    And   el usuario ingresa  <email>  en el campo Email address de la seccion Register
    And   el usuario ingresa  <password> en el campo Password de la seccion Register
    And   el usuario hace click en el boton REGISTER
    Then  el usuario visualiza un mensaje Error: Please enter an account password.



    Examples:
      |             email          |password               |
      |   seba123@gmail.com        |                       |



  Scenario Outline: Registro Fallido por campos vacios

    Given que el usuario se encuentra en el sitio Automation-Practice
    When  el usuario hace click en la seccion My Account
    And   el usuario ingresa  <email>  en el campo Email address de la seccion Register
    And   el usuario ingresa  <password> en el campo Password de la seccion Register
    And   el usuario hace click en el boton REGISTER
    Then  el usuario visualiza un mensaje Error: Please provide a valid email address.



    Examples:
      |             email          |password               |
      |                            |                       |






