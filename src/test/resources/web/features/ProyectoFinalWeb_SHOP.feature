Feature: Shop Page


    Scenario Outline: Ver Detalles de Compra Final

      Given que el usuario se encuentra en el sitio Automation-Practice
      When  el usuario hace click en un producto
       And   el usuario hace click en add to basket
       And   el usuario hace click en el carrito
       And   el usuario hace click en el boton PROCEED TO CHECKOUT
       And   el usuario ingresa <nombre> en el campo First Name
       And   el usuario ingresa <apellido> en el campo Last Name
       And   el usuario ingresa <compañia> en el campo Company Name
       And   el usuario ingresa <email> en el campo Email Address
       And   el usuario ingresa <telefono> en el campo Phone
       And   el usuario hace click en el desplegabe de Country
       And   el usuario ingresa el pais Argentina
       And   el usuario ingresa <direccion> en el campo Street address
       And   el usuario ingresa <direccion2> en el campo Apartament,suite,unit etc
       And   el usuario ingresa  <pueblo_ciudad> en el campo Town / City
       And   el usuario hace click en el desplegable de State / County
       And   el usuario ingresa Corrientes en el campo State / County
       And   el usuario ingresa  <postcode> en la campo Postcode / ZIP
       And   el usuario hace click en el boton PLACE ORDER
      Then   se visualiza los detalles del pedido



      Examples:
        |       nombre      |        apellido         |  compañia        |  email               |      telefono     | direccion       |direccion2            | pueblo_ciudad          |postcode|
        | Esteban Joel      |      Maldonado Gauna    |    AirsoftShot   |  airshot@gmail.com   |     3794553321    |  Salvador 974   |   apartamento        |     Corrientes         |  3400  |



  Scenario Outline: Verificar Impuesto del 2%

    Given que el usuario se encuentra en el sitio Automation-Practice
    When  el usuario hace click en un producto
    And   el usuario hace click en add to basket
    And   el usuario hace click en el carrito
    And   el usuario hace click en el boton PROCEED TO CHECKOUT
    And   el usuario ingresa <nombre> en el campo First Name
    And   el usuario ingresa <apellido> en el campo Last Name
    And   el usuario ingresa <compañia> en el campo Company Name
    And   el usuario ingresa <email> en el campo Email Address
    And   el usuario ingresa <telefono> en el campo Phone
    And   el usuario hace click en el desplegabe de Country
    And   el usuario ingresa el pais India en el campo Country
    And   el usuario ingresa <direccion> en el campo Street address
    And   el usuario ingresa <direccion2> en el campo Apartament,suite,unit etc
    And   el usuario ingresa  <pueblo_ciudad> en el campo Town / City
    And   el usuario hace click en el desplegable de State / County
    And   el usuario ingresa Rajasthan en el campo State / County
    And   el usuario ingresa  <postcode> en la campo Postcode / ZIP
    And   el usuario hace click en el boton PLACE ORDER
    Then  el usuario visualiza la taza de impuesto correspondiente a la India



    Examples:
      |       nombre      |        apellido         |  compañia                         |  email                      |      telefono        | direccion                       |direccion2            | pueblo_ciudad          |postcode  |
      |  Raj Patel        |      Sharma             |    TechIndia Solutions Pvt. Ltd   |  raj.sharma@techindia.com   |     91-9876543210    |   123, Main Street, Bangalore   |   apartamento        |     Jaipur             |  560001  |


  Scenario Outline: Verificar Impuesto del 5%

    Given que el usuario se encuentra en el sitio Automation-Practice
    When  el usuario hace click en un producto
    And   el usuario hace click en add to basket
    And   el usuario hace click en el carrito
    And   el usuario hace click en el boton PROCEED TO CHECKOUT
    And   el usuario ingresa <nombre> en el campo First Name
    And   el usuario ingresa <apellido> en el campo Last Name
    And   el usuario ingresa <compañia> en el campo Company Name
    And   el usuario ingresa <email> en el campo Email Address
    And   el usuario ingresa <telefono> en el campo Phone
    And   el usuario hace click en el desplegabe de Country
    And   el usuario ingresa el pais Argentina
    And   el usuario ingresa <direccion> en el campo Street address
    And   el usuario ingresa <direccion2> en el campo Apartament,suite,unit etc
    And   el usuario ingresa  <pueblo_ciudad> en el campo Town / City
    And   el usuario hace click en el desplegable de State / County
    And   el usuario ingresa Corrientes en el campo State / County
    And   el usuario ingresa  <postcode> en la campo Postcode / ZIP
    And   el usuario hace click en el boton PLACE ORDER
    Then  el usuario visualiza la taza de impuesto correspondiente al extranjero



    Examples:
      |       nombre      |        apellido         |  compañia        |  email               |      telefono     | direccion       |direccion2            | pueblo_ciudad          |postcode|
      | Esteban Joel      |      Maldonado Gauna    |    AirsoftShot   |  airshot@gmail.com   |     3794553321    |  Salvador 974   |   apartamento        |     Corrientes         |  3400  |