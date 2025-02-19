class Automovel:
    def __init__(self,marca="", modelo="", cor="",preco=""):
        self.marca = marca
        self.modelo = modelo
        self.cor = cor 
        self.preco = preco

    def Informa_automovel(self):
        print(f"Marca:  {self.marca}")
        print(f"Modelo:  {self.modelo}")
        print(f"Cor:  {self.cor}")
        print(f"Preço:  {self.preco}")

