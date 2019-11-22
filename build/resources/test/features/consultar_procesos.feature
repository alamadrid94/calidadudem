#language: es

Característica: "David" como persona
  Quiere consultar sus procesos judiciales
  Para ver el estado de su proceso judicial

  Escenario: Consultar el proceso judicial 00000000
    Dado que "david" esta consultando un proceso judicial
    Cuando selecciona ciudad "MEDELLIN", entidad "TRIBUNAL ADMINISTRATIVO DE ANTIOQUIA (ESCRITURAL)" y numero de radicado "0000000000"
    Entonces debe poder activar la consulta
