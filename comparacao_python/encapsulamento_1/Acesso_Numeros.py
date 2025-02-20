class Acesso_Numeros:
    def __init__(self,a="", b="", c="",d=""):
        self.a = a
        self.b = b
        self.__c = c #private
        self._d = d #protected

    def setNumero(self,id,numero):
        if(id=="a"):
            self.a = numero
        
        if(id=="c"):
            self.c = numero

        if(id=="d"):
            self.d = numero

    def mostra_numero():
        print("numero a = {a}")
        print("numero b = {b}")
        print("numero c = {__c}")
        print("numero d = {_d}")
        
