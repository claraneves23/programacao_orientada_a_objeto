class Automovel:
    __cor = "verde"

    def __init__(self, ano=0, modelo="", marca="", preco=0):
        self.__ano = ano
        self.modelo = modelo
        self.marca = marca
        self.preco = float(preco)

    
    def mostrar_carro(self):
        print(f"\nano: {self.__ano}\t"
              f"\nmodelo: {self.modelo}\t"
              f"\nmarca: {self.marca}\t"
              f"\ncor: {Automovel.__cor}\t"  
              f"\npreco:{self.preco}\t")


