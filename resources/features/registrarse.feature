Feature: el susario se registra

  Scenario Outline: usuario se regitra para comprar
    Given el usuario se encuentra en la pagina de registro
    When el usuario escribe su <coreo> y su <contrasena>
    Then el usuario ve texto<exitoso>

    Examples:
      | coreo               | contrasena       | exitoso   |
      | josefernandotroyano | ZhTLmgTFZU7yn2L | Mi cuenta |