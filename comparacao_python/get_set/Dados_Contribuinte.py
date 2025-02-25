class Dados_Contribuinte:
    def __init__(self, nome="", cpf="", cnpj="", cartao=""):
        self._nome = nome
        self._cpf = cpf
        self._cnpj = cnpj
        self._cartao = cartao

    @property
    def nome(self):
        return self._nome
    
    @nome.setter
    def set_nome(self, nome): 
        self._nome = nome

    @property
    def cpf(self):
        return self._cpf
    
    @cpf.setter
    def set_cpf(self, cpf): 
        self._cpf = cpf

    @property
    def cnpj(self):
        return self._cpf

    @cnpj.setter
    def set_cnpj(self, cnpj): 
        self._cnpj = cnpj

    @property
    def cartao(self):
        return self._cartao

    @cartao.setter
    def set_cartao(self, cartao): 
        self._cartao = cartao

   
    
    

