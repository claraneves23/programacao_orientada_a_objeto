class novo_automovel:
    def __init__(self,marca="", modelo="", cor="",preco=0):
        self._marca = marca
        self._modelo = modelo
        self._cor = cor 
        self._preco = preco

    @property
    def marca(self):
        return self._marca
    
    @marca.setter
    def set_marca(self, marca): 
        self._marca = marca

    @property
    def modelo(self):
        return self._modelo
    
    @modelo.setter
    def set_modelo(self, modelo): 
        self._modelo = modelo
    
    @property
    def cor(self):
        return self._cor
    
    @modelo.setter
    def set_cor(self, cor): 
        self._cor = cor

    @property
    def preco(self):
        return self._preco
    
    @preco.setter
    def set_preco(self, preco): 
        self._preco = preco