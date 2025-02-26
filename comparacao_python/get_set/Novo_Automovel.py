class novo_automovel:
    def __init__(self,marca="", modelo="", cor="",preco=0):
        self.__marca = marca
        self.__modelo = modelo
        self.__cor = cor 
        self.__preco = preco

    @property
    def marca(self):
        return self.__marca
    
    @marca.setter
    def set_marca(self, marca): 
        self.__marca = marca

    @property
    def modelo(self):
        return self.__modelo
    
    @modelo.setter
    def set_modelo(self, modelo): 
        self.__modelo = modelo
    
    @property
    def cor(self):
        return self.__cor
    
    @modelo.setter
    def set_cor(self, cor): 
        self.__cor = cor

    @property
    def preco(self):
        return self.__preco
    
    @preco.setter
    def set_preco(self, preco): 
        self.__preco = preco