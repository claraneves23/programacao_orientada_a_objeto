class Dados_Contribuinte:
    def __init__(self, nome="", cpf="", cnpj="", cartao=""):
        self.__nome = nome
        self.__cpf = cpf
        self.__cnpj = cnpj
        self.__cartao = cartao

    @property
    def nome(self):
        return self.__nome
    
    @nome.setter
    def set_nome(self, nome): 
        self.__nome = nome

    @property
    def cpf(self):
        return self.__cpf
    
    @cpf.setter
    def set_cpf(self, cpf): 
        self.__cpf = cpf

    @property
    def cnpj(self):
        return self.__cnpj

    @cnpj.setter
    def set_cnpj(self, cnpj): 
        self.__cnpj = cnpj

    @property
    def cartao(self):
        return self.__cartao

    @cartao.setter
    def set_cartao(self, cartao): 
        self.__cartao = cartao

   
    
    

