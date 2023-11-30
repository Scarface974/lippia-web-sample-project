Feature: Home Page

    Scenario: Pagina de inicio con tres Arrivals

      Given  que el usuario se encuentra en el sitio Automation-Practice
       When  el usuario hace click en el boton Shop
        And  el usuario hace click en el boton Menu
        And  el usuario realiza un scroll hasta abajo
        And  el usuario visualiza los tres arrivals


    Scenario: Agregar producto al carrito

      Given  que el usuario se encuentra en el sitio Automation-Practice
       When  el usuario hace click en un producto
        And  el usuario hace click en add to basket
        And  el usuario hace click en el carrito
       Then  se visualiza el producto en el carrito


    Scenario: Visualizar Detalles de Compra

     Given  que el usuario se encuentra en el sitio Automation-Practice
      When  el usuario hace click en un producto
      And   el usuario hace click en add to basket
      And   el usuario hace click en el carrito
      And   el usuario hace click en el boton PROCEED TO CHECKOUT
      And   el usuario hace click en el texto Click here to enter your code
     Then   el usuario visualiza los detalles para el ingreso del cupon
      And   el usuario visualiza los detalles de facturacion
      And   el usuario visualiza informacion adicional
      And   el usuario visualiza detalles de pago


    Scenario Outline: Realizar Pedido

      Given   que el usuario se encuentra en el sitio Automation-Practice
       When   el usuario hace click en un producto
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

