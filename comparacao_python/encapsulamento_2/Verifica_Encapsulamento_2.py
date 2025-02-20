from encapsulamento_1.Acesso_Numeros import Acesso_Numeros

class Verifica_Encapsulamento_2:
    @staticmethod
    def main():
        chave = Acesso_Numeros()

        #chave.a = 10; ENCAPSULAMENTO (package-private) NÃO PERMITE ACESSO DE FORA DO PACOTE
        chave.setNumero("a",10)
        chave.b = 20
        #chave.c = 30; NÃO É POSSÍVEL ACESSAR VARIÁVEL PRIVATE DIRETAMENTE DE FORA DA CLASSE
        chave.setNumero("c", 30)
        #chave.d = 40; NÃO É POSSÍVEL ACESSAR VARIÁVEL PROTECTED DIRETAMENTE DE FORA DO PACOTE
        chave.setNumero("d", 40)

        chave.mostra_numero();

if __name__ == "__main__":
     Verifica_Encapsulamento_2.main()