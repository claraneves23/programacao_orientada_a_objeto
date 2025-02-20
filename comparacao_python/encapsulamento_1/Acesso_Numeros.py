class Acesso_Numeros:
    def __init__(self):
        self.a = 0  # Público
        self.b = 0  # Público
        self.__c = 0  # Privado
        self._d = 0  # Protected

    def set_numero(self, id, numero):
        if id == "a":
            self.a = numero
        elif id == "c":
            self.__c = numero
        elif id == "d":
            self._d = numero

    def mostra_numero(self):
        print(f"numero a = {self.a}")  # Acesso ao atributo público 'a'
        print(f"numero b = {self.b}")  # Acesso ao atributo público 'b'
        print(f"numero c = {self.__c}")  # Acesso ao atributo protegido '_c'
        print(f"numero d = {self._d}")  # Acesso ao atributo privado '__d'