
#language: es

Característica: Reservar vuelo
  Como usuario web
  Desea ingresar a expedia
  A reservar un vuelo
  @RunnerTags

  Escenario: Reservar primer vuelo
    Dado que el usuario quiere ingresar a la pagina de expedia
    Cuando el ingrese el podra reservar el vuelo de Manizales, Colombia (MZL-La Nubia) a Medellin, Colombia (MDE-All Airports) y la 10/17/2019 que deseee
    Entonces el deberia ver las 7:46am que es el primer vuelo
