Feature: Home Page
  @Scar
    Scenario: Pagina de inicio con tres Arrivals

      Given que el usuario se encuentra en el sitio Automation-Practice
      When  hago click en el boton Shop
      And   hago click en el boton Menu
      And   hago un scroll hasta abajo
      And   se visualiza los tres arrivals


    Scenario: Agregar producto al carrito

      Given que el usuario se encuentra en el sitio Automation-Practice
      When  hago click en un producto
      And   hago click en add to basket
      And   hago click en el carrito
      Then  se visualiza el producto en el carrito







